<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
            <img style="height: 20px; width: 20px; " src="�����̹���.png">
            <span style="cursor: pointer;" onclick="on()">�Ҽ��� �ϻ�</span>
        </div>
        <div class="a" style="">
            <img style="height: 20px; width: 20px; " src="�����̹���.png">
            <span style="cursor: pointer;" onclick="on()">���� ����</span>
        </div>
        <div class="a" style="height: 200px;">
            <img style="height: 20px; width: 20px; " src="�����̹���.png">
            <span style="cursor: pointer;" onclick="on()">���� ���</span>
        </div>
</body>

</html>