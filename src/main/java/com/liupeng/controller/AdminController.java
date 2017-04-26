package com.liupeng.controller;

import com.liupeng.model.AdminEntity;
import com.liupeng.model.ProjectEntity;
import com.liupeng.model.StudentEntity;
import com.liupeng.repository.AdminRepository;
import com.liupeng.repository.ProjectRepository;
import com.liupeng.repository.StuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by mythsand on 12/admin/04/admin/2017.
 */
@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    AdminRepository adminRepository;
    @Autowired
    StuRepository stuRepository;

    @RequestMapping("index")
    public String index(){
        return "/admin/index";
    }
    @RequestMapping("")
    public String index1(){
        return "/admin/index";
    }
    @RequestMapping("dashboard")
    public String dashboard(){
        return "/admin/dashboard";
    }
    @RequestMapping("blog-new")
    public String blogBlog(){
        return "/admin/blog-new";
    }
    @RequestMapping("blog-table")
    public String blogTable(){
        return "/admin/blog-table";
    }
    @RequestMapping("blog-timeline")
    public String blogTimeline(){
        return "/admin/blog-timeline";
    }
    @RequestMapping("comments-timeline")
    public String commentsTimeLine(){
        return "/admin/comments-timeline";
    }
    @RequestMapping("files")
    public String files(){
        return "/admin/files";
    }
    @RequestMapping("files-upload")
    public String filesUp(){
        return "/admin/files-upload";
    }
    @RequestMapping("icon-fonts")
    public String iconFonts(){
        return "/admin/icon-fonts";
    }
    @RequestMapping("page-new")
    public String pageNew(){
        return "/admin/page-new";
    }
    @RequestMapping("pages-table")
    public String pageTable(){
        return "/admin/pages-table";
    }
    @RequestMapping("page-timeline")
    public String pageTimeLine(){return "/admin/page-timeline";}
    @RequestMapping("statistics")
    public String statistics(){
        return "/admin/statistics";
    }
    @RequestMapping("ui-elements")
    public String uiElements(){
        return "/admin/ui-elements";
    }
    @RequestMapping("users")
    public String users(){
        return "/admin/users";
    }
    @RequestMapping("project-change-table")
    public String projectChangeTable(){return "/admin/project-change";}
    @RequestMapping("ProjectList")
    public String adminProjectList(ModelMap modelMap){
        List<ProjectEntity> projectEntities=projectRepository.findAll();
        System.out.println(projectEntities.size());
        modelMap.addAttribute("projects",projectEntities);
        return "/admin/project-list";
    }
    @RequestMapping("ProjectChange")
    public String adminProjectChange(@RequestParam String project_no, @RequestParam String title, @RequestParam String team_no, @RequestParam String start_date, @RequestParam String end_date, @RequestParam String description, ModelMap modelMap){
        Date startDate=Date.valueOf(start_date);
        Date endDate=Date.valueOf(end_date);
        projectRepository.adminUpdateProject(project_no,title,team_no,startDate,endDate,description);
        projectRepository.flush();
        List<ProjectEntity> projectEntities=projectRepository.findAll();
        modelMap.addAttribute("projects",projectEntities);
        return "admin/project-list";
    }
    //查看学生列表
    @RequestMapping(value = "admin-student-list",method = GET)
    public String studentList(ModelMap modelMap){
        List<StudentEntity> studentEntityList=stuRepository.findAll();
        modelMap.addAttribute("students",studentEntityList);
        return "admin/student-list";
    }
    //根据姓名查看学生的详细信息
    @RequestMapping(value = "admin-student-detail",method = GET)
    public String studentDetail(@RequestParam String name,ModelMap modelMap){
        StudentEntity student=stuRepository.findByName(name);
//        System.out.print(student.getName());
        modelMap.addAttribute(student);
        return "student-detail";
    }
    @RequestMapping(value = "adminChangePasswd" ,method= GET)
    public String adminChangePasswd(){
        adminRepository.updatePasswd("asdf","admin");
        return "project-list";
    }
}
