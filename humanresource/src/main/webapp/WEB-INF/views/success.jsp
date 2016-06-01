<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Submitted Employee Information</h2>
   <table>
    <tr>
        <td>First Name</td>
        <td>${firstname}</td>
    </tr>
    
    <tr>
        <td>Middle Name</td>
        <td>${middlename}</td>
    </tr>
    <tr>
        <td>Last Name</td>
        <td>${lastname}</td>
    </tr>
    <tr>
        <td>Title</td>
        <td>${Title}</td>
    </tr>
    <tr>
        <td>Date of Employment</td>
        <td>${DOE}</td>
    </tr>
    <tr>
        <td>Address</td>
        <td>${address}</td>
    </tr>
    <tr>
        <td>Salary</td>
        <td>${salary}</td>
    </tr>
    <tr>
        <td>Pension</td>
        <td>${pension}</td>
    </tr>
    <tr>
        <td>Loans</td>
        <td>${loans}</td>
    </tr>
    <tr>
        <td>Department</td>
        <td>${department}</td>
    </tr>
    
    <h1> Successfully added the Information</h1>
     <a href="<c:url value='/list' />">Display list of all Employees</a>
    
</table>  
</body>
</html>