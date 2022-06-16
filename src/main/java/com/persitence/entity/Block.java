package com.persitence.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;



@Entity
@Table(name="BLOCK_TABLE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Block {
    @Id
    String hash;
    String difficulty,merkleRoot,version,nonce,bits;
    Float height,weight,blockReward,feeReward,txCount,txVolume;
    int confirmations;
    byte blockSize,strippedSize;
    String time;

}
