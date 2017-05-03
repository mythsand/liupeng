<%@page language="java" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="">
<head>
	<meta charset="utf-8">
	<title>首页</title>
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta name="robots" content="" />
	<meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0">
	<link rel="stylesheet" href="../css/style.css" media="all" />
	<!--[if IE]><link rel="stylesheet" href="../css/ie.css" media="all" /><![endif]-->
	<!--[if lt IE 9]><link rel="stylesheet" href="../css/lt-ie-9.css" media="all" /><![endif]-->
</head>
<body>
<div class="testing">
<header class="main">
	<h1><strong>大创管理平台</strong> 项目统计</h1>
	<input type="text" value="搜索..." />
</header>
<section class="user">
	<div class="profile-img">
		<p><img src="../images/uiface2.png" alt="" height="40" width="40" /> 欢迎进入学生平台</p>
	</div>
	<div class="buttons">
		<button class="ico-font">&#9206;</button>
		<span class="button dropdown">
			<a href="#">通知 <span class="pip"></span></a>
			<ul class="notice">
				<li>
					<hgroup>
						<h1>You have a new task</h1>
						<h2>Report web statistics week by week.</h2> 
					</hgroup>
					<p><span>14:24</span></p>
				</li>
				<li>
					<hgroup>
						<h1>New comment</h1>
						<h2>Comment on <em>About page</em> by Darren.</h2> 
					</hgroup>
					<p><span>11:04</span></p>
				</li>
				<li>
					<hgroup>
						<h1>Broken link</h1>
						<h2>We've spotted a broken link on the <em>Blog page</em>.</h2> 
					</hgroup>
					<p><span>10:46</span></p>
				</li>
				<li>
					<hgroup>
						<h1>User report</h1>
						<h2><em>Lee Grant</em> has been promoted to admin.</h2> 
					</hgroup>
					<p><span>09:57</span></p>
				</li>
			</ul>
		</span>
		<span class="button">帮助</span>
		<span class="button blue"><a href="index">退出登录</a></span>
	</div>
</section>
</div>
<%--功能菜单--%>
<%@include file="functions-list.jsp"%>

<section class="content">
	<div class="content" >
		<section class="widget">
			<header> 
				<span class="icon">&#128318;</span>
				<hgroup>
					<h1>概览</h1>
					<h2>个人情况概览</h2>
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
				<section class="stats-wrapper">
					<div class="stats">
						<p><span>${stuNum}</span></p>
						<p>学生总数</p>
					</div>
					<div class="stats">
						<p><span>${proNum}</span></p>
						<p>项目总数</p>
					</div>
				</section>
				<section class="stats-wrapper">
					<div class="stats">
						<p><span>${teamNum}</span></p>
						<p>团队总数</p>
					</div>
					<div class="stats">
						<p><span>${teaNum}</span></p>
						<p>教师总数</p>
					</div>
				</section>
			</div>
		</section>
	</div>
	<div class="widget-container">
	</div>
</section>
<script src="../js/jquery-1.6.1.min.js"></script>
<script src="../js/jquery.wysiwyg.js"></script>
<script src="../js/custom.js"></script>
<script src="../js/cycle.js"></script>
<script src="../js/jquery.checkbox.min.js"></script>
<script src="../js/flot.js"></script>
<script src="../js/flot.resize.js"></script>
<script src="../js/flot-time.js"></script>
<script src="../js/flot-pie.js"></script>
<script src="../js/flot-graphs.js"></script>
<script src="../js/cycle.js"></script>
<script src="../js/jquery.tablesorter.min.js"></script>
<script type="text/javascript">
// Feature slider for graphs
//$('.cycle').cycle({
//	fx: "scrollHorz",
//	timeout: 0,
//    slideResize: 0,
//    prev:    '.left-btn',
//    next:    '.right-btn'
//});
</script>
</body>
</html>