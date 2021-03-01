package com.hong.config.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HealthController {

    @GetMapping(value = "/health")
    public ModelAndView health() {
        return new ModelAndView("forward:/actuator/health");
    }
}
