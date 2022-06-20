package com.block.projectblock.repository;

import com.block.projectblock.model.MBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositoryMBlock extends CrudRepository<MBlock,String> {
}