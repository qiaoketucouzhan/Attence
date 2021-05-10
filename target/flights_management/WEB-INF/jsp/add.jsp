<%--
  Created by IntelliJ IDEA.
  User: 张伟捷
  Date: 2020/12/22
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="add" class="attForm">
        <table border="1">
            <tr>
                <th>考勤信息记录表</th>
            </tr>
            <tr>
                <td>姓名:</td>
                <td><input type="text" name="empname" class="empname"/></td>
            </tr>
            <tr>
                <td>所属部门:</td>
                <td><input type="text" name="dept" class="dept"/></td>
            </tr>
            <tr>
                <td>考勤日期:</td>
                <td><input type="Date" name="chkdate" class="chkdate"/></td>
                <td>(yyyy-MM-dd)</td>
            </tr>
            <tr>
                <td>考勤状态:</td>
                <td>
                    <select name="status" class="status">
                        <option value="0">--请选择--</option>
                        <option value="1">正常</option>
                        <option value="2">迟到</option>
                        <option value="3">早退</option>
                        <option value="4">休假</option>
                        <option value="5">外出</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input type="submit"  value="登记"  />
                    <input type="reset" value="返回"  />
                </td>
                <td></td>
            </tr>
        </table>
    </form>

    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script>
        $(".attForm").submit(function(){
            var empname = $(".empname").val();
            var chkdate = $(".chkdate").val();

            if(empname==""){
                alert("用户名不能为空!")
                return false;
            }
            if(chkdate==""){
                alert("时间格式错误!")
                return false;
            }
            alert("登记成功")
            return true;
        })
    </script>

</body>
</html>
