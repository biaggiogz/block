package com.block.projectblock.controller;


import com.block.projectblock.dto.DtoMblock;
import com.block.projectblock.model.MBlock;
import com.block.projectblock.model.MBlockNosql;
import com.block.projectblock.services.ServicesMBlock;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/block")
public class MBlockController {

    private final ServicesMBlock servBlock;

    public MBlockController(ServicesMBlock servBlock) {
        this.servBlock = servBlock;
    }
    @GetMapping("/list")
    public Iterable<MBlock> listar(){
        return  servBlock.list();
    }

    @GetMapping("/listNosql")
    public Iterable<MBlockNosql> listarNosql(){
        return  servBlock.listNosql();
    }
    @PostMapping
    public  MBlock create(@RequestBody DtoMblock block){
        return servBlock.createBlock(block);
    }
//    @PutMapping
//    public  MBlock update(@RequestBody MBlock block){
//
//        return servBlock.updateBlock(block);
//    }
    @DeleteMapping("/{hash}")
    public ResponseEntity<Void> delete(@PathVariable("hash") String hash) {
        servBlock.deletebyHash(hash);
        return ResponseEntity.noContent().build();
    }
}