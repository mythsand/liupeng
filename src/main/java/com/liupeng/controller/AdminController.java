package com.liupeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mythsand on 12/html/04/html/2017.
 */
@Controller
public class AdminController {
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
    @RequestMapping("/admin/project")
    public String adminProject(){return "/admin/project";}
}
