package com.block.projectblock.repository;

import com.block.projectblock.dto.DtoMblock;
import com.block.projectblock.model.MBlock;
import com.block.projectblock.model.MBlockNosql;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Repository
public interface RepositoryMBlockNosql extends MongoRepository<MBlockNosql,String> {

    @Query("{ hash : ?0 }")
    Optional<MBlockNosql> findByHash(String hash);


}