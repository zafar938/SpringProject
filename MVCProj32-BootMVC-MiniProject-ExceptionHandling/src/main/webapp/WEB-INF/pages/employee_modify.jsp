<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css">

<body style="background-color:lightblue;">
<h1 style="color:red;text-align:center">Employee Edit Form page</h1>

<table class="table table-bordered">
   <form:form modelAttribute="emp">
   <tr>
      <td>Employee No ::</td>
      <td><form:input path="empno"/></td>
   </tr>
   <tr>
      <td>Employee Name ::</td>
      <td><form:input path="ename"/></td>
   </tr>
   <tr>
      <td>Employee job ::</td>
      <td><form:input path="job"/></td>
   </tr>
   <tr>
      <td>Employee Sal ::</td>
      <td><form:input path="sal"/></td>
   </tr>
   <tr>
     <td colspan="2"><input type="image" src="images/submit.png" width="120px" height="40" align="center" alt="Submit"></td>
   </tr>
   
   </form:form>
</table>