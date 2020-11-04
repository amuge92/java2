<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>


<meta charset="EUC-KR">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
        integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
        crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"
        integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s"
        crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>  

    <meta name="viewport" content="width=device-width, initial-scale=1">


<!-- css부트스트랩 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

<c:choose>
<c:when test="${clear=='t'}">
<c:set var="str"  value="checked='checked' disabled='disabled'" />
</c:when>
<c:otherwise>
<c:set var="str"  value="" />
</c:otherwise>
</c:choose>

<script type="text/javascript">
window.onload = function (){
	var a=document.getElementById("aa");
    var b=document.getElementById("bb");
    var c=document.getElementById("cc");

    if(a.checked&&b.checked&&c.checked){
        var btn=document.getElementById('btn');
        btn.disabled = false;
    }
}

function ok() {
	var a=document.getElementById("aa");
    var b=document.getElementById("bb");
    var c=document.getElementById("cc");

    if(a.checked&&b.checked&&c.checked){
        var btn=document.getElementById('btn');
        btn.disabled = false;
    }else{
    	var btn=document.getElementById('btn');
    	btn.disabled = true;
    }
    
}



function oncl() {
	
	var c1 = document.getElementById("aa");
	var c2 = document.getElementById("bb");
	var cc1;
	var cc2;
	if(c1.checked && !c2.checked){
		cc1 = "check1";
		cc2 = ""
	}
	else if(c2.checked && !c1.checked){
		cc1 = ""
		cc2 = "check2";
	}
	
	else if(c1.checked && c2.checked){
		cc1 = "check1";
		cc2 = "check2"
	}else{
		cc1 = "";
		cc2 = "";
	}
	//location.href='minigame?check1='+cc1 + "&check2="+cc2;
	
	
	
	var n = Math.floor(Math.random()* 2);
	//이미지 크기를 전역변수로 둬서 바뀌게
	if (n == 0) {//만약에 그림찾기 게임이라면..
		
		var div = document.getElementById("div");
		var ran = Math.floor(Math.random() * 6);
		div.value=ran;
		
		var imgNum;
		//이미지가 몇번인지 같이 넘겨줘야함
		if (ran == 0) {
			imgW = 620;
			imgH = 639;
			var url = "minigame2?check1="+cc1 + "&check2="+cc2;
			window.open(url, '', 'width=630 ,height=740');
		}else if(ran == 1){
			var url = "minigame2?check1="+cc1 + "&check2="+cc2;
			window.open(url, '', 'width=630 ,height=580');
		}else if(ran == 2){
			var url = "minigame2?check1="+cc1 + "&check2="+cc2;
			window.open(url, '', 'width=630 ,height=580');
		}else if(ran == 3){
			var url = "minigame2?check1="+cc1 + "&check2="+cc2;
			window.open(url, '', 'width=490 ,height=710');
		}else if(ran == 4){
			var url = "minigame2?check1="+cc1 + "&check2="+cc2;
			window.open(url, '', 'width=630 ,height=580');
		}else if(ran == 5){
			var url = "minigame2?check1="+cc1 + "&check2="+cc2;
			window.open(url, '', 'width=470 ,height=740');
		}
	}
	if(n==1){
		var url="minigame1?check1="+cc1 + "&check2="+cc2;
		
		window.open(url, '', 'width=330 ,height=430');
	}

	return false;
	
	
}

function check1() {
	var ch=document.getElementById("aa");
    ch.checked=true;
}

function check2() {
	var ch=document.getElementById("bb");
    ch.checked=true;
}

</script>
</head>
<body>

<c:choose>
<c:when test="${che1 =='check1'}">
<c:set var="c1" value="checked"/>		
</c:when>
<c:otherwise>
<c:set var="c1" value=""/>		
</c:otherwise>
</c:choose>

<c:choose>
<c:when test="${che2 =='check2'}">
<c:set var="c2" value="checked"/>		
</c:when>
<c:otherwise>
<c:set var="c2" value=""/>		
</c:otherwise>
</c:choose>

<p style="margin: auto; width: 40%; margin-top: 5%;">
        <center>
            <h1>서비스 약관에 동의해 주세요. ${c1 } ${c2 }</h1>
            <div>
            </div>
            <br>
            <div style="margin: auto; width: 40%; margin-top: 5%;">
                <hr style="border: 3px solid black;">
                <table style="width: 100%;">
                    <tr style="width: 800px;">
                        <td width="30%">
                            <input id="aa" name="aa" type="checkbox" onchange="ok()" value="check1" ${c1 }>
                        </td>
                        <td width="70%"><label for="btn1" style="text-align: center;">게임즈 코리아 서비스 약관</label>에 동의(필수)</td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <hr>
                        </td>
                    </tr>
                    <tr style="width: 800px;">
                        <td width="30%" style="font-size: large;">
                            <input id="bb" name="bb" type="checkbox" onchange="ok()" value="check2" ${c2}>
                        </td>
                        <td width="70%">
                            <label for="btn2">개인정보 수집 및 이용</label>에 동의(필수)
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <hr>
                        </td>
                    </tr>
    
                    <tr style="width: 800px;">
                        <td width="30%" style="font-size: large;">
                            <input type="checkbox" ${str } id="cc" name="cc" onclick="return oncl()" onchange="ok()">
                        </td>
                        <td width="70%">
                            로봇이 아닙니까?
                        </td>
                    </tr>
                    
                    <tr>
                        <td colspan="2">


                            
                            <button type="submit" id="btn" class="btn btn-primary" disabled="disabled" onclick="location.href='gkjoin'"
                            style="font-weight: bolder; width: 100%;height: 50px; margin-top: 10px; background-color: #60adff; line-height: 40px; color: white; border: #ea8094;">
                            →</button></td>
                    </tr>
                </table>
            </div>
        </center>
        </p>
        <br>

    <!--숨겨진 버튼-->
    <button id="btn1" hidden type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
        버튼1
     </button>
     
 
     <!-- Modal -->
     <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
         <div class="modal-dialog">
             <div class="modal-content">
                 <div class="modal-header">
                     <h5 class="modal-title" id="exampleModalLabel">게임즈 코리아 서비스 약관</h5>
                     <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                         <span aria-hidden="true">&times;</span>
                     </button>
                 </div>
                <c:import url="/WEB-INF/views/modal1.jsp"></c:import>
                 <div class="modal-footer">
                     <button type="button" class="btn btn-secondary" data-dismiss="modal">취소</button>
                     <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="check1()">동의</button>
                 </div>
             </div>
         </div>
     </div>



     <button id="btn2" hidden type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal2">
        버튼2
     </button>
     
 
     <!-- Modal -->
     <div class="modal fade" id="exampleModal2" tabindex="-1" aria-labelledby="exampleModalLabel2" aria-hidden="true">
         <div class="modal-dialog">
             <div class="modal-content">
                 <div class="modal-header">
                     <h5 class="modal-title" id="exampleModalLabel2">개인정보 수집 및 이용</h5>
                     <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                         <span aria-hidden="true">&times;</span>
                     </button>
                 </div>
                 <div class="modal-body">
                    <c:import url="/WEB-INF/views/modal2.jsp"></c:import>
                 </div>
                 <div class="modal-footer">
                     <button type="button" class="btn btn-secondary" data-dismiss="modal">취소</button>
                     <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="check2()">동의</button>
                 </div>
             </div>
         </div>
     </div>
     <div id=div></div>
</body>
</html>

