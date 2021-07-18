<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<body style="background-color:lightblue;">
<h1 style="color:red;text-align:center">Employee Report</h1>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css">
 
 <blink><h1 style="color:red;text-align:center">${resultMsg }</h1></blink>
 

<c:choose>
  <c:when test="${!empty empsList }">
  <table class="table table-hover">
     <tr bgcolor="red"><th>empNo</th><th>empName</th><th>job</th><th>Salary</th><th>operation1</th><th>operation2</th></tr>
    <c:forEach var="emp" items="${empsList }">
    <tr>
      <td>${emp.empNo }</td>
      <td>${emp.ename }</td>
      <td>${emp.job }</td>
      <td>${emp.sal }</td>
      <td><a href="employee_edit?eno=${emp.empNo }"><img src="resources/images/edit.jpg"width="50" hight="50"></a></td>
      <td><a href="employee_delete?eno=${emp.empNo }"onclick="return confirm('Are you sure to Delete')"><img src="resources/images/delete.jpg"width="50" hight="50"></a></td>
      <td></td>
    </tr>
    </c:forEach>
  </table>
  </c:when>
  <c:otherwise>
     <h1 style="color:red;text-align:center">Record Not Found</h1>
  </c:otherwise>
</c:choose>
</body>