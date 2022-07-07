package com.block.projectblock.services;

import com.block.projectblock.model.Pool;
import com.block.projectblock.repository.RepositoryPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ServicePool {

    @Autowired
    RepositoryPool repositoryPool;

    public Pool findbyName(String name){
       Optional<Pool> p =  repositoryPool.findByName(name);
        return p.get();
    }
}
