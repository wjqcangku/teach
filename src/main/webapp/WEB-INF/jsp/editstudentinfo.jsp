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
            location.href="/studentinfo.do"
        }
        // function save() {
        //     var  sclasss=document.getElementById("sclasss");
        //     alert(document.getElementById("scno"))
        //     sclasss.action="createSc.do";
        //     sclasss.submit();
        // }
        //实现点击事件，状态为已就业时，把隐藏的选项查出来
        function show_sub(v)
        {

            if (v=="已就业")
            {
                document.getElementById("xhid1").style.visibility="visible";
                document.getElementById("xhid2").style.visibility="visible";
                document.getElementById("xhid3").style.visibility="visible";
                document.getElementById("xhid4").style.visibility="visible";
                document.getElementById("xhid5").style.visibility="visible";
                document.getElementById("xhid6").style.visibility="visible";
            }
            else
            {
                document.getElementById("xhid1").style.visibility="hidden";
                document.getElementById("xhid2").style.visibility="hidden";
                document.getElementById("xhid3").style.visibility="hidden";
                document.getElementById("xhid4").style.visibility="hidden";
                document.getElementById("xhid5").style.visibility="hidden";
                document.getElementById("xhid6").style.visibility="hidden";

            }
        }




        function save() {
            var allteacher = $('#allteacher').serialize();
            var sname=document.getElementById("sname").value;
            var sno=document.getElementById("sno").value;
            var stugrade=document.getElementById("stugrade").value;
            var stuclass=document.getElementById("stuclass").value;
            var biogenicland=document.getElementById("biogenicland").value;
            var sphone=document.getElementById("sphone").value;
            if(sname =='' || sno =='' || stugrade==''|| stuclass==''
                || biogenicland =='' || sphone =='' ){
                debugger;
                // document.getElementsByClassName("hid").innerHTML="必填项！不可为空";
                document.getElementById("hid1").innerHTML="必填项！不可为空";
                document.getElementById("hid2").innerHTML="必填项！不可为空";
                document.getElementById("hid3").innerHTML="必填项！不可为空";
                document.getElementById("hid4").innerHTML="必填项！不可为空";
                document.getElementById("hid5").innerHTML="必填项！不可为空";
                document.getElementById("hid6").innerHTML="必填项！不可为空";
            }else{
                {
                    $.ajax({
                        type: "POST",
                        data: allteacher,
                        url: "../../updatestudentinfo.do",
                        // async: false,
                        // cache: false,
                        // dataType: "json",
                        // contentType : 'application/json;charset=utf-8',
                        // contentType: "application/json",
                        success: function (data) {
                            if (data) {
                                alert("保存成功");
                                window.location.href = "../../studentinfo.do";
                            } else {
                                alert("保存失败");
                                window.location.href = "../../studentinfo.do";
                            }
                        },
                    });
                }
            }
        };

    </script>
    <script type="text/css">
    #xhid{
        display:none;
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
        <td width="44%" align="left">[修改]</td>
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
<form id="allteacher" action="##" method="post" onsubmit="return false" >
    <table width="88%" border="0" class="emp_table" style="width:80%;">
        <input type="hidden" id="id" name="id" value="${sti.id}"/>
        <tr>
            <td width="10%">学生姓名：</td>
            <td width="25%">
                <span style="color: red">*</span>
                <input type="text" id="sname" name="sname"   value="${sti.sname}"/>
                <span  id="hid1"  style="color: red"></span>
            </td>
            <td width="8%">学号：</td>
            <td width="62%">
                <span style="color: red">*</span>
                <input type="text" id="sno" name="sno"  value="${sti.sno}"/>
                <span id="hid2" style="color: red"></span>
            </td>
        </tr>
        <tr>
            <td>所属年级：</td>
            <td>
                <span style="color: red">*</span>
                <input type="text" id="stugrade" name="stugrade"  value="${sti.stugrade}"/>
                <span id="hid3" style="color: red"></span>
            </td>
            <td>所属班级：</td>
            <td>
                <span style="color: red">*</span>
                <input type="text" id="stuclass" name="stuclass"  value="${sti.stuclass}"/>
                <span id="hid4" style="color: red"></span>
            </td>
        </tr>
        <tr>
            <td>生源地：</td>
            <td>
                <span style="color: red">*</span>
                <input type="text" id="biogenicland" name="biogenicland"  value="${sti.biogenicland}"/>
                <span id="hid5" style="color: red"></span>
            </td>
            <td>手机号：</td>
            <td>
                <span style="color: red">*</span>
                <input type="text" id="sphone" name="sphone"  value="${sti.sphone}"/>
                <span id="hid6" style="color: red"></span>
            </td>
        </tr>
        <tr>
            <td>学生状态：</td>
            <td>
                <span style="color: red">*</span>
                <select style="width: 150px" id="stustatus" name="stustatus"
                        onchange="show_sub(this.options[this.options.selectedIndex].value)">
                    <option>大一新生</option>
                    <option>大二学生</option>
                    <option>大三学生</option>
                    <option>大四学生</option>
                    <option >已就业</option>
                </select>
            </td>

            <td>
                <div   id="xhid1"  style= "visibility:hidden; ">选取城市：</div>
            </td>
                <td>
                    <div   id="xhid6"   style= "visibility:hidden; ">
                    <span style="color: red">*</span>
                    <select style="width: 150px" id="sdestination"
                            name="sdestination"

                     >
                        <option>北京</option>
                        <option>上海</option>
                        <option>深圳</option>
                        <option>广州</option>
                        <option>河南</option>
                        <option>杭州</option>
                    </select>
                    </div>
                </td>

        </tr>

        <tr>
            <td>
                <div    id="xhid2"   style= "visibility:hidden; ">性别：</div>
            </td>
            <td>
                  <div   id="xhid4"  style= "visibility:hidden; ">
                <span style="color: red">*</span>
                <select style="width: 150px" id="ssex" name="ssex">
                    <option>男</option>
                    <option>女</option>
                </select>
               </div>
            </td>

            <td>
                <div   id="xhid3"  style= "visibility:hidden; ">年龄：</div>
            </td>
            <td>

                <div   id="xhid5"  style= "visibility:hidden; ">
                    <span style="color: red">*</span>
                    <input type="text" id="sage" name="sage" />
                      <span id="hid8" style="color: red"></span>
                </div>

            </td>

        </tr>


    </table>
</form>



</body>
</html>
