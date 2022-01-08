<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Hi Library Member! Welcome back Library system with data mining!</title>
<style>
.button {
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

.button1 {background-color: #87A7B3;} /* grey blue */
.button2 {background-color: #DA7F8F;} /* vintage red */ 
</style>
</head>
<body>
    <div style="text-align: center">
        <h1>Library Member Login</h1>
        <form action = "login" method = "GET">
       <h2> </h2>
         email: <input type = "text" name = "email">
         <h2> </h2>
         password: <input type = "text" name = "password">
         <h2> </h2>
         <input type = "submit" value = "login" />
      </form>
         <h2> </h2>
          <h1>New member? Please register here!</h1>
        <form action = "memberManage/insert" method = "GET">
       <h2> </h2>
         member ID: <input type = "text" name = "iID1">
         <h2> </h2>
         email: <input type = "text" name = "iID2">
         <h2> </h2>
         name: <input type = "text" name = "iID3">
         <h2> </h2>
         password: <input type = "text" name = "iID4">
         <h2> </h2>
         <input type = "submit" value = "Register"/>
      </form>
    </div>
</body>
</html>