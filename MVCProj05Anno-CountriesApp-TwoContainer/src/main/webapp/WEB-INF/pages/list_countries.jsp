<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1 style="color:blue">List_countries.jsp</h1><br>
<c:choose>
    <c:when test="${!empty countriesInfo}">
      <h1 style="color:red;text-align:center">All countries are on date  :: ${sysDate}</h1>
    <c:forEach var="country" items="${countriesInfo}">
         <li><b>${country }</b></li>
    </c:forEach>
    </c:when>
    <c:otherwise>
          <h1 style="color:red;text-align:center">Not able to retrieve the countries</h1>
    </c:otherwise>
</c:choose>
<br>  Model data ::  <b>${sysDate }</b> &nbsp;&nbsp;&nbsp; <b>${requestScope.sysDate }</b> &nbsp;&nbsp;&nbsp;
<%=request.getAttribute("sysDate") %>

<br>
<br>
<a href="welcome">HOME</a>