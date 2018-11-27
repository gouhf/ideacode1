<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>


	<body>
		<form method="post" action="${pageContext.request.contextPath}/ns/student_register">
		
			姓名<input type="text" name="student.name"/>
		          邮箱<input type="text" name="student.email"/>
			生日<input type="date" name="student.birthday"/>
			<input type="submit" value="注册" />
		
		
		
		</form>

	</body>




</html>