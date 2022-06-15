package com.services;

import com.persitence.entity.Block;
import com.repository.RepositoryBlock;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesBlock {
    private final RepositoryBlock repoBlock;

    public ServicesBlock(RepositoryBlock repoBlock) {
        this.repoBlock = repoBlock;
    }

    public Block createBlock(Block block){
        return repoBlock.save(block);
    }
    public Block updateBlock(Block block){
        return repoBlock.save(block);
    }
    public List<Block> list(){
        return repoBlock.findAll();
    }
    public void deleteBlock(Block block){
         repoBlock.delete(block);
    }
}
