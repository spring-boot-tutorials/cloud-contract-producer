package com.example.spring_cloud_contract.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @Autowired
    private DefaultService defaultService;

    /**
     * http://localhost:9090/validate/even-number?number=NUMBER_HERE
     * @param number
     * @return
     */
    @GetMapping("/validate/even-number")
    public String isNumberEven(@RequestParam("number") Integer number) {
        return defaultService.isEven(number);
    }
}
