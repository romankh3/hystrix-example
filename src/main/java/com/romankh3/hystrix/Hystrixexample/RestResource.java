package com.romankh3.hystrix.Hystrixexample;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestResource {

    @HystrixCommand(fallbackMethod = "fallBackMethodHello",
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

    @HystrixCommand(fallbackMethod = "fallBackMethodHelloYT",
            commandKey = "helloYT",
            groupKey = "helloYT")
    @GetMapping("/helloYT")
    public String helloYT() {
        // something going wrong
        if(RandomUtils.nextBoolean()) {
            throw new RuntimeException("failed!");
        }
        return "Hello world Youtube!";
    }

    // this method should be the same as the main method expect the name.
    public String fallBackMethodHello() {
        return "FallBack Call";
    }

    public String fallBackMethodHelloYT() {
        return "FallBacl Call YT";
    }
}
