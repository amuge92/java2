<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
	<style>
table.game {
 width: 300px;
 height: 300px;
}

td.textTD {
    
 width: 60px;
 height: 60px;
 text-align: center;
 cursor: hand;
 font-weight: bold;
}
table{
    border:1px solid black;
}
</style>

<script>

var MAX_HORIZONTAL_COUNT = 5; //최대 행의 갯수
var MAX_VERTICAL_COUNT = 5;  //최대 열의 갯수

var finishFlag = false;   //완료 여부 플래그

var supernum=1;  //차례대로 올라갈 숫자
var time;

var q;
var w;
//change에 들어갈 변수 미리설정

 

/*
 * 게임 초기화
 */
function loadGame() {

 oTable = byId("gameTable"); //변수에 테이블 객체 할당
 init();      //초기화 함수
}

/*
 * 테이블값 초기화
 */
function init() {

 //초기화 메시지 보여주기
 var oDiv = byId("loading");
 oDiv.style.visibility = "visible";
 
 for (var i=0; i<gameTable.rows.length; i++) {
  var oRow = gameTable.rows[i];
  var oCells = oRow.cells;
  
  for (var j=0; j<oCells.length; j++) {
   var oCell = oCells[j];
   oCell.id = "";
   oCell.innerHTML = "-"; //내용을 기본값으로 '-'를 설정한다.
  }
 }


 
 //테이블값 섞기
 shuffle();

 //완료 여부 플래그 초기화
 finishFlag = false;
 
 //초기화 메시지 감추기
 oDiv.style.visibility = "hidden";
}

 

/*
 * 테이블값 섞기
 */
function shuffle() {

    for(i=0;i<MAX_HORIZONTAL_COUNT;i++){
            for(n=0;n<MAX_VERTICAL_COUNT;n++){
                document.getElementById("gameTable").rows[i].cells[n].style.backgroundColor="white";
            }
        }

    supernum=1;

    time=30;
        //체크한 모든색 초기화 하는코드



 //랜덤값이 저장될 배열
 var array = new Array();
 var max = MAX_HORIZONTAL_COUNT * MAX_VERTICAL_COUNT;

 //-1로 배열 초기화 
 for (var i=0; i<max; i++) {
  array[i] = -1;
 }
 
 for (var i=0; i<max; i++) {
   while (array[i] == -1) {
   var result = Math.floor(Math.random() * 25) + 1; 
   var contained = false;
   
   //새로운 랜덤값이 랜덤값 배열에 없는지 검사
   for (var j=0; j<array.length; j++) {
    if (result == array[j]) {
     contained = true;
     break;
    }
   }
   //랜덤값 배열에 없으면 할당
   if (!contained) {
    array[i] = result;
   }
  }
 }
 
 //게임 테이블에 랜덤값 배열의 값을 할당
 for (var i=0; i<MAX_HORIZONTAL_COUNT; i++) {
  //var oRow = gameTable.rows[i];
  var oRow=document.getElementById("gameTable").rows[i];
  var oCells = oRow.cells;
  
  for (var j=0; j<MAX_VERTICAL_COUNT; j++) {
  
   var oCell = oCells[j];
   if (oCell.id != "blank") {
    oCell.innerHTML = array[i*MAX_HORIZONTAL_COUNT+j*1];
   }
  }
 }
}

 

/*
 * document.getElementById(id) 함수를 줄여쓰기 위한 함수
 */
function byId(id) {
 return document.getElementById(id);
}


function change(q,w){
    
    if(supernum==document.getElementById("gameTable").rows[q].cells[w].innerHTML){

        document.getElementById("gameTable").rows[q].cells[w].style.backgroundColor="#b6fbff";
        //배경색을 회색으로
        supernum++;
        if(supernum>25){
            finishFlag=true;
            //여기에 확인페이지로 넘어갈수있게
        }
    }else{
        
        shuffle();
    }

    

}

var sec="";

var timeout = setInterval(function(){

    sec=time
    document.getElementById("timeout").innerHTML=sec+"초 남았습니다.";
    time--;

    if(time<=0){
       
        shuffle();
    }
},1000);

</script>
</head>
<body onload="loadGame();">

<!-- 초기화 메시지 div -->
<div id="loading" align="center" style="position:absolute; left:150px; top:150px; width:300px; height:50px; z-index:1; visibility: hidden; background-color:pink;">
초기화중입니다.
</div>
<div id="timeout"></div>
<!--
게임 테이블. 행수를 MAX_HORIZONTAL_COUNT에, 열수를 MAX_VERTICAL_COUNT과 맞추어야 한다.
-->
<table id="gameTable" class="game" border="1" style="border-collapse: collapse;">
 <tr>
  <td onclick="change(0,0);" class="textTD" >-</td>
  <td onclick="change(0,1);" class="textTD" >-</td>
  <td onclick="change(0,2);" class="textTD" >-</td>
  <td onclick="change(0,3);" class="textTD" >-</td>
  <td onclick="change(0,4);" class="textTD" >-</td>
 </tr>
 <tr>
  <td onclick="change(1,0);" class="textTD">-</td>
  <td onclick="change(1,1);" class="textTD">-</td>
  <td onclick="change(1,2);" class="textTD">-</td>
  <td onclick="change(1,3);" class="textTD">-</td>
  <td onclick="change(1,4);" class="textTD">-</td>
 </tr>
 <tr>
  <td onclick="change(2,0);" class="textTD">-</td>
  <td onclick="change(2,1);" class="textTD">-</td>
  <td onclick="change(2,2);" class="textTD">-</td>
  <td onclick="change(2,3);" class="textTD">-</td>
  <td onclick="change(2,4);" class="textTD">-</td>
 </tr>
 <tr>
  <td onclick="change(3,0);" class="textTD">-</td>
  <td onclick="change(3,1);" class="textTD">-</td>
  <td onclick="change(3,2);" class="textTD">-</td>
  <td onclick="change(3,3);" class="textTD">-</td>
  <td onclick="change(3,4);" class="textTD">-</td>
 </tr>
 <tr>
  <td onclick="change(4,0);" class="textTD">-</td>
  <td onclick="change(4,1);" class="textTD">-</td>
  <td onclick="change(4,2);" class="textTD">-</td>
  <td onclick="change(4,3);" class="textTD">-</td>
  <td onclick="change(4,4);" class="textTD"></td>
 </tr>
</table>

<br>
<input type="button" value="새로 시작하기" onclick="init();">

</body>
</html>