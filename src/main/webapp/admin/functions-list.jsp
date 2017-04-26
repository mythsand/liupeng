<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/4/24
  Time: 上午10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav>
    <ul>
        <li><a href="dashboard"><span class="icon">&#128711;</span> Dashboard</a></li>
        <li class="section">
            <a href="pages-table"><span class="icon">&#128196;</span> 项目管理</a>
            <ul class="submenu">
                <li><a href="ProjectList">项目列表</a></li>
                <li><a href="project-change-table">项目更改</a></li>
            </ul>
        </li>
        <li>
            <a href="files"><span class="icon">&#127748;</span> 文件管理 <span class="pip">7</span></a>
            <ul class="submenu">
                <li><a href="files-upload">文件上传</a></li>
                <li><a href="files">查看文件</a></li>
            </ul>
        </li>
        <li>
            <a href="blog-timeline"><span class="icon">&#59160;</span> 消息通知 <span class="pip">12</span></a>
            <ul class="submenu">
                <li><a href="blog-new">上传通知</a></li>
                <li><a href="blog-table">通知管理</a></li>
                <li><a href="comments-timeline">查看评论</a></li>
            </ul>
        </li>
        <li>
            <a href="statistics"><span class="icon">&#128202;</span> 项目统计</a>
        </li>
        <li>
            <a href="users"><span class="icon">&#128101;</span> 用户管理 </a>
            <ul class="submenu">
                <li><a href="#">学生管理</a> </li>
                <li><a href="#">教师管理</a> </li>
                <li><a href="#">团队管理</a> </li>
                <li><a href="#">管理员管理</a> </li>
            </ul>
        </li>
        <li>
            <a href="ui-elements"><span class="icon">&#9881;</span> 用户设置</a>
            <ul class="submenu">
                <li><a href="icon-fonts">Icon fonts</a></li>
            </ul>
        </li>
    </ul>
</nav>