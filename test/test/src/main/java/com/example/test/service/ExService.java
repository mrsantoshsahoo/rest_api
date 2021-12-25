package com.example.test.service;

import com.example.test.models.ExModel;
import com.example.test.repository.ExRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExService {

    @Autowired
    private ExRepository exRepository;

    public List<ExModel> getExData() {
        return exRepository.findAll();
    }

    public List<ExModel> postExData(ExModel exModel) {
        exRepository.save(exModel);
        return exRepository.findAll();
    }
}
