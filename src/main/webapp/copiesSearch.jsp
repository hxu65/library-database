<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Copy Search</title>
</head>
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
	
	.button1 {background-color: #3747B6;} /* light green */
	.button2 {background-color: #44B63C;} /* green */
	.button3 {background-color: #C9DA18;} /* dark green */
	.button4 {background-color: #8D0EE4;} /* vintage red */ 
	
	</style>
<body>
	<h2>Search Cpoy</h2>
	<form action="CopiesManage/search" method="GET">
	<h2></h2>
		copy search by copy ID: <input type="text" name="iID">
		<h2></h2>
		 <input type="submit" value="search" class="button button1" />
	</form>
	<h2></h2>
		<form action="CopiesManage/searchMID" method="GET">
	<h2></h2>
		copy search by document ID: <input type="text" name="iID">
		<h2></h2>
		 <input type="submit" value="search" class="button button1" />
	</form>
	<h2></h2>
	<h2>List all copies</h2>
	<form action="CopiesManage/all" method="GET">
		<h2></h2>
		 <input
			type="submit" value="list" class="button button2" />
	</form>
	
</body>
</html>