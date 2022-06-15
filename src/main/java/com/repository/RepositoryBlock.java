package com.repository;

import com.persitence.entity.Block;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryBlock extends JpaRepository<Block,String> {
}
