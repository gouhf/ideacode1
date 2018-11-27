<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="/struts-tags"  prefix="s"%>
<html>

	<body>

		<form  method="post" action="${pageContext.request.contextPath}/ns/student_modify">
			<input   hidden type="text" name="student.id" value='<s:property value='student.id'/>' readonly/>
			姓名<input type="text" name="student.name" value="<s:property value='student.name'/>"/><br/>
			邮箱<input type="text" name="student.email" value="<s:property value='student.email'/>"/><br/>
			生日<input type="date" name="student.birthday" value="<s:date name='student.birthday' format='yyyy-MM-dd' />"/><br/>  
				<input type="submit" value="确认修改"/>
			
		
		</form>
	
	
	
	
	
	</body>






</html>