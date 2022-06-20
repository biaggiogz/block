package com.block.projectblock.services;

import com.block.projectblock.dto.DtoMblock;
import com.block.projectblock.mapper.DtoMBlockMapper;
import com.block.projectblock.model.Exceptions;
import com.block.projectblock.model.MBlock;
import com.block.projectblock.model.MBlockNosql;
import com.block.projectblock.repository.RepositoryMBlock;
import com.block.projectblock.repository.RepositoryMBlockNosql;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpResponse;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;

@Service
public class ServicesMBlock {
    private final RepositoryMBlock repoBlock;

    private final RepositoryMBlockNosql repoBlockNOSQL;

    private final DtoMBlockMapper mapper;

    public ServicesMBlock(RepositoryMBlock repoBlock, RepositoryMBlockNosql repoBlockNOSQL, DtoMBlockMapper mapper) {
        this.repoBlock = repoBlock;
        this.repoBlockNOSQL = repoBlockNOSQL;
        this.mapper = mapper;
    }
    //----------------SQL_Services--------------------------------//
    public MBlock createBlock(DtoMblock block){
        MBlock mb = mapper.map(block);
        return repoBlock.save(mb);
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
        repoBlock.deleteById(hash);
    }

    public MBlock finbyHash(String hash){
        return repoBlock.findById(hash)
                .get();
    }
    //----------------NoSql_Services--------------------------------//
    public Iterable<MBlockNosql> listNosql(){
        return repoBlockNOSQL.findAll();
    }
}