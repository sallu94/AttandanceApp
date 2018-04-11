var months = new Array(12);
months[0] = "Jan";
months[1] = "Feb";
months[2] = "Mar";
months[3] = "Apr";
months[4] = "May";
months[5] = "Jun";
months[6] = "Jul";
months[7] = "Aug";
months[8] = "Sep";
months[9] = "Oct";
months[10] = "Nov";
months[11] = "Dec";



function startTime() {
    var today = new Date();
    var h = today.getHours()%12;
    var m = today.getMinutes();
    var s = today.getSeconds();
    var date = today.getDate() + " " + months[today.getMonth()] + " "+ today.getFullYear();
    h	 = checkTime(h);
    m = checkTime(m);
    s = checkTime(s);
    document.getElementById('clock').innerHTML =
    h + ":" + m + ":" + s;
    document.getElementById('date').innerHTML =
        date;
    var t = setTimeout(startTime, 500);
}


function checkTime(i) {
    if (i < 10) {i = "0" + i}; 
    return i;
}


$(document).ready(function () {

    $('#closeMenu').on('click', function () {
    $('#sidebar').toggleClass('active');
    $('#teachersName').toggle();
    
    if ($(this).attr("src") === "icons/left.png"){
    	$(this).attr("src" , "icons/right.png");
    }else if($(this).attr("src") === "icons/right.png"){
    	$(this).attr("src" , "icons/left.png");
    }
    
    if ($("#ymcaLogo").attr("height") == 100){
    	$("#ymcaLogo").attr("height" , 40 );
    	$("#ymcaLogo").attr("width" , 40 );
    	$("#ymcaLogo").css('margin-left' , '-30px');
    	$("#closeMenu").css('margin-left' , '10px');
    	$("#closeMenu").css('margin-top' , '-50px');
    	$("#ymcaText").text("YMCA");
    	
    }else if ($("#ymcaLogo").attr("height") != 100){
    	$("#ymcaLogo").attr("src" , "icons/ymca.png");
    	$("#ymcaLogo").attr("height" , 100 );
    	$("#ymcaLogo").attr("width" , 100 );
    	$("#ymcaLogo").css('margin-left' , '30px');
    	$("#closeMenu").css('margin-top' , '30px');
    	$("#ymcaText").text("YMCA University \n Attendence Management System");
    }
    
    
    });
    
    
});
