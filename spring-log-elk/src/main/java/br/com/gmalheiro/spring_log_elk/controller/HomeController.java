package br.com.gmalheiro.spring_log_elk.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info( "Welcome home page " + localDateTime);
        return  "Welcome to home page";
    }

    @GetMapping("/logs")
    public String logsPage() {
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info( "Welcome log page " + localDateTime);
        return  "Welcome to logs page";
    }
}
