package com.liupeng.controller;

import com.liupeng.model.AdminEntity;
import com.liupeng.model.ProjectEntity;
import com.liupeng.repository.AdminRepository;
import com.liupeng.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by mythsand on 12/html/04/html/2017.
 */
@Controller
public class AdminController {

    @Autowired
    ProjectRepository projectRepository;
    AdminRepository adminRepository;

    @RequestMapping("index")
    public String index(){
        return "/html/index";
    }
    @RequestMapping("")
    public String index1(){
        return "/html/index";
    }
    @RequestMapping("dashboard")
    public String dashboard(){
        return "/html/dashboard";
    }
    @RequestMapping("blog-new")
    public String blogBlog(){
        return "/html/blog-new";
    }
    @RequestMapping("blog-table")
    public String blogTable(){
        return "/html/blog-table";
    }
    @RequestMapping("blog-timeline")
    public String blogTimeline(){
        return "/html/blog-timeline";
    }
    @RequestMapping("comments-timeline")
    public String commentsTimeLine(){
        return "/html/comments-timeline";
    }
    @RequestMapping("files")
    public String files(){
        return "/html/files";
    }
    @RequestMapping("files-upload")
    public String filesUp(){
        return "/html/files-upload";
    }
    @RequestMapping("icon-fonts")
    public String iconFonts(){
        return "/html/icon-fonts";
    }
    @RequestMapping("page-new")
    public String pageNew(){
        return "/html/page-new";
    }
    @RequestMapping("pages-table")
    public String pageTable(){
        return "/html/pages-table";
    }
    @RequestMapping("page-timeline")
    public String pageTimeLine(){return "/html/page-timeline";}
    @RequestMapping("statistics")
    public String statistics(){
        return "/html/statistics";
    }
    @RequestMapping("ui-elements")
    public String uiElements(){
        return "/html/ui-elements";
    }
    @RequestMapping("users")
    public String users(){
        return "/html/users";
    }
    @RequestMapping("adminProjectList")
    public String adminProjectList(ModelMap modelMap){
        List<ProjectEntity> projectEntities=projectRepository.findAll();
        System.out.println(projectEntities.size());
        modelMap.addAttribute("projects",projectEntities);
        return "/admin/project-list";
    }
    @RequestMapping("adminProjectChange")
    public String adminProjectChange(@RequestParam String project_no,@RequestParam String title){
        System.out.print(title);
        return "admin/project-change";
    }
    @RequestMapping(value = "adminChangePasswd" ,method= GET)
    public String adminChangePasswd(){
        adminRepository.updatePasswd("asdf","admin");
        return "admin/project-list";
    }
}
