package com.eventra.eventmanagementservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("event")
public class EventManagementController {
    @GetMapping("hello")
    public String HelloWorld(){
        return "Hello World";
    }
}
