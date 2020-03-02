package com.teste.apisul.Contract;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("test")
public class Test {
    @GetMapping(path = "1")
    public String Test1() {
        return "OK!";
    }
}
