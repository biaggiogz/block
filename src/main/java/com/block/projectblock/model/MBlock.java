package com.block.projectblock.model;


import com.google.j2objc.annotations.ObjectiveCName;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="BLOCK_TABLE")
@Data
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
    @OneToMany
    @JoinColumn(name = "poolfk")
    List<Pool> pools;



}