<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<HTML>
<HEAD>
    <META http-equiv=Content-Type content="text/html; charset=utf-8">
    <STYLE type=text/css>
        .cacher {
            BEHAVIOR: url(#default#userdata)
        }
    </STYLE>

    <SCRIPT type="text/javascript">
        var flag = false;
        function shift_status() {
            if (flag) {
                parent.main.cols="170,20,*";
                document.all.menuSwitch1.src = '../../images/ej1_30.gif';
            } else {
                parent.main.cols = "0,20,*";
                document.all.menuSwitch1.src = '../../images/ej1_32.gif';
            }
            flag = !flag;
        }
    </SCRIPT>
    <META content="MSHTML 6.00.2600.0" name=GENERATOR>
</HEAD>
<BODY onclick=shift_status() leftMargin=0 topMargin=0>
<SPAN class=cacher id=cacheData name="cacheData"></SPAN>
<TABLE height="100%" width="26px" cellSpacing=0 cellPadding=0 border=0>
    <TBODY>
    <TR>
        <TD id=menuSwitch style="CURSOR: hand" vAlign=center bgColor=#00bfff >
            <IMG id=menuSwitch1 src="../../images/ej1_30.gif" width=20>
        </TD>
    </TR>
    </TBODY>
</TABLE>
</BODY>
</HTML>
