<%@ page isELIgnored="false"%>
<body bgcolor="lightblue">
<h1 style="color:red;text-align:center">Pagination Example</h1>
   <form action="report" method="POST">
     <table align="center" bgcolor="cyan">
       <tr>
          <td>Enter page size ::</td>
          <td><input type="text" name="size"></td>
       </tr>
       <tr>
         <td colspan="2"><input type="submit" value="getReport"></td>
       </tr>
     </table>
   </form>
   </body>