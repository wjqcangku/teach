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
<title>无标题文档</title>

<link href="../../css/sys.css" type="text/css" rel="stylesheet" />

</head>

<body >
 <table border="0" cellspacing="0" cellpadding="0" width="100%">
  <tr>
    <td class="topg"></td>
  </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0"  class="wukuang"width="100%">
  <tr>
    <td width="1%"><img src="../../WEB-INF/images/tleft.gif"/></td>
    <td width="39%" align="left">[部门管理]</td>
   
    <td width="57%"align="right">
       <a href="addDept.html"><img src="../../WEB-INF/images/button/tianjia.gif" /></a>
      
    </td>
    <td width="3%" align="right"><img src="../../WEB-INF/images/tright.gif"/></td>
  </tr>
</table>
<table border="0" cellspacing="0" cellpadding="0" style="margin-top:5px;">
  <tr>
    <td ><img src="../../WEB-INF/images/result.gif"/></td>
  </tr>
</table>
<table width="100%" border="1" >
  
  <tr class="henglan" style="font-weight:bold;">
    <td width="6%" align="center">部门名称</td>
	<td width="6%" align="center">部门说明</td>
    <td width="7%" align="center">编辑</td>
  </tr>
  <c:forEach items="${requestScope.list }" var="b">
   <tr class="tabtd2">
    <td align="center">${b.bname }</td>
    <td align="center">${b.say }</td>
  	<td width="7%" align="center"><a href="addjobDept.html"><img src="../../WEB-INF/images/button/modify.gif" class="img"></a></td>
  </tr>
  </c:forEach>
   
</table>
<table border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td align="right">
    	<span>第1/3页</span>
        <span>
        	<a href="BuMenServlet?page=${page }">首页</a>&nbsp;&nbsp;
        	<c:if test="${page!=1 }">
        	 <a href="BuMenServlet?page=${page-1 }">[上一页]</a>&nbsp;&nbsp;
        	</c:if>
           	<c:if test="${page!=countpage }">
            <a href="BuMenServlet?page=${page+1 }">[下一页]</a>&nbsp;&nbsp;
            </c:if>
            <a href="BuMenServlet?page=${countpage }">尾页</a>
        </span>
    </td>
  </tr>
</table>
</body>
</html>
