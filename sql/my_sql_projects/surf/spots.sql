-- noinspection SqlNoDataSourceInspectionForFile

CREATE TABLE spots (
  spot_id INTEGER,
  name VARCHAR(20),
  address VARCHAR(255),
  description TEXT,
  date_visited DATE,
  PRIMARY KEY (spot_id)
 );
 
INSERT INTO spots values (
  1, 
  'The Wave',
  'Washingpool Farm, Main Rd, Easter Compton, Bristol BS35 5RE',
  'The Wave is an inland surf destination where everyone can surf on consistent, safe waves all year round. Fantastic variety of waves to suit all levels of surfer, from beginner to expert.',
  '2021-08-15');
INSERT INTO spots values (
  2, 
  'Croyde',
  'Croyde Bay, Croyde, Braunton EX33 1NU',
  'Thought to be one of the best places to surf in the UK, in competition with Cornish waves, Croyde gets our vote any day. The waves are good on all tides, but especially at low tide.',
  '2020-09-10'
);

INSERT INTO spots values (
  3, 
  'Fistral',
  'Fistral Beach, Newquay, Cornwall TR7 1HY',
  'This splendid beach offers excellent water for surfing and body boarding.',
  '2020-08-06'
);

select * from spots;