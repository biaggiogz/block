CREATE TABLE block (
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
   time TIMESTAMP,
   CONSTRAINT pk_block PRIMARY KEY (hash)
);

