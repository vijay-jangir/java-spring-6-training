package com.vijayjangir.spring6webapp.controllers;

import com.vijayjangir.spring6webapp.services.AuthorService;
import com.vijayjangir.spring6webapp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/authors")
    public String getBook(Model model) {
        // the attribute defined here are passed to template html
        model.addAttribute("authors1", authorService.findAll());
        // the return here returns the rendered template by this name!
        return "authors";
    }

}
