<html>  
<body>  
<%  
String name=request.getParameter("uname");  
out.print("welcome "+name);  
%>  
<%="\nWelcome String from Expression JSP Tag" %>
<h1>Current Time: <%= java.util.Calendar.getInstance().getTime() %></h1>

<%!   
int cube(int n){  
return n*n*n;  
}  
%>  
<%= "Cube of 3 is:"+cube(3) %>  

</body>  
</html>  