import React from 'react'
import Link from 'next/link'
import Layout from '../components/Layout'
import { FooterActions } from '../components/Footer'
import { ButtonLink } from '../components/Buttons'

export default function Locations() {
  return (
    <Layout title="Locations">
      <h2>Locations</h2>
      <p>Find a ladder near you...</p>
    </Layout>
  )
}