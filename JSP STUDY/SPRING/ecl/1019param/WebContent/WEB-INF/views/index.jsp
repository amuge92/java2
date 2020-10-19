<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- <a href="t1?a=10&b=20&c=30">t1</a>
	<form action="t2" method="post">
		a:<input name="a"><br> b:<input name="b"><br>
		c:<input name="c"><br> <input type="submit" value="t2">
	</form>
	<a href="t4/10/20/30">test4</a>
	<a href="t5?a=10&b=20&c=30">test5</a>
	<br>
	<br>
	<a href="t6?data1=10&data2=20&data3=30">t6으로.1</a> -->
	<!-- 맵으로 주입받기.  동일한 이름으로 전달되는 파라미터의 값은 하나만 담긴다.ex)data3에는 30만 담긴다. -->
	<!-- 
	<a href="t7?data1=10&data2=20&data3=30&data3=40">t7로.1</a> -->
	<!-- 이러한 경우엔 list로 주입받으면 된다. -->
	<!-- 	<br>
	<br>

	<a href="t1?data1=10&data2=20">t1로.2</a>
	<br>
	<br>
	<a href="t2">2.2번으로</a>
	<br>
	<a href="t3">3.2번으로</a>
	<br>
	<a href="t4">4.2번으로</a>
	<br>

	<form action="t11" method="post">
		<input name="data1"> <input name="data2"> <input
			type="submit" value="t11제출">
	</form>

	<form action="t12" method="post">
		<input name="data1"> <input name="data2"> <input
			type="submit" value="t12제출">
	</form>
	<br>
	<br>
	<br>

	<a href="t1">t1로.3</a>
	<br>
	<a href="t2">2.3번으로</a>
	<br>
	<a href="t3">3.3번으로</a>
	<br>
	<a href="t4">4.3번으로</a>
	<br> -->

	<center>
		<form action="t6">
			su1 : <input name="su1"><br> su2 : <input name="su2"><br>
			<input type="submit" value="제출">
		</form>
	</center>



</body>
</html>