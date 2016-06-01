    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>University Enrollments</title>
 
    <style>
        tr:first-child{
            font-weight: bold;
            background-color: #C6C9C4;
        }
    </style>
 
</head>
 
 
<body>
    <h2>List of Employees</h2>  
    <table>
            <tr  
     style="background-color: teal; color: white; text-align: center;"  
     height="40px">  
       
     <td>First Name &nbsp</td>  
     <td>Middle Name</td>  
     <td>Last Name</td>  
     <td>Title</td>
     <td>Date of Employment</td>
     <td>Address</td>
     <td>Salary</td>
     <td>Pension</td>
     <td>Loans</td>
     <td>Department</td>   
    </tr>  
        <c:forEach items="${emp}" var="employee">
            <tr>
            <td>${employee.firstname}</td>
            <td>${employee.middlename}</td>
            <td>${employee.lastname}</td>
            <td>${employee.title}</td>
            <td>${employee.doe}</td>
            <td>${employee.address}</td>
            <td>${employee.salary}</td>
            <td>${employee.pension}</td>
            <td>${employee.loans}</td>
            <td>${employee.department}</td>
            
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="<c:url value='/form' />">Add New Employee</a><br>
    <a href="<c:url value='/search' />">SearchEmployee</a>
</body>
</html>