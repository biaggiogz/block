package com.block.projectblock.dto;

import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.hash.HashingInputStream;
import lombok.Data;

@Data
public class DtoMblock {


    String difficulty,merkleRoot,version,nonce,bits;
    Float height,weight,blockReward,feeReward,txCount,txVolume;
    int confirmations;
    byte blockSize,strippedSize;

}
