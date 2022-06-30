package com.block.projectblock.repository;

import com.block.projectblock.model.MBlock;
import com.block.projectblock.model.MBlockNosql;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryMBlockNosql extends MongoRepository<MBlockNosql,String> {
}