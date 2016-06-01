    <%@ page language="java" contentType="text/html; charset=UTF-8"  
     pageEncoding="UTF-8"%>  
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
    <html>  
    <head>  
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
    <title>Human Resource| Registration Form</title>  
    </head>  
    <body>  
     <center>  
      
      <div style="color: teal; font-size: 30px">Human Resource web application|  
       Registration Form</div>  
      
      
      
     
      <form:form id= "" action="/Humanresource/Register" modelAttribute="employee" method="post">  
       <table width="400px" height="150px">  
        <tr>  
         <td><form:label path="firstname">First Name</form:label>  
         </td>  
         <td><form:input path="firstname" />  
         </td>  
        </tr> 
        <tr>  
         <td><form:label path="middlename">Middle Name</form:label>  
         </td>  
         <td><form:input path="middlename" />  
         </td>  
        </tr> 
        <tr>  
         <td><form:label path="lastname">Last Name</form:label>  
         </td>  
         <td><form:input path="lastname" />  
         </td>  
        </tr>
        <tr>  
         <td><form:label path="title"> Title</form:label>  
         </td>  
         <td><form:input path="title" />  
         </td>  
        </tr>
        <tr>  
         <td><form:label path="doe">Date of Employment</form:label>  
         </td>  
         <td><form:input path="doe" />  
         </td>  
        </tr> 
         <tr>  
         <td><form:label path="address">address</form:label>  
         </td>  
         <td><form:input path="address" />  
         </td>  
        </tr>
        <tr>  
         <td><form:label path="salary">Salary</form:label>  
         </td>  
         <td><form:input path="salary" />  
         </td>  
        </tr>
        
        <tr>  
         <td><form:label path="pension">Pension</form:label>  
         </td>  
         <td><form:input path="pension" />  
         </td>  
        </tr>
        <tr> 
        <tr> 
         <td><form:label path="loans">Loans</form:label>  
         </td>  
         <td><form:input path="loans" />  
         </td>  
        </tr>
          
        <tr>  
         <td><form:label path="department">Department</form:label>  
         </td>  
         <td><form:input path="department" />  
         </td>  
        </tr>  
        <tr>  
         <td></td>  
         <td><input type="submit" value="Register" /></td>  
        </tr>  
       </table>  
      </form:form>  
      
      
      <a href="<c:url value='/list' />">Click Here to see User List</a>  
     </center>  
    </body>  
    </html>  

