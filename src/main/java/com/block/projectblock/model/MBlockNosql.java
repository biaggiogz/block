package com.block.projectblock.model;


import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.annotation.Documented;
import java.math.BigInteger;
import java.util.List;


@Document(collection = "mBlockNosql")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class MBlockNosql implements Serializable {
    @Id
    @Field(name = "_id")
    String hash;
    String difficulty,merkleRoot,version,nonce,bits,blockSize,strippedSize;
    Float height,weight,blockReward,feeReward,txCount,txVolume;
    int confirmations;
    String time;
    @Field(write = Field.Write.NON_NULL)
    List<PoolNosql> pools;

}