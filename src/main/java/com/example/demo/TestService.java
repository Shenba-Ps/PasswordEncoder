package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestRepo repo;

    public void save(Test test){

        test.setAndEncryptPassword(test.getPassword());
        repo.save(test);
    }
}
