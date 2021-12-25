package com.example.test.controllers;

import com.example.test.models.ExModel;
import com.example.test.service.ExService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exModel")
public class ExControler {
    @Autowired
    private ExService exService;

    @GetMapping("")
    public List<ExModel> getExData() {
        return exService.getExData();
    }

    @PostMapping("")
    public List<ExModel> postExData(@RequestBody ExModel exModel) {
        return exService.postExData(exModel);
    }
}
