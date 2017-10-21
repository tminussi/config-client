package com.javaonthecloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by thales on 21/10/17.
 */
@RestController
public class ConfigClientController {

    @Value("${oriental-mythological-creature}")
    private String orientalMythologicalCreature;

    @GetMapping("/favorite-oriental-mythological-creature")
    public String getFavoriteMythologicalCreature() {
        return "My favorite oriental mythological creature is " + this.orientalMythologicalCreature;
    }
}
