<%@page import="java.util.Vector"%>
<%@page import="lee.CyDAO.cy_DAO"%>
<%@page import="lee.bean.cy_videobean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 

<!DOCTYPE html>
<html lang="kor">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA_Compatible" content="ie=edge">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
    function on(){
        var div = document.createElement("div");
        var pa = document.querySelector(".a");
        div.innerHTML=""
        pa.appendChild(div);
    }

</script>
    <style>

        html,
        body {
            position: relative;
            width: 270px;
            height: 640px;
            overflow: hidden;
        }

        #aa{
            margin-top: 1px;
            width: 200px;
            color: #5a86d5;
            text-align: center;
        }
        .a{
            color: blue;
            font-size: small;
            /* float: left; */
        }
    </style>
</head>

<body>
        <div id="aa"> FREE BOARD</div>
        <br>
        <div class="a" style="">
            <img style="height: 20px; width: 20px; " src="C:/javascript/폴더이미지.png">
            <span style="cursor: pointer;" onclick="on()">비디오 앨범</span>
        </div>
        <div class="a" style="height: 200px;">
            <img style="height: 20px; width: 20px; " src="C:/javascript/폴더이미지.png">
            <span style="cursor: pointer;" onclick="on()">잠금 앨범</span>
        </div>
</body>

</html>