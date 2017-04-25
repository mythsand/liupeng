package com.liupeng.controller;

import com.liupeng.repository.ProjectRepository;
import com.liupeng.repository.StuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by mythsand on 17/04/2017.
 */
@Controller
@RequestMapping("stu")
public class StudentController {

    @Autowired
    HttpServletRequest httpServletRequest;

    @Autowired
    StuRepository stuRepository;

    @Autowired
    ProjectRepository projectRepository;

    @RequestMapping("index")
    public String index(){
        return "/stu/index";
    }
    @RequestMapping("")
    public String index1(){
        return "/stu/index";
    }
    @RequestMapping("dashboard")
    public String dashboard(){
        return "/stu/dashboard";
    }
    @RequestMapping("blog-new")
    public String blogBlog(){
        return "/stu/blog-new";
    }
    @RequestMapping("blog-table")
    public String blogTable(){
        return "/stu/blog-table";
    }
    @RequestMapping("blog-timeline")
    public String blogTimeline(){
        return "/stu/blog-timeline";
    }
    @RequestMapping("comments-timeline")
    public String commentsTimeLine(){
        return "/stu/comments-timeline";
    }
    @RequestMapping("files")
    public String files(ModelMap modelMap){
        modelMap.addAttribute("projects", projectRepository.findAll());
        return "/stu/files";
    }
    @RequestMapping("files-upload")
    public String filesUp(){
        return "/stu/files-upload";
    }
    @RequestMapping("icon-fonts")
    public String iconFonts(){
        return "/stu/icon-fonts";
    }
    @RequestMapping("page-new")
    public String pageNew(){
        return "/stu/page-new";
    }
    @RequestMapping("pages-table")
    public String pageTable(ModelMap modelMap){
        modelMap.addAttribute("students", stuRepository.findByTeammem("1"));
        return "/stu/pages-table";
    }
    @RequestMapping("page-timeline")
    public String pageTimeLine(){return "/stu/page-timeline";}
    @RequestMapping("statistics")
    public String statistics(){
        return "/stu/statistics";
    }
    @RequestMapping("ui-elements")
    public String uiElements(){
        return "/stu/ui-elements";
    }
    @RequestMapping("users")
    public String users(){
        return "/stu/users";
    }

    @RequestMapping(value = "file-upload", method = RequestMethod.POST)
    public String fileUpload(@RequestParam("file")MultipartFile file, @RequestParam("project_id")String projectid){
        String projectId = projectid;
        if(!file.isEmpty()){
            String filepath = httpServletRequest.getSession().getServletContext().getRealPath("/")+"upload/"
                    + file.getOriginalFilename();
            System.out.println("filepath is : "+ filepath);
            try {
                file.transferTo(new File(filepath));
                stuRepository.saveFile(file.getOriginalFilename(), filepath, projectId);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "/stu/files-upload";
    }


}
