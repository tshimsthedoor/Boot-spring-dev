package com.thedorcode.inc.thedor.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, World! What are you learning today";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        return "Hello! What are you learning today on Html?";
    }

    @RequestMapping("say-hello-jsp")

    public String sayHelloJsp() {
        return "sayHello";
    }
}
