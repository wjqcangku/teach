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
    <script src="../../js/jquery-1.3.1.js" type="text/javascript"></script>
    <script type="text/javascript">
        function back() {
            location.href="/sclass.do"
        }
        // function save() {
        //     var  sclasss=document.getElementById("sclasss");
        //     alert(document.getElementById("scno"))
        //     sclasss.action="createSc.do";
        //     sclasss.submit();
        // }


        function save() {
            var sclass = $('#sclasss').serialize();
            {
                $.ajax({
                    type: "POST",
                    data: sclass,
                    url: "editSc.do",
                    async: false,
                    // cache: false,
                    // dataType: "json",
                    // contentType : 'application/json;charset=utf-8',
                    // contentType: "application/json",
                    success: function (data) {
                        if (data) {
                            alert("修改成功");
                            window.location.href = "../../sclass.do";
                        } else {
                            alert("修改失败");
                            window.location.href = "../../sclass.do";
                        }
                    },
                });
            }
        }

    </script>

</head>

<body class="emp_body">
<table border="0" cellspacing="0" cellpadding="0" width="100%">
    <tr>
        <td class="topg"></td>
    </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0"  class="sclasss"width="100%">
    <tr>
        <td width="1%"><img src="/images/tleft.gif"/></td>
        <td width="44%" align="left">[修改班级]</td>
        <button  onclick="save()" style="background-color: blue" id="edit">保存</button>&nbsp;
        <button onclick="back()" style="background-color: blue">退回</button>
        <td width="52%"align="right">
            <!--<a href="listLog.html"><img src="../../images/button/find.gif" class="img"/></a>
            <a href="addLog.html"><img src="../../images/button/add.gif" class="img"/></a>~-->
            <!-- <a href="#"><img src="../../images/button/close.gif" class="img"/></a>-->
        </td>
        <td width="3%" align="right"><img src="/images/tright.gif"/></td>
    </tr>
</table>
<form id="sclasss" action="##" method="post" onsubmit="return false" >
    <table width="88%" border="0" class="emp_table" style="width:80%;">
        <tr>
            <td width="10%">班级名称：</td>
            <td width="20%"><input type="text" id="scname" name="scname"  value="${scl.scname}" readonly="true"/><span style="color: red">*不可修改</span></td>
            <td width="8%">所属院系：</td>
            <td width="62%"><input type="text" id="sccollege" name="sccollege" value="${scl.sccollege}" readonly="true"/><span style="color: red">*不可修改</span></td>
        </tr>
        <tr>
            <td>班级总人数：</td>
            <td><input type="text" id="scno" name="scno" value="${scl.scno}"/></td>
            <td>班级编号：</td>
            <td><input type="text" id="scpeople" name="scpeople" value="${scl.scpeople}" /></td>
        </tr>
        <input type="hidden" id="scid" name="scid" value="${scl.scid}"/>
        <tr>
            <td>班级简介：</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td colspan="4"><textarea cols="60" rows="10" id="scprofile" name="scprofile" value="${scl.scprofile}">${scl.scprofile} </textarea></td>
        </tr>

    </table>
</form>



</body>
</html>
