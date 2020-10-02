window.onload = function () {
    var time = new Date;
    var t = time.toLocaleTimeString();
    var a = document.getElementById('time');
    a.innerHTML = t;
   var v =  setInterval(function () {
        var time = new Date;
        var t = time.toLocaleTimeString();
        var a = document.getElementById('time');
        a.innerHTML = t;
    }, 1000);
    // clearInterval(v)
}