package com.block.projectblock;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesBlock {
    private final RepositoryBlock repoBlock;

    public ServicesBlock(RepositoryBlock repoBlock) {
        this.repoBlock = repoBlock;
    }

    public MBlock createBlock(MBlock block){
        return repoBlock.save(block);
    }
    public MBlock updateBlock(MBlock block){
        return repoBlock.save(block);
    }
    public List<MBlock> list(){
        return repoBlock.findAll();
    }
    public void deleteBlock(MBlock block){
        repoBlock.delete(block);
    }
}