<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html lang="ko">

<head>
    <style>
        span {
            display: inline-block;
            width: 200px;
        }
    </style>
</head>

<body>
<form method="post" action="MemberJoinProc.jsp">
    <span>���̵�</span> : <input name="id"><br>
    <span>�н�����</span> : <input type="password" name="pass0"><br>
    <span>�н����� Ȯ��</span> : <input type="password" name="pass1"><br>
    <span>�̸���</span> : <input type="email" name="email"><br>
    <span>��ȭ��ȣ</span> : <input type="tel" name="tel"><br>
    <span>����� ���</span> : <input type="checkbox" name="hobby" value="cap">ķ��
    <input type="checkbox" name="hobby" value="rbook">����
    <input type="checkbox" name="hobby" value="movie">��ȭ
    <input type="checkbox" name="hobby" value="music">����
    <input type="checkbox" name="hobby" value="game">����
    <br>
    <span>����� ����</span> : <select name="job">
        <option value="student">�л�</option>
        <option value="teacher">����</option>
        <option value="salaryman">ȸ��</option>
        <option value="GODsu">���</option>
        <option value="doctor">�ǻ�</option>
        <option value="nurse">��ȣ��</option>
    </select><br>
    <span>����� ����</span> : <input type="radio" name="age" value="10��">10��
    <input type="radio" name="age" checked value="20��">20��
    <input type="radio" name="age" value="30��">30��
    <input type="radio" name="age" value="40��">40��
    <input type="radio" name="age" value="50��">50��<br>
    <span>�ϰ���� ��</span> : <textarea name="intro"></textarea><br>
    <input type="submit" value="ȸ������">
    <input type="reset" value="���">
    </form>
</body>

</html>
