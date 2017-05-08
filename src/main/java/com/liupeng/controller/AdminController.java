package com.liupeng.controller;

import com.liupeng.model.*;
import com.liupeng.repository.*;
import com.sun.javafx.sg.prism.NGShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
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
    @Autowired
    TeaRepository teaRepository;
    @Autowired
    TeamRepository teamRepository;
    @Autowired
    PostRepository postRepository;


    @RequestMapping("index")
    public String index(){
        return "/admin/index";
    }
    @RequestMapping("")
    public String index1(){
        return "/admin/project-list";
    }
    @RequestMapping("dashboard")
    public String dashboard(){
        return "/admin/dashboard";
    }
    @RequestMapping("admin-blog-new")
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

//    @RequestMapping(value = "student-change-table",method = GET)
//    public String studentChangeTable(@RequestParam String stu_no, ModelMap modelMap){
//        modelMap.addAttribute("stu_no",stu_no);
//        return "/admin/student-change";
//    }

    //跳转到学生信息修改表
    @RequestMapping(value = "student-change-table",method = GET)
    public String studentChange(@RequestParam String stu_no,@RequestParam String name, ModelMap modelMap) {
        modelMap.addAttribute("stu_no", stu_no);
        modelMap.addAttribute("name", name);
        return "student-change";
    }
