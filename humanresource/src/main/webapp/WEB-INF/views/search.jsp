<%@ page language="java" contentType="text/html; charset=UTF-8"  
     pageEncoding="UTF-8"%>  
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
    <html>  
    <head>  
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
    <title>Human Resource| Search Form</title>  
    </head>  
    <body>       
      <div style="color: teal; font-size: 30px">  Search Form</div>  
      
      <form:form action="submitSearch" modelAttribute="searchParams" method="GET" id="userSearchForm" >
        <table id="search" class="display" border="0" cellpadding="0" width="60%" valign="top">
        <tbody>
            <tr id="name">
                <td><label for="empid">Employee ID:</label></td> 
                <td><form:input id="empid" path="empid" type="text" /></td> 
            </tr>
            

    </table>
    <input id="submit_button" type="submit" name="submitButton" value="Search" > <br/>
    </form:form>  