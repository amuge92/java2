<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>
<%request.setCharacterEncoding("euc-kr");



%>

forward�̵� ������
<jsp:forward page="suc.jsp"/>
<jsp:include page="suc.jsp"/>
<!-- ������ �̵� -->
<!-- forward�±�  -->
<!-- sendRedirect -->
<!-- requestDispatcher -->
requestDispatcher re = request.getrequestDispatcher("suc.jsp");
re.forward(request,response);
re.include(request,response);
</body>
</html>