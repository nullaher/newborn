<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>服务测试页</title>
<script type="text/javascript"
	src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<table>
		<tr>
			<td colspan="3">set custId:<input value="8888" id="custId" />
				md5 key:<input value="123123123" id="md5Key" /> <input type="button"
				value="设置密钥" onclick="setMd5Key();" />
			</td>
		</tr>
		<!-- ======================================= -->
		<tr>
			<td colspan="3"><strong>服务测试</strong></td>
		</tr>
		<tr>
			<td>安全key:<input />
				<input type="button" value="获取加密串" onclick="getMd5EncodeKey('idcAuth');" />
				<br> 
				<textarea rows="20" cols="80" id="reqData">
{
    "reqId": 1111,
    "custCode": 123,
    "data": {
        "custId": "8888",
        "reqId": "1467351138764"
    }
}
				</textarea>
			</td>

			<td><input type="button" value="发送请求" onclick="sendJsonReq('svc/1001','');" /> <br> 
			<input type="button" value="获取结果" onclick="sendJsonReq('query/svc','idcAuth');" /></td>

			<td><textarea rows="20" cols="80" id="idcAuthRspParam"></textarea>
		</tr>
	</table>
</body>
<script type="text/javascript">
	function sendJsonReq(reqUrl,tagDiv) {
		jQuery.ajax({
			url :reqUrl,
			contentType : 'application/json;charset=UTF-8',
			data : JSON.stringify(JSON.parse($("#reqData").val())),
			type : "POST",
			beforeSend : function() {
				return true;
			},
			success : function(response) {
					alert(response);
// 				var rspTextArea=$("#"+idPrefix+"RspParam");
// 				rspTextArea.val(JSON.stringify(response));
			}
		});
	}
</script>
</html>
