/**
 * 
 */
 var t = null;
    t = setTimeout(time,100);//开始执行
    function time()
    {
       clearTimeout(t);//清除定时器
       dt = new Date();
       var h=dt.getHours();
       var m=dt.getMinutes();
       var s=dt.getSeconds();
       document.getElementById("timeShow").innerHTML =  "systemTime  "+h+":"+m+":"+s;
       t = setTimeout(time,1000); //设定定时器，循环执行             
    } 
    
    var html=document.documentElement;
    function fontS(){
   	 var hw=html.offsetWidth;
   	 var hs=hw/25;
   	 document.getElementById('mTitle').style.fontSize=hs+"px";
    }
    window.onresize=function(){
   	 fontS();
    }