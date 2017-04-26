<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="">
<head>
    <meta charset="utf-8">
    <title>Retina Dashboard</title>
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <meta name="robots" content="" />
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" href="../css/style.css" media="all" />
    <!--[if IE]><link rel="stylesheet" href="../css/ie.css" media="all" /><![endif]-->
</head>
<body>
<div class="testing">
    <header class="main">
        <h1><strong>Retina</strong> Dashboard</h1>
        <input type="text" value="search" />
    </header>
    <%--用户导航栏--%>
    <%@include file="navbar.jsp"%>
    <%--用户导航栏--%>
</div>
<%--功能菜单--%>
<%@include file="functions-list.jsp"%>
<%--功能菜单--%>
<section class="alert">
    <form method="link" action="page-new">
        <button class="green">Create new page</button>
    </form>
</section>
<section class="content">
    <section class="widget">
        <header>
            <span class="icon">&#128196;</span>
            <hgroup>
                <h1>Pages</h1>
                <h2>CMS content pages</h2>
            </hgroup>
            <aside>
				<span>
					<a href="#">&#9881;</a>
					<ul class="settings-dd">
						<li><label>Option a</label><input type="checkbox" /></li>
						<li><label>Option b</label><input type="checkbox" checked="checked" /></li>
						<li><label>Option c</label><input type="checkbox" /></li>
					</ul>
				</span>
            </aside>
        </header>
        <div class="content">
            <table id="myTable" border="0" width="100">
                <thead>
                <tr>
                    <th>项目编号</th>
                    <th >项目名称</th>
                    <th>团队编号</th>
                    <th>开始日期</th>
                    <th>截止日期</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${projects}" var="project">
                    <tr>
                        <td><input type="checkbox" /> ${project.projectNo}</td>
                        <td>${project.title}</td>
                        <td>${project.teamNo}</td>
                        <td>${project.startDate}</td>
                        <td>${project.endDate}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </section>
</section>
<script src="../js/jquery-1.6.1.min.js"></script>
<script src="../js/jquery.wysiwyg.js"></script>
<script src="../js/custom.js"></script>
<script src="../js/cycle.js"></script>
<script src="../js/jquery.checkbox.min.js"></script>
<script src="../js/flot.js"></script>
<script src="../js/flot.resize.js"></script>
<script src="../js/flot-graphs.js"></script>
<script src="../js/flot-time.js"></script>
<script src="../js/cycle.js"></script>
<script src="../js/jquery.tablesorter.min.js"></script>
</body>
</html>