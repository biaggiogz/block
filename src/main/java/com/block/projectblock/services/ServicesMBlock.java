package com.block.projectblock.services;

import com.block.projectblock.dto.DtoMblock;
import com.block.projectblock.mapper.DtoMBlockMapper;
import com.block.projectblock.model.*;
import com.block.projectblock.repository.RepositoryMBlock;
import com.block.projectblock.repository.RepositoryMBlockNosql;
import com.block.projectblock.repository.RepositoryPool;
import com.block.projectblock.repository.RepositoryPoolNosql;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesMBlock {
    private final RepositoryMBlock repoBlock;

    private final RepositoryMBlockNosql repoBlockNOSQL;

    private final RepositoryPool repositoryPool;

    private final ServicePool servicePool;

    private final DtoMBlockMapper mapper;

    private final RepositoryPoolNosql repositoryPoolNosql;

    public ServicesMBlock(RepositoryMBlock repoBlock, RepositoryMBlockNosql repoBlockNOSQL, RepositoryPool repositoryPool, ServicePool servicePool, DtoMBlockMapper mapper, RepositoryPoolNosql repositoryPoolNosql) {
        this.repoBlock = repoBlock;
        this.repoBlockNOSQL = repoBlockNOSQL;
        this.repositoryPool = repositoryPool;
        this.servicePool = servicePool;
        this.mapper = mapper;
        this.repositoryPoolNosql = repositoryPoolNosql;
    }
    //----------------SQL_Services--------------------------------//
    public MBlock createBlock(DtoMblock block){
        MBlock mb = mapper.map(block);
        return repoBlock.save(mb);
    }
    public MBlock updateBlockByPool(String hash,  List<Pool> pools){
        MBlock blockupdate = finbyHash(hash);
        if(blockupdate!=null){
            for(int x = 0;  x < pools.size(); x++ ){
                repositoryPool.save(pools.get(x));
            }
            blockupdate.setPools(pools);
            return repoBlock.save(blockupdate);
        }
        return null;

    }

    public MBlockNosql updateBlockByPoolNosql(String hash,  List<PoolNosql> pools){
        MBlockNosql blockupdate = finbyHashNOSQL(hash);
        if(blockupdate!=null){
            for(int x = 0;  x < pools.size(); x++ ){
                repositoryPoolNosql.save(pools.get(x));
            }
            blockupdate.setPools(pools);
            return repoBlockNOSQL.save(blockupdate);
        }
        return null;

    }

    public MBlock updateBlock(String hash,MBlock block){
        MBlock blockupdate = finbyHash(hash);
        if(blockupdate!=null){
            blockupdate.setTxCount(block.getTxCount());
            blockupdate.setHeight(block.getHeight());
            blockupdate.setConfirmations(block.getConfirmations());
            return repoBlock.save(blockupdate);
        }
        return null;

    }

    public Iterable<MBlock> list(){
        return repoBlock.findAll();
    }

    public void deleteBlock(MBlock block){
        repoBlock.delete(block);
    }

    public void deletebyHash(String hash) {
        Optional<MBlock> optionalTask = repoBlock.findById(hash);
        if (optionalTask.isEmpty()) {
            throw new Exceptions("Task not found", HttpStatus.NOT_FOUND);
        }
        repoBlock.delete(optionalTask.get());
    }

    public MBlock finbyHash(String hash){
        return repoBlock.findById(hash).get();
    }

    public MBlockNosql finbyHashNOSQL(String hash){
        Optional<MBlockNosql> m = repoBlockNOSQL.findByHash(hash);
        return m.get();
    }
    //----------------NoSql_Services--------------------------------//
    public Iterable<MBlockNosql> listNosql(){

        return repoBlockNOSQL.findAll();
    }
    @Async
    public MBlockNosql createBlockNosql(MBlockNosql block){
            block.setHash(block.getBits() + block.getBlockSize());
        return repoBlockNOSQL.save(block);
    }
}