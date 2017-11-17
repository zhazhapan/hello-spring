<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SSE Demo</title>
</head>
<body>
	<div id="msgFromPush"></div>
	<script type="text/javascript" src="assets/js/jquery-3.2.1.js"></script>
	<script type="text/javascript" type="text/javascript">
		//只有新式的浏览器才有，EventSource是SSE的客户端
		if (!!window.EventSource) {
			var source = new EventSource('push');
			s = '';
			//添加SSE监听，获得服务器推送的消息
			source.addEventListener('message', function(e) {
				s += e.data + "<br/>";
				$('#msgFromPush').html(s);
				console.log(s);
			});
			source.addEventListener('open', function(e) {
				console.log("连接打开");
			});
			source.addEventListener('error', function(e) {
				if (e.readyState == EventSource.CLOSED) {
					console.log('连接关闭');
				} else {
					console.log(e.readyState);
				}
			})
		} else {
			console.log('你的浏览器不支持SSE');
		}
	</script>
</body>
</html>