<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>
<%request.setCharacterEncoding("euc-kr");
String save = request.getParameter("save");
//아이디 저장 체크박스가 체크 되어있는지 판단
String id = request.getParameter("id");
if(save!=null){
	Cookie co=new Cookie("id",id);
	co.setMaxAge(60*5);
response.addCookie(co);
//사용자에게 쿠키를 넘긴다.
out.write("쿠키생성 완료");

}

%>


</body>
</html>