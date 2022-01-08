<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search information here</title>
	<style>
	.button {
	  border: none;
	  color: white;
	  padding: 10px 15px;
	  text-align: center;
	  text-decoration: none;
	  display: inline-block;
	  font-size: 14px;
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
<h2>Search the requirement material</h2>
	<form action = "DocumentSearch.jsp" method = "GET">
     <h2> </h2>
     <input type = "submit" value = "Document" class="button button1" />
     </form>     
      
      
    <form action = "bookSearch.jsp" method = "GET">
       <h2> </h2>
     <input type = "submit" value = "Book" class="button button2" />
     </form>
      
      
    <form action="authorSearch.jsp" method="get">  
      <h2> </h2>
	<input type="submit"  value = "Author" class="button button4"/>  
	</form>  

    <form action = "journalArticleSearch.jsp" method = "GET">
      <h2> </h2>
    <input type = "submit" value = "Magazines" class="button button1" />
    </form>
    
    
    
    
    
 <h2> Still did not find the document you looking for</h2>  
 <h2> try Google Search</h2> 
    <form action="googleSearch">  
<input type="text" name="name">  
<input type="submit" value="Google Search">  
</form>  
      

      
      
</body>
</html>