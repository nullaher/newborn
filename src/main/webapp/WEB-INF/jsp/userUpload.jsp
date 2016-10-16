<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <script type="text/javascript" src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script> 
    <title>测试</title>  
  </head>  
<body>
	<h1>批量上传文件</h1>
    <form name="userUploadForm" action="user/upload" enctype="multipart/form-data" method="post">  
        <div id="uploadDiv">  
            <input type="file" name="file">  
        </div>
        <input type="button" id="addRowBtn" value="增加一行" >  
        <input type="submit" value="上传" >  
    </form>   
	<script type="text/javascript">
	    j = 1;  
	    $(document).ready(function(){  
	        $("#addRowBtn").click(function(){  
	            addNewUploadRow('newUploadRow'+(j++));
	        });  
	    });
	    
	    function addNewUploadRow(rowId){
	    	var newUptRow='<input type="file" name="file" />';
	    	var newUptRowDelBtn='<input type="button" value="删除"  onclick="delUptRow('+rowId+')"/>';
	    	$("#uploadDiv").append('<div id="'+rowId+'">'+newUptRow+newUptRowDelBtn+'</div>');
	    }
	    
	    function delUptRow(o){  
	    	$(o).remove();
	    }  
	</script>
</body>
</html>