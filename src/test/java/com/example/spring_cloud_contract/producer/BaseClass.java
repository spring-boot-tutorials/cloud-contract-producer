package com.example.spring_cloud_contract.producer;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@SpringBootTest(classes = SpringCloudContractApplication.class)
public abstract class BaseClass {

    @Autowired
    DefaultController defaultController;

//    @MockitoBean
//    DefaultService defaultService;

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(defaultController);
//        Mockito.when(defaultService.isEven(2))
//                .thenReturn("Even");
    }

}
