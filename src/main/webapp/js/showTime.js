/**
 * 
 */
 var t = null;
    t = setTimeout(time,1000);//开始执行
    function time()
    {
       clearTimeout(t);//清除定时器
       dt = new Date();
       var h=dt.getHours();
       var m=dt.getMinutes();
       var s=dt.getSeconds();
       document.getElementById("timeShow").innerHTML =  "Time  "+h+":"+m+":"+s;
       t = setTimeout(time,1000); //设定定时器，循环执行             
    } 