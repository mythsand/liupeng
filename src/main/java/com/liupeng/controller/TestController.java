package com.liupeng.controller;

import com.liupeng.repository.AdminRepository;
import com.liupeng.repository.ProjectRepository;
import com.liupeng.repository.StuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by mythsand on 22/04/2017.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    StuRepository stuRepository;
    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    AdminRepository adminRepository;

    @RequestMapping("test")
    public List<?> test(){
        List stu = projectRepository.findAll();
        stu.addAll(stuRepository.findAll());
        stu.addAll(adminRepository.findAll());
//        stu.addAll(projectRepository.findAll());

        return stu;
    }
    @RequestMapping("project")
    public String project(){
        return "/admin/project";
    }

}
