<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	$(function(){
		var a=${param.id};
		$.post("xiangqing.do",{"id":"${param.id}"},function(data){
			$("#a").val(data.name);
		})
		
	})
</script>
</head>
<body>
	<table>
		<tr>
			<td>姓名</td>
			<td>
				<input type="text" id="a">
			</td>
		</tr>
	</table>
</body>
</html>