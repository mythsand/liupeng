package com.liupeng.controller;

import com.liupeng.repository.ProjectRepository;
import com.liupeng.repository.StuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by mythsand on 17/04/2017.
 */
@Controller
public class StudentController {
    @Autowired
    StuRepository stuRepository;
    @Autowired
    ProjectRepository projectRepository;


}
