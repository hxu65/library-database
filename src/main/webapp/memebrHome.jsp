<html>
<body>
<head>
<meta charset="utf-8">
<title>Member Home</title>
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

.button1 {background-color: #A3D2CA;} /* light green */
.button2 {background-color: #5EAAA8;} /* green */
.button3 {background-color: #DA7F8F;} /* vintage red */ 
</style>
</head>
	<div style="text-align: center">
		<h1>Welcome back to Library!</h1>
		<br/><br/>
		
		<form action = "memberSearch.jsp" method = "GET">
     <h2> </h2>
     <input type = "submit" value = "Search" class="button button1" />
     </form>  
		
    	<br/><br/>
    	<form action = "borrowSearch.jsp" method = "GET">
     <h2> </h2>
     <input type = "submit" value = "borrow" class="button button1" />
     </form> 
		<br/><br/>
    	<form action = "homepage.jsp" method = "GET">
     <h2> </h2>
     <input type = "submit" value = "logout" class="button button1" />
     </form> 
	</div>
</body>
</html>