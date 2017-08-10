package com.apprenticeshiptasks.controller;

import com.apprenticeshiptasks.repository.TasksRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TasksControllerTest {
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Autowired
    private TasksRepository tasksRepositoryMock;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void viewOneTask() throws Exception {
        this.mockMvc.perform(get("/task/{id}",1))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("task"))
                .andExpect(model().attribute("task", tasksRepositoryMock.findOne(1)));
    }

    @Test
    public void deleteOneTask() throws Exception {
        this.mockMvc.perform(get("/task/delete/{id}",2))
                .andDo(print())
                .andExpect(status().is(302))
                .andExpect(redirectedUrl("/"));
    }

    @Test
    public void addTask() throws Exception {
        this.mockMvc.perform(get("/task/add"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("add-task"));
    }
}
