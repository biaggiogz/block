package com.block.projectblock.controller;


import com.block.projectblock.dto.DtoMblock;
import com.block.projectblock.model.MBlock;
import com.block.projectblock.model.MBlockNosql;
import com.block.projectblock.model.Pool;
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

    //----------------SQL_REST--------------------------------//
    @GetMapping("/list")
    public Iterable<MBlock> listar(){return  servBlock.list();}

    @GetMapping("/list/{hash}")
    public MBlock listarByHash(@PathVariable String hash){
        return  servBlock.finbyHash(hash);
    }

    @PostMapping
    public  MBlock create(@RequestBody DtoMblock block){
        return servBlock.createBlock(block);
    }

    @PostMapping("/post/{blockdto}")
    public  MBlock createdirect(@PathVariable DtoMblock block){
        return servBlock.createBlock(block);
    }

    @DeleteMapping("/{hash}")
    public ResponseEntity<Void> delete(@PathVariable("hash") String hash) {
        servBlock.deletebyHash(hash);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/update/{hash}")
    public  MBlock update(@PathVariable String hash, @RequestBody MBlock block){
        return servBlock.updateBlock(hash,block);
    }

    @PutMapping("/update/pool/{hash}")
    public  MBlock updateByPool(@PathVariable String hash, @RequestBody MBlock block,@PathVariable String pool){
        return servBlock.updateBlockByPool(hash,block, pool);
    }
    @PutMapping("/update/pool2/{hash}")
    public  MBlock updateByPool2(@PathVariable String hash, @RequestBody Pool pool){
        return servBlock.updateBlockByPool2(hash ,pool);
    }

    //----------------NOSQL_REST--------------------------------//
    @GetMapping("/listNosql")
    public Iterable<MBlockNosql> listarNosql(){
        return  servBlock.listNosql();
    }

}