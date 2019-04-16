<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	$(function(){
		$.post("show",
		
			function(data){
				var result = "";
				for(var i=0;i<data.length;i++){
					result += "<dl>";
					result += "<dt style='cursor:pointer'>"+data[i].name+"</dt>";	
					for(var j=0;j<data[i].menuList.length;j++){
						result += "<dd>"+data[i].menuList[j].name+"</dd>";
					}
				result += "</dl>";
				}
				$("body").html(result);	
		});
	
		/*动态绑定事件  jquery高版本这样写*/
		$(document).on("click","dt",function(){
			$(this).siblings().slideToggle(200);
		});
	});
</script>
<title>Insert title here</title>
</head>
<body>

</body>
</html>