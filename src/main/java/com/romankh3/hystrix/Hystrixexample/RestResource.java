package com.romankh3.hystrix.Hystrixexample;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestResource {

    @HystrixCommand(fallbackMethod = "fallBackMethod",
                    commandKey = "hello",
                    groupKey = "hello")
    @GetMapping("/hello")
    public String hello() {
        // something going wrong
        if(RandomUtils.nextBoolean()) {
            throw new RuntimeException("failed!");
        }
        return "Hello world!";
    }

    public String fallBackMethod() {
        return "fallBackHello";
    }


}
