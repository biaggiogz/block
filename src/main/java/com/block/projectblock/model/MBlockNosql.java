package com.block.projectblock.model;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.lang.annotation.Documented;


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

}