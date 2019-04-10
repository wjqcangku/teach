<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>教务管理系统</title>
</head>

<frameset rows="90,*" framespacing="0px" frameborder="0">
    <frame src="../../html/frame/top.jsp" scrolling="no"/>
    <frameset id="main" cols="10%,1%,*" framespacing="0px" frameborder="0" >
        <frameset rows="30,*,40" framespacing="0px" frameborder="0" >
            <frame src="../../html/frame/left1.jsp" scrolling="no"/>
            <frame src="../../html/frame/left.jsp" scrolling="no"/>
            <frame src="../../html/frame/left2.jsp" scrolling="no"/>
        </frameset>
        <frame src="../../html/frame/control.jsp" scrolling="no"/>
        <frame src="../../html/frame/right.jsp" name="right" scrolling="no"/>
    </frameset>
</frameset>
</html>
