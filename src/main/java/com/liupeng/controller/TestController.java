package com.liupeng.controller;

import com.liupeng.model.StudentEntity;
import com.liupeng.repository.AdminRepository;
import com.liupeng.repository.ProjectRepository;
import com.liupeng.repository.StuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
        return "/admin/project-list";
    }

    @RequestMapping("addmore")
    @ResponseBody
    public ResponseEntity<String> addmore(){
        StudentEntity  studentEntity = new StudentEntity();
        studentEntity.setId(6);
        studentEntity.setCollege("CS");
        studentEntity.setMemberByTeamId(2);
        studentEntity.setName("2345");
        studentEntity.setPasswd("12345");
        stuRepository.saveAndFlush(studentEntity);

        return new ResponseEntity<>("SDFSDF", HttpStatus.OK);
    }

}
