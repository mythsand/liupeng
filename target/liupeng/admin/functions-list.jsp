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
            <a href="#"><span class="icon">&#128196;</span> 项目管理</a>
            <ul class="submenu">
                <li><a href="/admin/admin-project-list">项目列表</a></li>
                <li><a href="/admin/project-change-table">项目更改</a></li>
            </ul>
        </li>
        <li>
            <a href="#"><span class="icon">&#127748;</span> 文件管理 <span class="pip">7</span></a>
            <ul class="submenu">
                <li><a href="files-upload">文件上传</a></li>
                <li><a href="files">查看文件</a></li>
            </ul>
        </li>
        <li>
            <a href="#"><span class="icon">&#59160;</span> 消息通知 <span class="pip">12</span></a>
            <ul class="submenu">
                <li><a href="/admin/admin-blog-new">上传通知</a></li>
                <li><a href="/admin/admin-blog-list">通知列表</a></li>
            </ul>
        </li>
        <li>
            <a href="/admin/admin-admin-statics"><span class="icon">&#128202;</span> 项目统计</a>
        </li>
        <li>
            <a href="#"><span class="icon">&#128101;</span> 用户管理 </a>
            <ul class="submenu">
                <li><a href="/admin/admin-student-list">学生管理</a> </li>
                <li><a href="/admin/admin-teacher-list">教师管理</a> </li>
                <li><a href="/admin/admin-team-list">团队管理</a> </li>
                <li><a href="/admin/admin-admin-list">管理员管理</a> </li>
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