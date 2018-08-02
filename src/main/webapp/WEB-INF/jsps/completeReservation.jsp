<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 6/6/2018
  Time: 11:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Complete Reservation</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.bundle.min.js" integrity="sha384-pjaaA8dDz/5BgdFUPX6M/9SUZv4d12SUPF0axWc+VRZkx5xU3daN+lYb49+Ax+Tl" crossorigin="anonymous"></script>
</head>
<body>

<h2>Complete Reservation</h2>

Airline: ${flight.operatingAirlines}<br/>
Departure City: ${flight.departureCity}<br/>
Arrival City: ${flight.arrivalCity}<br/>

<form action="completeReservation" method="post">
    <pre>
        <h2>Passenger Details:</h2>
        FirstName: <input type="text" name="passengerFirstName"/>
        LastName: <input type="text" name="passengerLastName"/>
        Email: <input type="text" name="passengerEmail"/>
        Phone: <input type="text" name="passengerPhone"/>

        <h2>Card Details</h2>
        Name on the card:<input type="text" name="nameOnTheCard"/>
        Card Number:<input type="text" name="cardNumber"/>
        Expiry Date:<input type="text" name="expirationDate"/>
        Security Code:<input type="text" name="securityCode"/>

        <input type="hidden" name="flightId" value="${flight.id}"/>
        <input type="submit" value="confirm"/>
    </pre>
</form>
</body>
</html>
