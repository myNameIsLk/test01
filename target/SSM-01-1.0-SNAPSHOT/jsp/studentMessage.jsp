
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String basePath = request.getScheme()+"://"+request.getServerName()+":"
          +request.getServerPort()+"/"+request.getContextPath()+"/";
%>
<html>
<head>
  <base href="<%=basePath%>>">
    <title>所有学生信息</title>
  <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
  <script type="text/javascript">
    //入口函数
      $(function () {
        //加载完毕时就加载数据
        loadStudentList();
        //点击按钮再刷新显示数据
        $("#btn").click(function () {
          loadStudentList();
        })


        function loadStudentList(){
          $.ajax({
            url:"student/findStudents",
            type:"get",
            dataType:"json",
            success:function (data) {//形参名是自定义的
              //alert(data)，data是jquery生成的json对象
              alert(data)
              //清楚已有数据
              $("#info").html("");
              //增加新数据,遍历
              $.each(data,function (i,n) {
                $("#info").append("<tr>")
                        .append("<td>"+n.id+"<td>")
                        .append("<td>"+n.name+"<td>")
                        .append("<td>"+n.age+"<td>")
                        .append("<td>"+n.sch_name+"<td>")
                        .append("<td>"+n.sch_addr+"<td>")
                        .append("<tr>")
              })

            }
          })
        }


      })

  </script>
</head>
<body>
<button id="btn">查询学生信息</button>
<table>
  <thead>
  <tr>
    <td>id</td>
    <td>姓名</td>
    <td>年龄</td>
    <td>学校名</td>
    <td>学校地址</td>
  </tr>
  </thead>
  <tbody id="info">

  </tbody>
</table>

</body>
</html>
