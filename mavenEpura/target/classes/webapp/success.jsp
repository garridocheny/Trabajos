<%
    if ((session.getAttribute("idusuarios") == null) || (session.getAttribute("idusuarios") == "")) {
%>
You are not logged in<br/>
<a href="index.jsp">Please Login</a>
<%} else {
%>
Welcome <%=session.getAttribute("idusuarios")%>
<a href='logout.jsp'>Log out</a>
<%
    }
%>