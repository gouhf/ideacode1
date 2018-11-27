<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="/struts-tags"  prefix="s"%>
<html>
	<body>
		<table border="1px">
		
			<tr><td>编号</td><td>姓名</td><td>邮箱</td><td>生日</td><td>点我修改</td><td>点我增加</td><td>点我删除</td></tr>
			<s:iterator value="list">
			<tr>
			<td><s:property value="id"/></td>
			<td><s:property value="name"/></td>
			<td><s:property value="email"/></td>
			<td><s:date name="birthday" format="yyyy-MM-dd" /></td>
			<td><a href="${pageContext.request.contextPath}/ns/student_queryOne?id=<s:property value="id"/>">点我修改</a></td>
			<td><a href="${pageContext.request.contextPath}/regist.jsp">点我增加</a></td>
			<td><a href="${pageContext.request.contextPath}/ns/student_destory?id=<s:property value="id"/>">点我删除</a><br/></td>
			
			</tr>
			</s:iterator>
		</table>
		
	</body>
	
</html>