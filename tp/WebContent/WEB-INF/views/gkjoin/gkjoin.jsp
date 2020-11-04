<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var='root' value="${pageContext.request.contextPath }/" />
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>게임즈 코리아 | 회원가입</title>
<!-- Bootstrap CDN -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
<style>
* {
	font-weight: bold;
}
</style>
</head>
<script>
	
</script>

<body>
	<p style="margin: auto; width: 40%; margin-top: 5%;">
	<center>
		<h1>서비스 약관에 동의해 주세요.</h1>
		<div>
		</div>
		<br>
		<div style="margin: auto; width: 40%; margin-top: 5%;">
			<hr style="border: 3px solid black;">
			<table style="width: 100%;">
				<tr style="width: 800px;">
					<td width="30%" style="font-size: large;">아이디<small
						style="color: red">*</small></td>
					<td width="70%" >게임즈 코리아 서비스 약관에 동의(필수)</td>
				</tr>
				<tr>
					<td colspan="2">
						<hr>
					</td>
				</tr>
				<tr style="width: 800px;">
					<td width="30%" style="font-size: large;">비밀번호<small
						style="color: red">*</small></td>
					<td width="70%"><input type="password"
							style="padding-left: 20px; background-color: #f8f8f8; outline: none; border: none; height: 48px; width: 100%;"
							 placeholder="비밀번호를 입력 해주세요" />
							</td>
				</tr>
				<tr>
					<td colspan="2">
						<hr>
					</td>
				</tr>

				<tr style="width: 800px;">
					<td width="30%" style="font-size: large;">비밀번호 확인<small
						style="color: red">*</small></td>
					<td width="70%"><input type="password"
							style="padding-left: 20px; background-color: #f8f8f8; outline: none; border: none; height: 48px; width: 100%;"
							placeholder="비밀번호를 확인 해주세요" />
							</td>
				</tr>
				<tr>
					<td colspan="2">
						<hr>
					</td>
				</tr>

				<tr style="width: 800px;">
					<td width="30%" style="font-size: large;">이름<small
						style="color: red">*</small></td>
					<td width="70%"><input type="text"
							style="padding-left: 20px; background-color: #f8f8f8; outline: none; border: none; height: 48px; width: 100%;"
							placeholder="이름을 입력해주세요" /></td>
				</tr>
				<tr>
					<td colspan="2">
						<hr>
					</td>
				</tr>
				<tr style="width: 800px;">
					<td width="30%" style="font-size: large;">연락처<small
						style="color: red">*</small></td>
					<td width="70%"><input type="tel"
							style="padding-left: 20px; background-color: #f8f8f8; outline: none; border: none; height: 48px; width: 100%;"
							 placeholder="연락처를 입력해주세요" /></td>
				</tr>
				<tr>
					<td colspan="2">
						<hr>
					</td>
				</tr>
				<tr style="width: 800px;">
					<td width="30%" style="font-size: large;">생년월일<small
						style="color: red">*</small></td>
					<td width="70%"><input type="text"
							style="padding-left: 20px; background-color: #f8f8f8; outline: none; border: none; height: 48px; width: 100%;"
							 placeholder="ex)901225" /></td>
				</tr>
				<tr>
					<td colspan="2">
						<hr>
					</td>
				</tr>

				<tr style="width: 800px;">
					<td width="30%" style="font-size: large;">주소<small
						style="color: red">*</small></td>
					<td width="70%"><input type="text"
							style="padding-left: 20px; background-color: #f8f8f8; outline: none; border: none; height: 48px; width: 100%;"
							 placeholder="주소를 입력 해주세요" /></td>
				</tr>
				<tr>
					<td colspan="2">
						<hr>
					</td>
				</tr>
				<tr>
					<td colspan="2"><button type="submit" class="btn btn-primary"
							style="font-weight: bolder; width: 100%;height: 50px; margin-top: 10px; background-color: #ea8094; line-height: 40px; color: white; border: #ea8094;">
						가입하기</button></td>
				</tr>
			</table>
		</div>
	</center>
	</p>
	<br>
</body>

</html>



