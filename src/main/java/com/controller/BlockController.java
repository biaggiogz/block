package com.controller;

import com.persitence.entity.Block;
import com.services.ServicesBlock;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/block")
public class BlockController {

    private final ServicesBlock servBlock;

    public BlockController(ServicesBlock servBlock) {
        this.servBlock = servBlock;
    }
    @GetMapping("/list")
    public List<Block> listar(){
        return  servBlock.list();
    }
    @PostMapping
    public  Block create(@RequestBody Block block){
        return servBlock.createBlock(block);
    }
    @PutMapping
    public  Block update(@RequestBody Block block){
        return servBlock.updateBlock(block);
    }
    @DeleteMapping
    public  void delete(@RequestBody Block block){
         servBlock.deleteBlock(block);
    }
}
