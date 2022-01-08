<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Search</title>
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
	<h2>Search book</h2>
	<form action="bookManage/search" method="GET">
	<h2></h2>
		book search: <input type="text" name="iID">
		<h2></h2>
		 <input type="submit" value="search" class="button button1" />
	</form>
	<h2></h2>
	<h2>List all book</h2>
	<form action="bookManage/all" method="GET">
		<h2></h2>
		 <input
			type="submit" value="list" class="button button2" />
	</form>
	<h2>Delete book</h2>
	<form action="bookManage/delete" method="GET">
		<h2></h2>
		book search: <input type="text" name="iID">
		<h2></h2>
		 <input type="submit" value="delete" class="button button3" />
	</form>
	
	<h2></h2>
	<h2>Update book</h2>
	 <div >
    	<form action="bookManage/update" method="get">  
       		<table border="1" cellpadding="5">
       			<tr>
       				<th>Document ID: </th>
       				<td>
       					<input type="text" name="iID1" size="45"/>	
       				</td>
       			</tr>
       			<tr>
       				<th>Location: </th>
       				<td>
       					<input type="text" name="iID2" size="45"/>
       				</td>
       			</tr>
       			<tr>
       				<th>Type: </th>
       				<td>
       					<input type="text" name="iID3" size="45"/>
       				</td>
       			</tr>
       			<tr>
       				<th>Category: </th>
       				<td>
       					<input type="text" name="iID4" size="45"/>
       				</td>
       			</tr>
			</table> 
			<input type="submit" class="button button4"  value="update" align="center"/> 
		</form>
    </div>
	

	<h2>add new document</h2>
	 <div >
    	<form action="bookManage/insert" method="get">  
       		<table border="1" cellpadding="5">
       			<tr>
       				<th>Document ID: </th>
       				<td>
       					<input type="text" name="iID1" size="45"/>	
       				</td>
       			</tr>
       			<tr>
       				<th>Location: </th>
       				<td>
       					<input type="text" name="iID2" size="45"/>
       				</td>
       			</tr>
       			<tr>
       				<th>Type: </th>
       				<td>
       					<input type="text" name="iID3" size="45"/>
       				</td>
       			</tr>
       			<tr>
       				<th>Category: </th>
       				<td>
       					<input type="text" name="iID4" size="45"/>
       				</td>
       			</tr>
			</table> 
			<input type="submit" class="button button1"  value="add" align="center"/> 
		</form>
    </div>
</body>
</html>