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



//SideNav Button Initialization
$(".button-collapse").sideNav();
//SideNav Scrollbar Initialization
var sideNavScrollbar = document.querySelector('.custom-scrollbar');
Ps.initialize(sideNavScrollbar);

$('.button-collapse').sideNav({
	edge: 'right', // Choose the horizontal origin
	closeOnClick: true // Closes side-nav on <a> clicks, useful for Angular/Meteor
	});

//Show sideNav
$('.button-collapse').sideNav('show');
// Hide sideNav
$('.button-collapse').sideNav('hide');
