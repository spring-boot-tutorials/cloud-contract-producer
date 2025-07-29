package com.example.spring_cloud_contract.producer;

import org.springframework.stereotype.Service;

@Service
public class DefaultService {

    public String isEven(Integer number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
}
