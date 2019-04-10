<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="../../css/sys.css" type="text/css"/>
    <title>班级管理</title>
    <script src="../../js/jquery-1.3.1.js" type="text/javascript"></script>
    <script type="text/javascript">

    </script>

</head>

<body>
<!--距离页面顶端5px-->
<table border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td class="topg"></td>
    </tr>
</table>
<form name="createForm" action="" method="post" id="createForm">
    <table border="0" cellspacing="0" cellpadding="0" class="wukuang">
        <tr>
            <td width="1%"><img src="../../images/tleft.gif"/></td>
            <td width="100%" align="left"><h3 style="background-color: deepskyblue">[学生信息管理]</h3></td>
            <td width="42%"align="center">&nbsp;</td>
            <td width="36%"align="right">

            </td>
            <td width="1%"><img src="../../images/tright.gif"/></td>
        </tr>
    </table>
</form>
<table border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td class="topg"></td>
    </tr>
</table>
<table border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td ><img src="../../images/result.gif"/></td>
    </tr>
</table>
<table width="97%" border="1" id="sclass">
    <thead>
    <tr class="henglan" style="font-weight:bold;">
        <th width="8%" align="center">姓名</th>
        <th width="8%" align="center">性别</th>
        <th width="8%" align="center">年龄</th>
        <th width="8%" align="center">联系方式</th>
        <th width="8%" align="center">毕业去向</th>
        <th width="8%" align="center">毕业时长</th>
        <th width="8%" align="center">最后操作时间</th>
        <th width="5%" align="center">编辑</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${content }" var="content">

    <tr class="tabtd1">
        <td align="center">${content.gname}</td>
        <td align="center">${content.gsex}</td>
        <td align="center">${content.gage}</td>
        <td align="center">${content.gphone}</td>
        <td align="center">${content.gdetination}</td>
        <td align="center">${content.glength}</td>
        <td align="center">${content.glastdate}</td>
        <td align="center">
            <a href="selectgraById.do?id=${content.id}">
                <h4 style="color: black;font-weight:bold;">编辑</h4></a></td>
    </tr>
    </c:forEach>
</table>
<div style=" border:0px solid #F00; width:600px; height:300px;margin:0 auto">
    <table>
        <tr>
            <td align="center">
                <h2 style="color: black;font-size: 16px">第 ${pageInfo.pageNum} 页 </h2>
            <td>
            <td>
                <a href="graduation.do?pageNo=${pageInfo.firstPage}"><h3 style="color: black;font-size: 16px">首页</h3></a>
            </td>
            <c:if test="${pageInfo.hasPreviousPage}">
                <td>
                    <a href="graduation.do?pageNo=${pageInfo.pageNum-1}"><h3 style="color: black;font-size: 16px"> 上一页 </h3></a>
                </td>
            </c:if>
            <c:if test="${pageInfo.hasNextPage}">
                <td>
                    <a href="graduation.do?pageNo=${pageInfo.pageNum+1}"><h3 style="color: black;font-size: 16px"> 下一页 </h3></a>
                </td>
            </c:if>
            <td>
                <a href="graduation.do?pageNo=${pageInfo.lastPage}"><h3 style="color: black;font-size: 16px">尾页</h3></a>
            </td>
        </tr>
    </table>
</div>

</body>

</html>
