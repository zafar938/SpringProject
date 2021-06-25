<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

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
     <table border="1" align="left" bgcolor="cyan">
       <tr><th>sno</th><th>sname</th><th>sadd</th><th>Avg</th>
       <c:if test="${!empty data6 }">
          <c:forEach var="dto" items="${data6}">
           <tr>
            <td>${dto.sno}</td>
            <td>${dto.sname}</td>
            <td>${dto.sadd}</td>
            <td>${dto.avg}</td>
            </tr>
          </c:forEach>
       </c:if>
       
       </table>
       