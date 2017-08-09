package com.apprenticeshiptasks.repository;

import com.apprenticeshiptasks.model.Tasks;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class TasksRepository{
    private static final List<Tasks> TASKS_LIST = Arrays.asList(
      new Tasks(1, "Test1", "Test1 Description"),
      new Tasks(2, "Test2", "Test2 Description"),
      new Tasks(3, "Test3", "Test3 Description")
    );

    public Tasks findOne(long id) {
        for(Tasks task: TASKS_LIST) {
            if(id == task.getId()){
                return task;
            }
        }
        return null;
    }
}