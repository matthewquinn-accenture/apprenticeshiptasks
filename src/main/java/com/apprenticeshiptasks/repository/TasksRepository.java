package com.apprenticeshiptasks.repository;

import com.apprenticeshiptasks.model.Tasks;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TasksRepository{
    private static final List<Tasks> TASKS_LIST = new ArrayList<>(Arrays.asList(
      new Tasks(1, "Test1", "Test1 Description"),
      new Tasks(2, "Test2", "Test2 Description"),
      new Tasks(3, "Test3", "Test3 Description")
    ));

    public Tasks findOne(long id) {
        for(Tasks task: TASKS_LIST) {
            if(id == task.getId()){
                return task;
            }
        }
        return null;
    }

    public List<Tasks> findAll() {
        return TASKS_LIST;
    }

    public void delete(long id) {
        TASKS_LIST.remove(this.findOne(id));
    }

    public List<Tasks> submit(Tasks tasks){
        TASKS_LIST.add(tasks);
        return TASKS_LIST;
    }
}