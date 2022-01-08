<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<h2>Confirm add book request</h2>
	<form action="bookManage/insert" method="get">  
	<h2>Please make sure the book is in document table</h2>
       Book ID:<input type="text" name="iID1"/><br/><br/>   
	   Book ISBN:<input type="text" name="iID2"/><br/><br/>
	     Book title:<input type="text" name="iID3"/><br/><br/>  
	       Book publish data:<input type="text" name="iID4"/><br/><br/>    
		<br/><br/>  
		<input type="submit"/>  
</form>  
<form action="AllMembers2" method="get">
    <button type="submit" class="button button1" >Show Members</button>
    </form> 
    <form action="ManageBR" method="get">
    <button type="submit" class="button button2" >Show Borrow/Return History</button> <!-- ManageBR.jsp -->
    </form>
</body>
</html>