package com.block.projectblock.repository;

import com.block.projectblock.model.PoolNosql;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPoolNosql extends CrudRepository<PoolNosql,Integer> {
}
