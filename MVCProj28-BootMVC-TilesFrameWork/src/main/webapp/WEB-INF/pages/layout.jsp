<%@ page isELIgnored="false" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<head>
  <title><tiles:insertAttribute name="title"/></title>
</head>
<table border="0" width="100%" height="100%" rows="3" cols="3" bgcolor="lightblue">
<tr height="20%" width="100%" bgcolor="cyan">
<td colspan="2"><tiles:insertAttribute name="header"/></td>
</tr>
<tr height="70%" bgcolor="pink">
<td width="15%"><tiles:insertAttribute name="menu"/></td>
<td width="75%"><tiles:insertAttribute name="body"/></td>
<td width="10%"><tiles:insertAttribute name="advertisment"/></td>
</tr>
<tr height="10%" bgcolor="grey">
<td colspan="2"><tiles:insertAttribute name="footer"/></td>
</tr>

</table>