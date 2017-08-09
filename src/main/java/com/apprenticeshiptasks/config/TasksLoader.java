//package com.apprenticeshiptasks.config;
//
//
//import com.apprenticeshiptasks.model.Tasks;
//import com.apprenticeshiptasks.repository.TasksRepository;
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.stereotype.Component;
//
//@Component
//public class TasksLoader implements ApplicationListener<ContextRefreshedEvent> {
//
//    @Autowired
//    private TasksRepository tasksRepository;
//
//    private Logger log = Logger.getLogger(TasksLoader.class);
//
//    @Autowired
//    public void setTaskRepository(TasksRepository taskRepository) {
//        this.tasksRepository = tasksRepository;
//    }
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent event) {
//
//        Tasks tasks = new Tasks();
//        tasks.setName("Refactor Code");
//        tasksRepository.save(tasks);
//
//        log.info("Saved Task" + tasks.getId());
//
//        Tasks tasks1 = new Tasks();
//        tasks1.setName("Test Spring Application");
//        tasksRepository.save(tasks1);
//    }
//}
