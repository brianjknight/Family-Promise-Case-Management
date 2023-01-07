package com.bloomtechlabs.fp.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * {@link HomeController} is a controller for the home page.
 */
@Controller
public class HomeController {
    
    /**
     * {@link HomeController#home(Model, OidcUser)} returns the home page.
     *
     * @param model the model
     * @param principal the authentication principal
     * @return the home page index
     */
    @GetMapping("/")
    public String home(Model model, @AuthenticationPrincipal OidcUser principal) {
        return "index";
    }
}
