package com.systex.springboot.demo1.test.application.reset;

import com.systex.springboot.demo1.application.rest.PointTypeController;
import com.systex.springboot.demo1.domain.common.service.PointTypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

    @WebMvcTest(PointTypeController.class)
    public class PointTypeControllerTest {
        @Autowired
        MockMvc mockMvc;
        @MockBean
        PointTypeService service;
        @Test
        void hello() {

        }
    }

