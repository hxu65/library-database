<%@ page import="com.cs425.web.model.Copies"%>
<%@ page import ="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Manage Documents</title>
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
	.button3 {background-color: #056676;} /* dark green */
	.button4 {background-color: #DA7F8F;} /* vintage red */ 
	
	</style>
</head>
<body>
  
 <% ArrayList<Copies> std = (ArrayList<Copies>)request.getAttribute("Copies");
  for(Copies s:std){
 }%>
  
  
          
</form>

<div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Copies</h2>
            </caption>
            <tr>
                <th>ID</th>
                <th>Location</th>
                <th>Copy_ID</th>
                <th>Borrowed</th>
                <th>Actions</th>
            </tr>
            <%
        	for(Copies s:std){%>
        	<%-- Arranging data in tabular form
        	--%>
            <tr>
                <td><%=s.getD_ID()%></td>
                <td><%=s.getLocation()%></td>
                <td><%=s.getCopy_ID()%></td>
                <td><%=s. getBorrowed()%></td>
                <td>
                                           
                    </td>
                
            </tr>
            <%}%>
        </table>
    </div>
    <center>
    <br/><br/> 
    </center> 
</body>
</html>