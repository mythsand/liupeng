package com.liupeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mythsand on 17/04/2017.
 */
@Controller
@RequestMapping("stu")
public class StudentController {
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
    public String files(){
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
    public String pageTable(){
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
    @RequestMapping("/admin/project")
    public String adminProject(){return "/admin/project";}
}
