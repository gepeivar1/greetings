package dev.toktab.clevercloudspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/")
    public String getGreeting(){
        return "qurda html tu shen gvaswavli javaze dagerxeva braat :))";
    }
}
