//랜덤값에 따라서 div를 새로 생성하는 코드를 만듦
            //div위치값을 줘서 div를 만들어놓고 위치를 변경
            //변수를 하나 설정해놓고 틀린그림 개수마다 값을 넣어줌
            //div클릭할때마다 하나씩 줄어들고 0이되면 페이지이동

            var clear; //맞춰야 하는수
            var LOL;   //문제수
			var ran = opener.document.getElementById("div").value;


            var imgary=new Array();
            imgary[0]="1.jpg";
            imgary[1]="2.jpg";
            imgary[2]="3.jpg";
            imgary[3]="4.jpg";
            imgary[4]="5.jpg";
            imgary[5]="6.jpg";

            function restart(){
	
            //var ran=Math.floor(Math.random()*6);
            
            var im=document.getElementById("img");
            im.src=imgary[ran];

            if(ran==0){
                
                LOL=10;   //문제 개수만큼 설정(링크를 그만큼 걸어야함)
                clear=LOL-3; //clear이 0이되면 게임끝!!
                var maple=document.getElementById("map");

                //x1 y1... 배열따로설정
                var locx1=[16,64,18,74,132,234,319,558,365,547];
                var locy1=[380,416,477,480,458,391,442,397,575,568];
                var locx2=[58,108,57,123,198,308,375,594,420,590];
                var locy2=[424,450,517,516,496,435,485,425,617,612];
                
                for(var i=0;i<LOL;i++){
                var story=document.createElement("area");
                var m=locx1[i]+","+locy1[i]+","+locx2[i]+","+locy2[i]
                story.setAttribute("shape","rect");
                story.setAttribute("coords",m);
                story.addEventListener("click",function(){
                    up();
                },{once:true})
                maple.appendChild(story);
                }
				
				
            }
			

            if(ran==1){
                
                LOL=6;   //문제 개수만큼 설정(링크를 그만큼 걸어야함)
                clear=LOL-2; //clear이 0이되면 게임끝!!
                var maple=document.getElementById("map");

                //x1 y1... 배열따로설정
                var locx1=[331,502,556,501,478,527];
                var locy1=[62,136,193,274,293,338];
                var locx2=[377,531,573,514,503,546];
                var locy2=[112,167,216,296,309,358];
                
                for(var i=0;i<LOL;i++){
                var story=document.createElement("area");
                var m=locx1[i]+","+locy1[i]+","+locx2[i]+","+locy2[i]
                story.setAttribute("shape","rect");
                story.setAttribute("coords",m);
                story.addEventListener("click",function(){
                    up();
                },{once:true})
                maple.appendChild(story);
                }
            }

            if(ran==2){
                
                LOL=10;   //문제 개수만큼 설정(링크를 그만큼 걸어야함)
                clear=LOL-4; //clear이 0이되면 게임끝!!
                var maple=document.getElementById("map");

                //x1 y1... 배열따로설정
                var locx1=[358,401,379,427,393,443,450,362,396,435];
                var locy1=[170,196,232,232,269,267,295,331,333,375];
                var locx2=[381,414,407,454,422,461,481,380,417,454];
                var locy2=[187,208,251,248,295,282,314,349,348,397];
                
                for(var i=0;i<LOL;i++){
                var story=document.createElement("area");
                var m=locx1[i]+","+locy1[i]+","+locx2[i]+","+locy2[i]
                story.setAttribute("shape","rect");
                story.setAttribute("coords",m);
                story.addEventListener("click",function(){
                    up();
                },{once:true})
                maple.appendChild(story);
                }
            }

            if(ran==3){
                
                LOL=5;   //문제 개수만큼 설정(링크를 그만큼 걸어야함)
                clear=LOL-2; //clear이 0이되면 게임끝!!
                var maple=document.getElementById("map");

                //x1 y1... 배열따로설정
                var locx1=[329,357,117,37,394];
                var locy1=[322,374,422,476,468];
                var locx2=[343,377,171,107,412];
                var locy2=[342,395,476,535,486];
                
                for(var i=0;i<LOL;i++){
                var story=document.createElement("area");
                var m=locx1[i]+","+locy1[i]+","+locx2[i]+","+locy2[i]
                story.setAttribute("shape","rect");
                story.setAttribute("coords",m);
                story.addEventListener("click",function(){
                    up();
                },{once:true})
                maple.appendChild(story);
                }
            }

            if(ran==4){
                
                LOL=8;   //문제 개수만큼 설정(링크를 그만큼 걸어야함)
                clear=LOL-3; //clear이 0이되면 게임끝!!
                var maple=document.getElementById("map");

                //x1 y1... 배열따로설정
                var locx1=[396,402,405,392,506,540,385,430];
                var locy1=[98,122,187,214,197,195,326,384];
                var locx2=[435,436,473,413,525,571,567,543];
                var locy2=[112,136,188,230,209,224,317,391];
                
                for(var i=0;i<LOL;i++){
                var story=document.createElement("area");
                var m=locx1[i]+","+locy1[i]+","+locx2[i]+","+locy2[i]
                story.setAttribute("shape","rect");
                story.setAttribute("coords",m);
                story.addEventListener("click",function(){
                    up();
                },{once:true})
                maple.appendChild(story);
                }
            }

            if(ran==5){
                
                LOL=10;   //문제 개수만큼 설정(링크를 그만큼 걸어야함)
                clear=LOL-3; //clear이 0이되면 게임끝!!
                var maple=document.getElementById("map");

                //x1 y1... 배열따로설정
                var locx1=[159,47,311,172,253,198,425,410,412,385];
                var locy1=[334,386,403,525,520,581,495,544,578,616];
                var locx2=[201,81,344,198,294,232,454,436,443,418];
                var locy2=[356,416,431,552,548,606,537,572,605,636];
                
                for(var i=0;i<LOL;i++){
                var story=document.createElement("area");
                var m=locx1[i]+","+locy1[i]+","+locx2[i]+","+locy2[i]
                story.setAttribute("shape","rect");
                story.setAttribute("coords",m);
                story.addEventListener("click",function(){
                    up();
                },{once:true})
                maple.appendChild(story);
                }
            }

            }

            function up(){
                var x=event.x;
                var y=event.y;

                var mm=document.body
                var nn=document.createElement("img");
               
                nn.style.left=(x-10)+"px";
                nn.style.top=(y-10)+"px";
                nn.setAttribute("id","iam");
                nn.setAttribute("src","good.png");

                mm.appendChild(nn);
                clear--;
				
                if(clear==0){
                opener.location.href="index?clear=true";
				window.close();
                }
            }