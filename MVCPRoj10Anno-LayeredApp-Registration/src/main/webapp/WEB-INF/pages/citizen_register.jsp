<%@ page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css">

<h1 style="color:green;text-align:center">Registration Form For Covid-19 Vacctination</h1>

<form:form method="POST" modelAttribute="citizen">
   <table class="table table-striped">
       <tr>
      <td>Name ::</td>
      <td><form:input path="name"/></td>
    </tr>
    <tr>
      <td>Addrs ::</td>
      <td><form:input path="addrs"/></td>
    </tr>
    <tr>
      <td>aadharNo ::</td>
      <td><form:input path="aadharNo"/></td>
    </tr>
    <tr>
      <td>Vaccine name ::</td>
      <td><form:select path="vaccineName">
        <form:option value=" ">---Selecct a value---</form:option>
        <form:option value="COVAXIN">COVAXIN-INDIA</form:option>
        <form:option value="COVISHIELD">COVISHIELD-BRITAN</form:option>
        <form:option value="SPUTNIK">SPUINIK-RUSSIA</form:option>
        <form:option value="PYZER">PYZER-USA</form:option>
      </form:select></td>
    </tr>
    <tr>
      <td>Income of the Year ::</td>
      <td><form:input path="income"/></td>
    </tr>
    <tr>
      <td colspan="2" align="center"><input type="submit" value="register"></td>
    </tr>
   </table>
  </form:form>
