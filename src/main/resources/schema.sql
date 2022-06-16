drop table if exists block_table;

CREATE TABLE block_table (
  hash VARCHAR(255) NOT NULL,
   difficulty VARCHAR(255),
   merkle_root VARCHAR(255),
   version VARCHAR(255),
   nonce VARCHAR(255),
   bits VARCHAR(255),
   height FLOAT,
   weight FLOAT,
   block_reward FLOAT,
   fee_reward FLOAT,
   tx_count FLOAT,
   tx_volume FLOAT,
   confirmations INT,
   block_size SMALLINT,
   stripped_size SMALLINT,
   time VARCHAR(255),
   CONSTRAINT pk_block_table PRIMARY KEY (hash)
);



insert into block_table(hash,difficulty,merkle_root,version,nonce,bits,height,weight,block_reward,fee_reward,tx_count,tx_volume,confirmations,block_size,stripped_size,time)
values('000000000000000000075aeb19175485c0115814aca61fe7bf16ae0986c59203','30,283,293,547,737','aa6210a9eb4d55c9f4773ac7e3f11de56651faa7e4783980e04a10f53871d430',
       '696868864','3,630,335,014','386,485,098',1.374203,3.992963,6.58,6.25,2.314,12.36,1854,2655,1247,'1655377676')