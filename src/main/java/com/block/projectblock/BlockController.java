package com.block.projectblock;


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
    public List<MBlock> listar(){
        return  servBlock.list();
    }
    @PostMapping
    public  MBlock create(@RequestBody MBlock block){
        return servBlock.createBlock(block);
    }
    @PutMapping
    public  MBlock update(@RequestBody MBlock block){
        return servBlock.updateBlock(block);
    }
    @DeleteMapping
    public  void delete(@RequestBody MBlock block){
        servBlock.deleteBlock(block);
    }
}