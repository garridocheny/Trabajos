<%@ page import="java.sql.*"%>
<%
    String idtxtr = request.getParameter("idtxt");   
    String nametxtr = request.getParameter("nametxt");
    String emailtxtr = request.getParameter("emailtxt");
    String passwordtxtr = request.getParameter("passwordtxt");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bananagest",
            "root", "cheny123");
    Statement st = con.createStatement();
    int i = st.executeUpdate("insert into usuarios(idusuarios, username, email, password) values ('" + idtxtr + "','"
    + nametxtr + "','" + emailtxtr + "','" + passwordtxtr + "', CURDATE())");
    if (i > 0) {
        response.sendRedirect("welcome.jsp");
        
    } else {
        response.sendRedirect("index.jsp");
    }
%>