//    @RequestMapping("admin-project-list")
//    public String adminProjectList(ModelMap modelMap){
//        List<ProjectEntity> projectEntities=projectRepository.findAll();
//        System.out.println(projectEntities.size());
//        modelMap.addAttribute("projects",projectEntities);
//        return "/admin/project-list";
//    }
//    @RequestMapping("ProjectChange")
//    public String adminProjectChange(@RequestParam String project_no, @RequestParam String title, @RequestParam String team_no, @RequestParam String start_date, @RequestParam String end_date, @RequestParam String description, ModelMap modelMap){
//        Date startDate=Date.valueOf(start_date);
//        Date endDate=Date.valueOf(end_date);
//        projectRepository.adminUpdateProject(project_no,title,team_no,startDate,endDate,description);
//        projectRepository.flush();
//        List<ProjectEntity> projectEntities=projectRepository.findAll();
//        modelMap.addAttribute("projects",projectEntities);
//        return "admin/project-list";
//>>>>>>> ee459c66b6885c127fb542c2712e442a77f341ad
//    }

    //查看学生列表
    @RequestMapping(value = "admin-student-list",method = GET)
    public String studentList(ModelMap modelMap){
        List<StudentEntity> studentEntityList=stuRepository.findAll();
        modelMap.addAttribute("students",studentEntityList);
        return "student-list";
    }


    //根据姓名查看学生的详细信息
    @RequestMapping(value = "admin-student-detail",method = GET)
    public String studentDetail(@RequestParam String name,ModelMap modelMap){
        StudentEntity student=stuRepository.findByName(name);
        modelMap.addAttribute(student);
        return "student-detail";
    }

    //删除对应学生
    @RequestMapping(value = "admin-student-delete",method=GET)
    public String studentDelete(@RequestParam String stu_no,ModelMap modelMap){
//        System.out.println("OKOKOKOK");
        stuRepository.deleteByStuNo(stu_no);
        List<StudentEntity> studentEntityList=stuRepository.findAll();
        modelMap.addAttribute("students",studentEntityList);
        return "student-list";
    }
    //更改学生信息
    @RequestMapping(value = "admin-student-change",method = POST)
    public String studentChangeAction(@RequestParam String stu_no,@RequestParam String name,@RequestParam String passwd,@RequestParam String college,@RequestParam String team_id, ModelMap modelMap){
        System.out.println(stu_no+" "+name+" "+passwd+" "+college+" "+team_id+" ");
        int n=stuRepository.upateStudent(name,passwd,college,Integer.valueOf(team_id),stu_no);
        if(n>0){
            StudentEntity student=stuRepository.findByStuNo(stu_no);
            modelMap.addAttribute(student);
            return "student-detail";
        }
        else{
            return "error";
        }
    }


    //管理教师模块
    @RequestMapping(value = "admin-teacher-list",method=GET)
    public String teacherList(ModelMap modelMap){
        List<TeacherEntity> teacherEntityList=teaRepository.findAll();
        modelMap.addAttribute("teachers",teacherEntityList);
        return "teacher-list";
    }

    //教师详细信息
    @RequestMapping(value = "admin-teacher-detail",method = GET)
    public String teacherDetail(@RequestParam String teaNo,ModelMap modelMap){
        TeacherEntity teacher=teaRepository.findByTeaNo(teaNo);
        List<TeamEntity> teamEntityList=teamRepository.findByTeaNo(teaNo);
        modelMap.addAttribute(teacher);
        modelMap.addAttribute(teamEntityList);
        return "teacher-detail";
    }
    //跳转更改教师信息页面
    @RequestMapping(value = "teacher-change-table",method = GET)
    public String teacherChange(@RequestParam String tea_no,@RequestParam String name,ModelMap modelMap){
        modelMap.addAttribute("tea_no",tea_no);
        modelMap.addAttribute("name",name);
        return "teacher-change";
    }
    //更改教师信息
    @RequestMapping(value = "admin-teacher-change",method = POST)
    public String teacherChangeAction(HttpServletRequest request,ModelMap modelMap){
        String tea_no=(String)request.getParameter("tea_no");
        String name=(String)request.getParameter("name");
        String passwd=(String)request.getParameter("passwd");
        String college=(String)request.getParameter("college");
        int n=teaRepository.updateByTeaNo(tea_no,name,passwd,college);
        if(n>0){
            TeacherEntity teacher=teaRepository.findByTeaNo(tea_no);
            modelMap.addAttribute(teacher);
            return "teacher-detail";
        }
        else{
            return "error";
        }
    }

    //管理项目模块
    @RequestMapping("admin-project-list")
    public String adminProjectList(ModelMap modelMap){
        List<ProjectEntity> projectEntities=projectRepository.findAll();
        System.out.println(projectEntities.size());
        modelMap.addAttribute("projects",projectEntities);
        return "project-list";
    }
    @RequestMapping("admin-project-change")
    public String adminProjectChange(@RequestParam String project_no, @RequestParam String title, @RequestParam String team_no, @RequestParam String start_date, @RequestParam String end_date, @RequestParam String description, ModelMap modelMap)
        {
            Date startDate = Date.valueOf(start_date);
            Date endDate = Date.valueOf(end_date);
            projectRepository.adminUpdateProject(project_no, title, team_no, startDate, endDate, description);
            projectRepository.flush();
            List<ProjectEntity> projectEntities = projectRepository.findAll();
            modelMap.addAttribute("projects", projectEntities);
            return "project-list";
        }
    @RequestMapping(value = "adminChangePasswd" ,method= GET)
    public String adminChangePasswd(){
        adminRepository.updatePasswd("asdf","admin");
        return "project-list";
    }


    @RequestMapping(value = "admin-blog-news", method = GET)
    public String blogNew(@RequestParam("title")String title, @RequestParam("author")String author, @RequestParam("content")String content,ModelMap modelMap){
        PostEntity postEntity = new PostEntity();
        postEntity.setAuthor(author);
        postEntity.setTitle(title);
        postEntity.setContent(content);
        long current = System.currentTimeMillis();
        Date date = new Date(current);
        postEntity.setTime(date);
        postRepository.saveAndFlush(postEntity);
        List<PostEntity>postEntityList=postRepository.findAll();
        modelMap.addAttribute("posts",postEntityList);
        return "blog-table";
    }

    @RequestMapping(value = "admin-blog-list")
    public String blogList(ModelMap modelMap){
        List<PostEntity>postEntityList=postRepository.findAll();
        modelMap.addAttribute("posts",postEntityList);
        return "blog-table";
    }
    @RequestMapping(value = "admin-blog-delete")
    public String blogDelete(@RequestParam String n, ModelMap modelMap){
        int num=postRepository.deletePost(n);
        if(num>0){
            List<PostEntity>postEntityList=postRepository.findAll();
            modelMap.addAttribute("posts",postEntityList);
            return "blog-table";
        }
        else{
            return "error";
        }
    }
    //管理员管理模块
    @RequestMapping("admin-admin-list")
    public String adminAdminList(ModelMap modelMap){
        List<AdminEntity>adminEntityList=adminRepository.findAll();
        modelMap.addAttribute("admins",adminEntityList);
        return "admin-list";
    }
    //跳转到管理员修改页面
    @RequestMapping(value = "admin-change-table",method = GET)
    public String adminChange(@RequestParam String type,@RequestParam String name, ModelMap modelMap){
        if(type.equals("1")){
            //具有操作权限
            modelMap.addAttribute("name",name);
            return "admin-change";
        }else{
            //不具有操作权限
            modelMap.addAttribute("msg","对不起，您不具有操作权限！");
            return "admin-list";
        }
    }

    //管理员修改
    @RequestMapping("admin-admin-change")
    public String adminChangeAction(@RequestParam String name,@RequestParam String passwd,@RequestParam String type,@RequestParam String department,ModelMap modelMap){
        int n=adminRepository.updateAdminByName(name,passwd,type,department);
        if(n>0){
            List<AdminEntity>admins=adminRepository.findAll();
            modelMap.addAttribute("admins",admins);
            return "admin-admin-list";
        }
        else{
            return "error";
        }
    }

    //管理员删除
    @RequestMapping("admin-admin-delete")
    public String adminDelete(@RequestParam String name,@RequestParam String type, ModelMap modelMap){
        if(!type.equals("1")){
            return "error";
        }
        int n=adminRepository.deleteByName(name);
        if(n>0){
            List<AdminEntity>admins=adminRepository.findAll();
            modelMap.addAttribute("admins",admins);
            return "admin-list";
        }
        else{
            return "error";
        }
    }
    //跳转到添加管理员列表
    @RequestMapping("admin-add-table")
    public String adminAdd(){
        return "admin-add";
    }
    //添加管理员
    @RequestMapping("admin-admin-add")
    public String adminAddAction(@RequestParam String name,@RequestParam String passwd,@RequestParam String type,@RequestParam String department,ModelMap modelMap){
        AdminEntity adminEntity=new AdminEntity();
        adminEntity.setName(name);
        adminEntity.setPasswd(passwd);
        adminEntity.setType(type);
        adminEntity.setDepartment(department);
        adminRepository.save(adminEntity);
        adminRepository.flush();
        List<AdminEntity> admins=adminRepository.findAll();
        modelMap.addAttribute("admins", admins);
        return "admin-list";
    }


    //项目统计模块
    @RequestMapping("admin-admin-statics")
    public String adminStatics(ModelMap modelMap){
        long stuNum=stuRepository.count();
        long teaNum=teaRepository.count();
        long teamNum=teamRepository.count();
        long proNum=projectRepository.count();
        modelMap.addAttribute("stuNum",stuNum);
        modelMap.addAttribute("teaNum",teaNum);
        modelMap.addAttribute("teamNum",teamNum);
        modelMap.addAttribute("proNum",proNum);
        return "admin-statics";
    }

    @RequestMapping("admin-team-list")
    public String adminTeamList(ModelMap modelMap){
        List<?> teamList=teamRepository.findAllTeam();
//        System.out.println(teamList.toString());
        modelMap.addAttribute("teams",teamList);
        return "team-list";
    }

    @RequestMapping("admin-team-delete")
    public String teamDelete(@RequestParam String name,@RequestParam String type, ModelMap modelMap){
        if(!type.equals("1")){
            return "error";
        }
        int n=teamRepository.deleteByTeamNo(name);
        if(n>0){
            List<TeamEntity>teams= teamRepository.findAll();
            modelMap.addAttribute("teams",teams);
            return "team-list";
        }
        else{
            return "error";
        }
    }


    @RequestMapping("team-add-team")
    public String teamAdd(){
        return "team-add";
    }

    @RequestMapping("admin-team-add")
    public String adminAddTeam(TeamEntity teamEntity, ModelMap modelMap){

//        adminEntity.setName(name);
//        adminEntity.setPasswd(passwd);
//        adminEntity.setType(type);
//        adminEntity.setDepartment(department);
//        adminRepository.save(adminEntity);

        teamRepository.saveAndFlush(teamEntity);
        List<TeamEntity> teams=teamRepository.findAll();
        modelMap.addAttribute("teams", teams);
        return "team-list";
    }

}
