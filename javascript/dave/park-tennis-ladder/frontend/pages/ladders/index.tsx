import Link from 'next/link'
import { useRouter } from 'next/router'
import styled from 'styled-components'
import Layout from '../../components/Layout'
import Loading from '../../components/Loading'
import { List, ListItem } from '../../components/List'
import { ProductType } from '../../types'
import { FooterActions } from '../../components/Footer'
import LadderList from '../../components/LadderList'
import { ButtonLink } from '../../components/Buttons'
import { URLS } from '../../components/Nav'
import { useQuery } from "@apollo/react-hooks";
import { gql } from "apollo-boost";
import Error from '../../components/Error'
import moment from 'moment'
import Tabs, { TabPanel } from '../../components/Tabs'

const H2 = styled.h2`
  font-size: 2rem;
`

const QUERY = gql`
  query($current: JSON, $upcoming: JSON, $archive: JSON) {
    currentLadders: ladders(where: $current) {
      id
      name
      start_date
      end_date
      ranks (sort: "rank:asc") {
        id 
        user {
          id
          avatar {
            formats 
          }
        }        
      }
    }
    upcomingLadders: ladders(where: $upcoming) {
      id
      name
      start_date
      end_date
      ranks (sort: "rank:asc") {
        id 
        user {
          id
          avatar {
            formats  
          }
        }
      }
    }    
    archiveLadders: ladders(where: $archive) {
      id
      name
      start_date
      end_date
      ranks (sort: "rank:asc") {
        id 
        user {
          id
          avatar {
            formats 
          }
        }
      }
    }    
  }
`;

/**
 * Displays a list of ladders
 */
export default function Ladders() {
  const nowDate = moment().format('YYYY-MM-DD');
  const upcoming = { "start_date_gt": nowDate }
  const current = { "start_date_lte": nowDate, "end_date_gte": nowDate }
  const archive = { "end_date_lt": nowDate }
  const { loading, error, data } = useQuery(QUERY, {
    variables: { current, upcoming, archive }
  })
  if (error) return <Error error='Error loading' />
  if (loading) return <Loading />
  return (
    <Layout title="Play local tennis ladder leagues">
      <H2>Bristol</H2>
      <Tabs>
        <TabPanel label="Current">
          <LadderList items={data.currentLadders} emptyMessage="No current ladders" />
          <LadderList items={data.upcomingLadders} emptyMessage="" />
        </TabPanel>
        <TabPanel label="Archive">
          <LadderList items={data.archiveLadders} emptyMessage="No archived ladders" />
        </TabPanel>
      </Tabs>
      <FooterActions>
        <Link href={URLS.laddersFind()} passHref>
          <ButtonLink>
            Find A Ladder
            </ButtonLink>
        </Link>
      </FooterActions>
    </Layout>
  )
}