package com.block.projectblock.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="BLOCK_TABLE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class MBlock {
    @Id
    String hash;
    String difficulty,merkleRoot,version,nonce,bits,blockSize,strippedSize;
    Float height,weight,blockReward,feeReward,txCount,txVolume;
    int confirmations;
    String time;

}