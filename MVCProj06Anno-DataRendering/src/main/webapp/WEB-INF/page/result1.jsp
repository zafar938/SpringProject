<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css">

<div class="container  col-sm-4" style="background:pink">
<b> Data1 :: ${ data1}</b><br>
<b> Data2(array) :: </b>
     <c:forEach var="e" items="${data2}">
         ${e},
     </c:forEach>
     <br>
     <b>Data3(List) :: ${data3}</b><br>
     <b>Data4(Set)  :: ${data4}</b><br>
     <b>Data5(Map)  :: ${data5 } </b><br>
       <c:forEach var="map"  items="${data5}">
          ${map.key}  --->  ${map.value} ,
     </c:forEach>
     <br>
     <b>Data6(ListDTO) :: </b><br>
     <table  class="table table-bordered">
       <tr class="table-dark"><th>sno</th><th>sname</th><th>sadd</th><th>Avg</th></tr>
       <c:if test="${!empty data6 }">
          <c:forEach var="dto" items="${data6}">
           <tr class="bg-danger">
            <td class="table-danger">${dto.sno}</td>
            <td>${dto.sname}</td>
            <td>${dto.sadd}</td>
            <td class="table-primary">${dto.avg}</td>
            </tr>
          </c:forEach>
       </c:if>
       
       </table>
       </div>
       