package com.apprenticeshiptasks.repository;

import com.apprenticeshiptasks.model.Tasks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository extends CrudRepository<Tasks, Long>{
}
