<%@page import="javax.swing.text.Document"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            .container{position: relative;}
            .container img{display: inline-block;
            top: 0;
            left: 0;}
            #iam{
                position: absolute;
                
                left: 0;
            }
        </style>
        <script type="text/javascript" src="game_dif.js"></script>
    </head>
    <BODY onload="restart()">
    	<h1 style="text-align:center">Ʋ���׸�ã��</h1>
        <div id="pa" class="container">
        <img usemap="#map" onclick="qq()" id="img" src="���1.jepg">
        </div>
        <map name="map" id="map" class="map">

        </map>
        <div id="kk"></div>
        
    </BODY>
</html>