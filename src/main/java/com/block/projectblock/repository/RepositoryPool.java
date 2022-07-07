package com.block.projectblock.repository;

import com.block.projectblock.model.Pool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RepositoryPool extends JpaRepository<Pool,Integer> {


    @Query("select p from Pool p where p.name = ?1")
    public Optional<Pool> findByName(String name);
}
