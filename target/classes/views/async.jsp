<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript" src="assets/js/jquery-3.2.1.js"></script>
	<script type="text/javascript">
		deferred();//页面打开就向后面发送请求
		function deferred() {
			$.get('defer', function(data) {
				console.log(data);
				deferred();//完成请求后再次发送请求
			});
		}
	</script>
</body>
</html>