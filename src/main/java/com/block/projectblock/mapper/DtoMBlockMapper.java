package com.block.projectblock.mapper;

import com.block.projectblock.dto.DtoMblock;
import com.block.projectblock.model.MBlock;
import com.google.common.hash.Hashing;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;

@Component
public class DtoMBlockMapper implements  mapperIO<DtoMblock, MBlock> {
    Date tt= new Date();
    @Override
    public MBlock map(DtoMblock in) {

        MBlock mb = new MBlock();
        mb.setHash(in.getBits()+in.getBlockSize());
        mb.setDifficulty(in.getDifficulty());
        mb.setMerkleRoot(in.getMerkleRoot());
        mb.setVersion(in.getVersion());
        mb.setNonce(in.getNonce());
        mb.setBits(in.getBits());
        mb.setHeight(in.getHeight());
        mb.setBlockReward(in.getBlockReward());
        mb.setFeeReward(in.getFeeReward());
        mb.setTxCount(in.getTxCount());
        mb.setTxCount(in.getTxVolume());
        mb.setConfirmations(in.getConfirmations());
        mb.setBlockSize(in.getBlockSize());
        mb.setStrippedSize(in.getStrippedSize());
        mb.setTime(String.valueOf(tt.getTime()));
        return mb;
    }
}
