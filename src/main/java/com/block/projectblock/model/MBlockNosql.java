package com.block.projectblock.model;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.lang.annotation.Documented;
import java.util.List;


@Document(collection = "mBlockNosql")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class MBlockNosql {
    @Id
    String hash;
    String difficulty,merkleRoot,version,nonce,bits,blockSize,strippedSize;
    Float height,weight,blockReward,feeReward,txCount,txVolume;
    int confirmations;
    String time;
    @OneToMany
    @JoinColumn(name = "poolfk")
    List<PoolNosql> pools;

}