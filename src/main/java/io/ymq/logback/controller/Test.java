package io.ymq.logback.controller;
import io.ymq.logback.config.annotation.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping(value="/hello")
public class Test {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Log("测试类的log")
    @RequestMapping(value = "/world", method= RequestMethod.POST)
    public String helloWorld(@RequestParam("id") String id){
        LOGGER.info("请求参数", id);
        return  "645646464";

    }
}
