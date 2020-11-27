package com.tangyu.springmvc.test;

import com.tangyu.springmvc.config.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class HomeControllerTest {

    @Test
    public void testHomeController() {
        HomeController homeController = new HomeController();
        MockMvc mock = MockMvcBuilders.standaloneSetup(homeController).build();
        try {
            mock.perform(MockMvcRequestBuilders.get("/")).andExpect(view().name("home"));
        } catch (Exception e) {
            e.printStackTrace();
        }
//        while(true)
//        {
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }
}