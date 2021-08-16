
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"
            +request.getServerPort()+"/"+request.getContextPath()+"/";
%>
<html>
<head>
    <base href="<%=basePath%>>">
    <title>首页</title>
</head>
<body>
<div>
    <h3>ssm整合例子</h3>
    <table>
        <tr>
            <td><a href="html/register.html">注册学生</a></td>
        </tr>
        <tr>
            <td><a href="jsp/studentMessage.jsp">查询学生</a> </td>
        </tr>
    </table>
</div>

</body>
</html>
