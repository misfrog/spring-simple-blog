package com.misfrog.blog.index;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index/index";
    }
}
