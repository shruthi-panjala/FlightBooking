<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="bootstrap.css">
<link rel="stylesheet" href="bootstrap.min.css">
<link rel="stylesheet" href="bootstrap-theme.css">
<link rel="stylesheet" href="bootstrap-theme.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<script src="bootstrap.min.js"></script>	
<script src="ticketBooked.js"></script>	
<title>SkylineDreams</title>
<style>
h2{  
color:blue;   
padding:5px;  
} 
h3{  
color:blue;  
background-color:fuchsia;  
padding:5px;  
} 
</style>
</head>
<body>
<div class="jumbotron"><div class="form-group"> 
	<h2 align="center">Skyline Dreams</h2>
<h3 align="center" ><i>Your ticket is booked...!!Check details...</i></h3>
<hr bgcolor="orange">
<table align="center">

<form name="myform" method="post" action="confirm">

<tr><td>Country</td><td>${t34.country}</td></tr>
<td>City</td><td>${t34.city}</td></tr>
<td>Date ofJourney</td><td>${t34.doj}</td></tr>
<td color="red">Return Date</td><td>${t34.doj}</td></tr>
<td>Ticket#</td><td>${t34.ticketNo}</td></tr>
<td>Checking Counter</td><td>${t34.checkInCounter}</td></tr>
<td>Seat#</td><td>${t34.seatNo}</td></tr>
<td>Filght</td><td>${t34.flightNo}</td></tr>
<td>Gender</td><td>${t34.gender}</td></tr>
<td>Email</td><td>${t34.emailId}</td></tr>

</form>
</div>
</div>
</table>
<p align="right"><button id="print" type="button" class="btn btn-default btn-lg" onclick="printPage()"><span class="glyphicon glyphicon-print" aria-hidden="true"></span>print</button></p>

</body>
</html>