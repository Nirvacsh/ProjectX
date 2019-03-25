package com.example.projectx.Controllers;

import com.example.projectx.Domain.DocxContext;
import com.example.projectx.Repos.DocxRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private DocxRepos docxRepos;

    @PostMapping
    public String add(@RequestParam String name, Map<String, Object> model) {
        DocxContext content = new DocxContext(name);
       
        return "main";
    }
}
