<%@ page language="java" contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html lang="">
<head>
	<meta charset="utf-8">
	<title>信息查询</title>
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
		<h1><strong>学生平台</strong> 首页</h1>
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
			<%--<span class="button dropdown">--%>
			<%--<a href="#">Inbox <span class="pip">6</span></a>--%>
			<%--<ul class="notice">--%>
				<%--<li>--%>
					<%--<hgroup>--%>
						<%--<h1>Hi, I need a favour</h1>--%>
						<%--<h2>John Doe</h2>--%>
						<%--<h3>Lorem ipsum dolor sit amet, consectetuer sed aidping putamus delo de sit felume...</h3>--%>
					<%--</hgroup>--%>
					<%--<p><span>11:24</span></p>--%>
				<%--</li>--%>
				<%--<li>--%>
					<%--<hgroup>--%>
						<%--<h1><span class="icon">&#59154;</span>Hi, I need a favour</h1>--%>
						<%--<h2>John Doe</h2>--%>
						<%--<h3>Lorem ipsum dolor sit amet, consectetuer sed aidping putamus delo de sit felume...</h3>--%>
					<%--</hgroup>--%>
					<%--<p><span>11:24</span></p>--%>
				<%--</li>--%>
				<%--<li>--%>
					<%--<hgroup>--%>
						<%--<h1><span class="icon">&#59154;</span>Hi, I need a favour</h1>--%>
						<%--<h2>John Doe</h2>--%>
						<%--<h3>Lorem ipsum dolor sit amet, consectetuer sed aidping putamus delo de sit felume...</h3>--%>
					<%--</hgroup>--%>
					<%--<p><span>11:24</span></p>--%>
				<%--</li>--%>
			<%--</ul>--%>
		<%--</span>--%>
			<%--<span class="button">Live</span>--%>
			<span class="button">帮助</span>
			<span class="button blue"><a href="index">退出登录</a></span>
		</div>
	</section>
</div>
<nav>
	<ul>
		<li><a href="dashboard"><span class="icon">&#128711;</span> 主页<span class="pip"></span></a></li>
		<li>
			<a href="files"><span class="icon">&#128196;</span> 文件下载<span class="pip"></span></a>
			<%--<ul class="submenu">--%>
			<%--<li><a href="page-new">Create page</a></li>--%>
			<%--<li><a href="page-timeline">View pages</a></li>--%>
			<%--</ul>	--%>
		</li>
		<li>
			<a href="files-upload"><span class="icon">&#127748;</span> 上传文件 <span class="pip"></span></a>
			<%--<ul class="submenu">--%>
			<%--<li><a href="files-upload">file-upload</a></li>--%>
			<%--<li><a href="files">View files</a></li>--%>
			<%--</ul>--%>
		</li>
		<%--<li>--%>
		<%--<a href="blog-timeline"><span class="icon">&#59160;</span> Blog <span class="pip">12</span></a>--%>
		<%--<ul class="submenu">--%>
		<%--<li><a href="blog-new">New post</a></li>--%>
		<%--<li><a href="blog-table">All posts</a></li>--%>
		<%--<li><a href="comments-timeline">View comments</a></li>--%>
		<%--</ul>--%>
		<%--</li>--%>
		<%--<li><a href="statistics"><span class="icon">&#128202;</span> Statistics</a></li>--%>
		<li class="section"><a href="pages-table"><span class="icon">&#128101;</span> 信息查询 <span class="pip"></span></a></li>
		<%--<li>--%>
		<%--<a href="ui-elements"><span class="icon">&#9881;</span> UI Elements</a>--%>
		<%--<ul class="submenu">--%>
		<%--<li><a href="icon-fonts">Icon fonts</a></li>--%>
		<%--</ul>--%>
		<%--</li>--%>
	</ul>
</nav>

<%--<section class="alert">--%>
	<%--<form method="link" action="page-new">--%>
		 <%--<button class="green">Create new page</button>--%>
	<%--</form>--%>
<%--</section>--%>
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
						<th>Page title</th>
						<th >Date</th>
						<th>Child pages</th>
						<th>Comments</th>
						<th>Author</th>
					</tr>
				</thead>
					<tbody>
						<tr>
							<td><input type="checkbox" /> Home</td>
							<td>01/3/2013</td>
							<td>0</td>
							<td>0</td>
							<td>John Doe</td>
						</tr>
						<tr>
							<td><input type="checkbox" /> Services</td>
							<td>01/3/2013</td>
							<td>4</td>
							<td>0</td>
							<td>John Doe</td>
						</tr>
						<tr>
							<td><input type="checkbox" /> Portfolio</td>
							<td>02/3/2013</td>
							<td>12</td>
							<td>0</td>
							<td>John Doe</td>
						</tr>
						<tr>
							<td><input type="checkbox" /> About us</td>
							<td>02/3/2013</td>
							<td>2</td>
							<td>0</td>
							<td>John Doe</td>
						</tr>
						<tr>
							<td><input type="checkbox" /> Blog</td>
							<td>02/3/2013</td>
							<td>32</td>
							<td>0</td>
							<td>John Doe</td>
						</tr>
						<tr>
							<td><input type="checkbox" /> Contact us</td>
							<td>03/3/2013</td>
							<td>0</td>
							<td>0</td>
							<td>John Doe</td>
						</tr>
						<tr>
							<td><input type="checkbox" /> Our clients</td>
							<td>04/3/2013</td>
							<td>1</td>
							<td>0</td>
							<td>John Doe</td>
						</tr>
						<tr>
							<td><input type="checkbox" /> Partnerships</td>
							<td>04/3/2013</td>
							<td>0</td>
							<td>0</td>
							<td>John Doe</td>
						</tr>
						<tr>
							<td><input type="checkbox" />Jobs</td>
							<td>04/3/2013</td>
							<td>0</td>
							<td>0</td>
							<td>John Doe</td>
						</tr>
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