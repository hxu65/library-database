<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Borrow and Return</title>
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
	
	
	
	<h2>submit borrow request</h2>
	 <div >
    	<form action="borrowManage/insert" method="get">  
       		<table border="1" cellpadding="5">
       			<tr>
       				<th>Document ID: </th>
       				<td>
       					<input type="text" name="iID1" size="45"/>	
       				</td>
       			</tr>
       			<tr>
       				<th>member ID: </th>
       				<td>
       					<input type="text" name="iID1" size="45"/>	
       				</td>
       			</tr>
       			<tr>
       				
			</table> 
			<input type="submit" class="button button4"  value="update" align="center"/> 
		</form>
    </div>
    
    <h2>return the book</h2>
	 <div >
    	<form action="borrowManage/insert" method="get">  
       		<table border="1" cellpadding="5">
       			<tr>
       				<th>Document ID: </th>
       				<td>
       					<input type="text" name="iID1" size="45"/>	
       				</td>
       			</tr>
       			<tr>
       				<th>member ID: </th>
       				<td>
       					<input type="text" name="iID1" size="45"/>	
       				</td>
       			</tr>
       			<tr>
       				<th>copy ID: </th>
       				<td>
       					<input type="text" name="iID1" size="45"/>	
       				</td>
       			</tr>
       			<tr>
       				
			</table> 
			<input type="submit" class="button button4"  value="update" align="center"/> 
		</form>
    </div>
    
	
	
</body>
</html>