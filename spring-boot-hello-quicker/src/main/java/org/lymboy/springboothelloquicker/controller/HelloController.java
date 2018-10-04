package org.lymboy.springboothelloquicker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sairo
 * @since 2018/10/4 10:12
 */
@ResponseBody
@Controller
public class HelloController {


    @RequestMapping("/hello")
    public String hello() {
        return "Hello World Quicker";
    }
}
