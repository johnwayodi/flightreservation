<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 6/4/2018
  Time: 1:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Register User</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.bundle.min.js" integrity="sha384-pjaaA8dDz/5BgdFUPX6M/9SUZv4d12SUPF0axWc+VRZkx5xU3daN+lYb49+Ax+Tl" crossorigin="anonymous"></script>
  </head>
  <body>
  <h2>User Registration</h2>
  <form action="registerUser" method="post">
    <pre>
    First Name: <input type="text" name="firstName"/>
    Last Name: <input type="text" name="lastName"/>
    User Name: <input type="text" name="email"/>
    Password: <input type="password" name="password"/>
    Confirm Password: <input type="password" name="confirmPassword"/>
    <input type="submit" value="register"/>
    </pre>
  </form>
  </body>
</html>
