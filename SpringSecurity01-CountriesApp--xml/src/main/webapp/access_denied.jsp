<%@ page isELIgnored="false"%>

<%@page import="org.springframework.security.core.context.*, org.springframework.security.core.*" %>

<%Authentication auth=SecurityContextHolder.getContext().getAuthentication();
  String name=auth.getName();
%>
<h1 style="color: red; text-align: center">The user  <%=name %> ::: Access denied</h1>
<br>
<a href="welcome">HOME</a>"