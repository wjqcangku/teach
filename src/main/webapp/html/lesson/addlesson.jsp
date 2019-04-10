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
            location.href="/lesson.do"
        }
        // function save() {
        //     var  sclasss=document.getElementById("sclasss");
        //     alert(document.getElementById("scno"))
        //     sclasss.action="createSc.do";
        //     sclasss.submit();
        // }




        function save() {
                var curriculum = $('#curriculum').serialize();
                var scname=document.getElementById("currname").value;
                var sccollege=document.getElementById("relationclass").value;
                var scno=document.getElementById("currno").value;
                var scpeople=document.getElementById("currprofile").value;
                if(scname =='' || sccollege =='' || scno =='' || scpeople =='' ){
                    debugger;
                    // document.getElementsByClassName("hid").innerHTML="必填项！不可为空";
                    document.getElementById("hid1").innerHTML="必填项！不可为空";
                    document.getElementById("hid2").innerHTML="必填项！不可为空";
                    document.getElementById("hid3").innerHTML="必填项！不可为空";
                    document.getElementById("hid4").innerHTML="必填项！不可为空";

                }else{
                {
                    $.ajax({
                        type: "POST",
                        data: curriculum,
                        url: "../../createCuur.do",
                        // async: false,
                        // cache: false,
                        // dataType: "json",
                        // contentType : 'application/json;charset=utf-8',
                        // contentType: "application/json",
                        success: function (data) {
                            if (data) {
                                alert("保存成功");
                                window.location.href = "../../lesson.do";
                            } else {
                                alert("保存失败");
                                window.location.href = "../../lesson.do";
                            }
                        },
                    });
                }
            }
        };

    </script>
    <%--<script type="text/css">--%>
    <%--.hid｛--%>


    <%--｝--%>

    <%--</script>--%>

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
        <td width="44%" align="left">[添加课程]</td>
        <button  onclick="save()" style="background-color: blue" id="save">保存</button>&nbsp;
        <button onclick="back()" style="background-color: blue">退回</button>
        <td width="52%"align="right">
            <!--<a href="listLog.html"><img src="../../images/button/find.gif" class="img"/></a>
            <a href="addLog.html"><img src="../../images/button/add.gif" class="img"/></a>~-->
            <!-- <a href="#"><img src="../../images/button/close.gif" class="img"/></a>-->
        </td>
        <td width="3%" align="right"><img src="/images/tright.gif"/></td>
    </tr>
</table>
<form id="curriculum" action="##" method="post" onsubmit="return false" >
    <table width="88%" border="0" class="emp_table" style="width:80%;">
        <tr>
            <td width="10%">课程名称：</td>
            <td width="25%">
                <span style="color: red">*</span>
                <input type="text" id="currname" name="currname"  placeholder="输入课程名称"/>
                <span  id="hid1"  style="color: red"></span>
            </td>
            <td width="8%">关联班级：</td>
            <td width="62%">
                <span style="color: red">*</span>
                <input type="text" id="relationclass" name="relationclass" placeholder="输入关联班级"/>
                <span id="hid2" style="color: red"></span>
            </td>
        </tr>
        <tr>
            <td>课程编号：</td>
            <td>
                <span style="color: red">*</span>
                <input type="text" id="currno" name="currno" placeholder="输入课程编号"/>
                <span id="hid3" style="color: red"></span>
            </td>
            <td>课程热度：</td>
            <td>
                <span style="color: red">*</span>
              <select style="width: 150px" id="currheat" name="currheat">
                  <option>高</option>
                  <option>低</option>
                  <option>中</option>
              </select>
            </td>
        </tr>
        <tr>
            <td>课程简介：</td>
            <td>  <span style="color: red">*</span>
                <textarea cols="25" rows="5" id="currprofile" name="currprofile" value="${scl.scprofile}"></textarea>
                <span id="hid4" style="color: red"></span>
            </td>
            <td>课程状态：</td>
            <td>
                <span style="color: red">*</span>
                <select style="width: 150px" id="currstatus" name="currstatus">
                    <option>火爆</option>
                    <option>冷门</option>
                </select>
            </td>
        </tr>
        <tr>
            <%--<td colspan="4"><textarea cols="30" rows="6" id="scprofile" name="scprofile" value="${scl.scprofile}"></textarea></td>--%>
        </tr>

    </table>
</form>



</body>
</html>
