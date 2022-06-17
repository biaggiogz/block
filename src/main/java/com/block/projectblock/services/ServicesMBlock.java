package com.block.projectblock.services;

import com.block.projectblock.dto.DtoMblock;
import com.block.projectblock.mapper.DtoMBlockMapper;
import com.block.projectblock.model.Exceptions;
import com.block.projectblock.model.MBlock;
import com.block.projectblock.repository.RepositoryMBlock;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesMBlock {
    private final RepositoryMBlock repoBlock;
    private final DtoMBlockMapper mapper;

    public ServicesMBlock(RepositoryMBlock repoBlock, DtoMBlockMapper mapper) {
        this.repoBlock = repoBlock;
        this.mapper = mapper;
    }

    public MBlock createBlock(DtoMblock block){
        MBlock mb = mapper.map(block);
        return repoBlock.save(mb);
    }
    public MBlock updateBlock(MBlock block){
        return repoBlock.save(block);
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
}