<%@ page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/styles.css">

<script type="text/javascript" src="resources/js/validation.js">
</script>
<body>
<h1 >Registration Form For Covid-19 Vacctination</h1>
<h3>Please check all the detail once peroperly before submiting</h3>

<form:form method="POST" modelAttribute="citizen" onsubmit="return validate(this)">

    <%-- <p style="color:red;text-align:center">
          <form:errors  path="*"/>
    </p>  --%>
    
   <table   class="table table-striped">
       <tr>
      <td>Name ::</td>
      <td><form:input path="name"/><form:errors path="name" cssStyle="color:red"/><span id="nameErr"></span></td>
    </tr>
    <tr>
      <td>Addrs ::</td>
      <td><form:input path="addrs"/><form:errors path="addrs" cssStyle="color:red"/><span id="addrsErr"></span></td>
    </tr>
    <tr>
      <td>aadharNo ::</td>
      <td><form:input path="aadharNo"/><form:errors path="aadharNo" cssStyle="color:red"/><span id="aadharNoErr"></span></td>
    </tr>
     <tr>
      <td>Age ::</td>
      <td><form:input path="age"/><form:errors path="age" cssStyle="color:red"/><span id="ageErr"></span></td>
    </tr>
    <tr>
      <td>Vaccine name ::</td>
      <td><form:select path="vaccineName">
        <form:option value="">---Selecct a value---</form:option>
        <form:option value="COVAXIN">COVAXIN-INDIA</form:option>
        <form:option value="COVISHIELD">COVISHIELD-BRITAN</form:option>
        <form:option value="SPUTNIK">SPUINIK-RUSSIA</form:option>
        <form:option value="PYZER">PYZER-USA</form:option>
      </form:select> <form:errors path="vaccineName" cssStyle="color:red"/> <span id="vaccineNameErr"></span></td>
    </tr>
    <tr>
      <td>Income of the Year ::</td>
      <td><form:input path="income"/><form:errors path="income" cssStyle="color:red"/><span id="incomeErr"></span></td>
    </tr>
    <tr>
         <td colspan="2" align="center"><form:input type="hidden" path="vflag"/></td>
    </tr>
     
    <tr>
      <td colspan="2" align="center"><input type="submit" value="register"></td>
    </tr>
   </table>
  </form:form>
</body>