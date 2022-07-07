package com.block.projectblock.controller;

import com.block.projectblock.model.Pool;
import com.block.projectblock.repository.RepositoryPool;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pool")
public class Poolcontroller {

    private final RepositoryPool repositoryPool;

    public Poolcontroller(RepositoryPool repositoryPool) {
        this.repositoryPool = repositoryPool;
    }

    @PostMapping
    public Pool createp(@RequestBody Pool p){

        return repositoryPool.save(p);
    }
}
