<%@ page language="java" contentType="text/html; charset=UTF-8"  
 pageEncoding="UTF-8"%>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Human Resource | Edit Employee Details</title>  
</head>  
<body>  
 
  
  <div style="color: teal; font-size: 30px">Human Resource |  
   Edit Details</div>  
  
  
  
  
  <form:form id="myform" modelAttribute="searchResults" method="post" action="processform">  
   <table width="400px" height="150px"> 
   
     <tr>  
         <td><form:label path="empid">Employee ID</form:label>  
         </td>  
         <td><form:input path="empid" />  
         </td>  
     </tr>
    <tr>  
     <td><form:label path="firstname">First Name</form:label></td>  
     <td><form:input path="firstname" value="${searchResults.getFirstname()}" /></td>  
    </tr>  
    <tr>  
     <td><form:label path="middlename">Middle Name</form:label></td>  
     <td><form:input path="middlename" value="${searchResults.getMiddlename()}"/></td>  
    </tr> 
    <tr>  
     <td><form:label path="lastname">Last Name</form:label></td>  
     <td><form:input path="lastname" value="${searchResults.getLastname()}"/></td>  
    </tr> 
    <tr>  
     <td><form:label path="title">Job Title</form:label></td>  
     <td><form:input path="title" value="${searchResults.getTitle()}"/></td>  
    </tr>
    <tr>  
     <td><form:label path="doe">Date of Employment</form:label></td>  
     <td><form:input path="doe" value="${searchResults.getDoe()}"/> </td>
    <tr>  
    <tr>
     <td><form:label path="address">Address</form:label></td>  
     <td><form:input path="address" value="${searchResults.getAddress()}"/></td>  
    </tr>
    <tr>  
     <td><form:label path="salary">Salary</form:label></td>  
     <td><form:input path="salary" value="${searchResults.getSalary()}"/></td>  
    </tr> 
    <tr>  
     <td><form:label path="pension">Pension</form:label></td>  
     <td><form:input path="pension" value="${searchResults.getPension()}"/></td>  
    </tr>     
    <tr>  
     <td><form:label path="loans">Loans</form:label></td>  
     <td><form:input path="loans" value="${searchResults.getLoans()}"/></td>  
    </tr>  
    <tr>  
     <td><form:label path="department">Department</form:label></td>  
     <td><form:input path="department" value="${searchResults.getDepartment()}"/></td>  
    </tr>  
    <tr>  
     <td></td>  
     <td><input type="submit" name= "update" value="Update" />
     <td><input type="submit" name ="delete" value="delete" />
       
     </td>  
    </tr>  
   </table>  
  </form:form>  