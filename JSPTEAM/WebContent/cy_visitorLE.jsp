<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="kor">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA_Compatible" content="ie=edge">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <style>
        @keyframes box2b {
            0% {
                color: red;
            }

            20% {
                color: orange;
            }

            40% {
                color: yellow;
            }

            60% {
                color: green;
            }

            80% {
                color: blue;
            }

            100% {
                color: purple;
            }
        }

        p {
            animation: box2b 2s alternate-reverse infinite;
        }

        html,
        body {
            position: relative;
            width: 270px;
            height: 640px;
            overflow: hidden;
        }

        div {
            margin-top: 1px;
            width: 200px;
            border: 1px solid whitesmoke;
            border-radius: 5px;
            box-shadow: 0px 0px 3px black;
        }

        #id {
            color: cornflowerblue;
            font-size: large;
        }

        #bir {
            color: gray;
        }

        #mail {
            font-size: small;
            color: orange;
        }
        a{
            text-decoration: none;
            color: orangered;
        }
    </style>
</head>

<body>
    <center>
        <div> today is..¡파이팅!</div>
        <br>
        <div style="height: 200px;">
            <img style="height: 100%; width: 100%; " src="file:///C:/Users/Lee/eclipse-workspace/JSPTEAM/src/lee/source/bono1.png">
        </div>
        <p style=" margin-top: 60px; height: 120px; width: 200px; color: skyblue;">
            사이좋은 사람들.<br> 싸이월드<br>^_^</p>
        <yanadu style="width: 210px; display: block; text-align: left;">§profile

            <hr>
            <span id="id">싸이월드</span><span id="bir">(♂)1992.8.15</span><br>
            <span id="mail">ohseob@cyworld.com</span>
            <br>
           <a  target="_blank"  href="http://www.naver.com">네이버</a>  
           <a target="_blank"href="http://www.daum.net">다음</a>  
           <a  target="_blank"href="http://www.google.com">구글</a>  
        </yanadu>

    </center>
</body>

</html>