package com.springBoot.TechnicalAssessment.Controller;

import com.springBoot.TechnicalAssessment.Service.StudentMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StudentMaterialController {

    @Autowired
    StudentMaterialService studentMaterialService;


}
