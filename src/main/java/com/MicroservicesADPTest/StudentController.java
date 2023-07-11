package com.MicroservicesADPTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentDataRepository   studentDataRepository;
    @Autowired
     StudentReportRepository studentReportRepository;

    @GetMapping()
    public String getMessageByPath(@PathVariable String studentName){
        return"HELLO" +S
    }

}
