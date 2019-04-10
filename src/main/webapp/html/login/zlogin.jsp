<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册</title>
    <style text="text/css">
        .p{
            color:blue;
            margin-left:20px;
            display:inline-block;
        }
        .c{
            color:red;
            margin-left:4px;
            display:inline-block;
        }
        .l{
            font-size:18px;
        }
        .d{
            height:35px;
            width:300px;
            display:inline;
        }
        .i{
            height:30px;
            width:300px;
        }
        .login{
            background:url('../../images/zclogin.jpg');
            background-size:100%;
            height: 100%;
        }


    </style>
</head>
<body>
    <div class="login" style="background:url('../../images/zclogin.jpg');background-size:100%;height: 100%;">
    <form enctype="multipart/form-data">
        <div style="width:500px;float:left;margin:0 20px;">
            <div style="font-size:28px;">注册新用户</div>
            <br/>
            <span class="p">*</span>
            <label for="username" class="l">用户名:</label>
            <div style="height:35px;width:300px;position:relative;display:inline;">
                <input id="username" type="text" style="height:30px;width:250px;padding-right:50px;">
                <%--<span style="position:absolute;right:18px;top:2px;background-image:url(../../images/zclogin.jpg);height:16px;width:16px;display:inline-block;" ></span>--%>
            </div>
            <br/><br/>
            <span class="p">*</span>
            <label for="phonenumber" class="l">手机号:</label>
            <div  class="d">
                <input id="phonenumber" type="text" class="i">
            </div>
            <br/><br/>
            <span class="c">*</span>
            <label for="login_password" class="l">登录密码:</label>
            <div  class="d">
                <input id="login_password" type="text" class="i">
            </div>
            <br/><br/>
            <span class="c">*</span>
            <label for="confirm_password" class="l">确认密码:</label>
            <div  class="d">
                <input id="confirm_password" type="text" class="i">
            </div>
            <br/><br/>
            <span class="p">*</span>
            <label for="ver_code" class="l">验证码:</label>
            <div  class="d">
                <input id="ver_code" type="text" class="i">
            </div>
            <br/><br/>
            <input type="checkbox" name="agree" style="margin-left:100px;display:inline-block;" value="1"/>
            <span style="font-size:10px;">我已阅读并同意《用户注册协议》</span>
            <br/><br/>
            <input type="submit" value="同意以上协议并注册" style="margin-left:100px;height:30px;width:300px; display:inline-block;"/>
        </div>
    </form>
	</div>
</body>
</html>
