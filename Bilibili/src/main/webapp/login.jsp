<%--
  Created by IntelliJ IDEA.
  User: slt
  Date: 2016/6/28
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> [endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> [endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> [endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->
<head>
<    <!-- Web App Capable-->
    <meta name="viewport" content="width=device-width,height=device-height,inital-scale=1.0,maximum-scale=1.0,user-scalable=no;">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="format-detection" content="telephone=no">

    <!-- Basic Page Needs
  ================================================== -->
    <meta charset="utf-8">
    <title>Jplay 登陆</title>
    <meta name="description" content="Free Responsive Html5 Css3 Templates | zerotheme.com">
    <meta name="author" content="www.zerotheme.com">

    <!-- Mobile Specific Metas
  ================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

    <!-- CSS
  ================================================== -->
    <link rel="stylesheet" href="css/zerogrid.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/menu.css">
    <!-- Owl Carousel Assets -->
    <link href="css/owl.carousel.css" rel="stylesheet">
    <link href="css/owl.theme.css" rel="stylesheet">
    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!--[if lt IE 8]>
    <div style=' clear: both; text-align:center; position: relative;'>
        <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
            <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
        </a>
    </div>
    <![endif]-->
    <!--[if lt IE 9]>
    <script src="js/html5.js"></script>
    <script src="js/css3-mediaqueries.js"></script>

    <![endif]-->

</head>
<body id="wrapper" >
<div class="wrap-body">

    <!--////////////////////////////////////Header-->
    <header>
        <div class="wrap-header">
            <div class="zerogrid">
                <div class="row">
                    <a href="index.jsp" class="logo"><img src="images/logo.png" /></a>
                    <ul class="social">
                        <li><a href="upload.jsp" title="Upload Video"><i class="fa fa-upload"></i>上传</a></li>
                        <li><a href="logIn.jsp" title="Log in"><i class="fa fa-user"></i>登陆</a></li>
                        <li><a href="register.jsp" title="Register"><i class="fa fa-bell"></i>注册</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </header>

    <!--////////////////////////////////////Menu-->
    <a href="#" class="nav-toggle">Toggle Navigation</a>
    <nav class="cmn-tile-nav">
        <ul class="clearfix">
            <li class="colour-1"><a href="index.jsp">首页</a></li>
            <li class="colour-2"><a href="gallery.jsp">番剧</a></li>
            <li class="colour-3"><a href="gallery.jsp">动画</a></li>
            <li class="colour-4"><a href="gallery.jsp">直播</a></li>
            <li class="colour-5"><a href="gallery.jsp">音乐</a></li>
            <li class="colour-6"><a href="gallery.jsp">舞蹈</a></li>
            <li class="colour-7"><a href="gallery.jsp">鬼畜</a></li>
            <li class="colour-8"><a href="gallery.jsp">更多</a></li>
        </ul>
    </nav>
    <!--////////////////////////////////////Container-->
    <section id="container" class="index-page">
        <div class="wrap-container zerogrid">
            <div class="row">
                <div class="logIn-content" class="col-2-3" style="height: 600px ">
                    <h2>登陆</h2>
                    <hr/>
                    <br/>
                    <br/>
                    <!--登陆的主界面 -->
                    <div class="logIn">
                        <h3>账号:</h3>
                        <br/>
                        <div id="login-user-name">

                            <input required autofocus type="text" style="width:80%"
                                   ng-model="user.username" placeholder="用户名/邮箱" id="username"/>
                            <i class="fa fa-envelope-o"></i>
                        </div>
                        <br/>
                        <h3>密码:</h3>
                        <br/>
                        <div id="login-user-password" style="font-size:20px">
                            <input required type="password" ng-model="user.password" style="width:80%"
                                   ng-keypress="$event.which===13&&commit()" id="password"/>
                            <i class="fa fa-lock"></i>
                        </div>
                        <br/>
                        <br/>
                        <span style="padding-left: 20%"></span>
                        <button type="submit" style="font-size: 20px;height:40px;background-color:#d58512;border: none;
                            color:#ffffcc;border-radius:10px;width:45%;font-family: 'Adobe Arabic';align-content:center">登 陆</button>
                    </div>
                    <!-- 友情链接-->
                    <div class="link">
                            <h2>官方合作</h2>
                            <br/>
                            <ul>
                                <li>
                                    <span><img src="images/jaccount.png" width="20px" height="20px"/></span>
                                    <span><a href="#" style="color: black"><b>jAccount</b></a></span>
                                </li>
                            </ul>
                    </div>
                </div>
            </div>
        </div>
    </section>


    <!-- Slider -->
    <script src="js/jquery-2.1.1.js"></script>
    <script src="js/demo.js"></script>
    <script src="js/classie.js"></script>
    <!-- Carousel -->
    <script src="js/owl.carousel.js"></script>
    <script>
        $(document).ready(function() {

            $("#owl-demo-1").owlCarousel({
                items : 4,
                lazyLoad : true,
                navigation : true
            });
            $("#owl-demo-2").owlCarousel({
                items : 4,
                lazyLoad : true,
                navigation : true
            });
            $("#owl-demo-3").owlCarousel({
                items : 4,
                lazyLoad : true,
                navigation : true
            });
        });
    </script>
</div>
</body>
</html>
