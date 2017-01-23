<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SkylineDreams</title>
</head>
<body>
<h2 align="center">welcome to SkyDreams Airline</h2>
<h3 align="center" >following are ur travel details</h3>
<hr bgcolor="orange">
<table border="1" align="center">

<form name="myform" method="post" action="confirm">
<tr><td>Country</td><td><jsp:getProperty property="country" name="ticket"/></td></tr>
<td>City</td><td><jsp:getProperty property="city" name="ticket"/></td></tr>
<td>Date ofJourney</td>${t34.doj}<td></td></tr>
<td>Ticket#</td><td>${t34.ticketNo}</td></tr>
<td>Checking Counter</td><td>${t34.checkInCounter}</td></tr>
<td>Seat#</td><td>${t34.seatNo}</td></tr>
<td>Filght</td><td>${t34.flightNo}</td></tr>
<td>Gender</td><td>${t34.gender}</td></tr>

<td>Click to submit</td><td><input type="submit" name="Submit"><input type="reset" name="Reset"></td></tr>
</form>
</table>

</body>
</html>