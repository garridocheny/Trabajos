<%@ page import="java.sql.*"%>
<%
    String userName = request.getParameter("username");   
    String password = request.getParameter("password");
    System.out.println("Usuario:"+userName);
    System.out.println("Contraseña:"+password);
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bananagest",
            "root", "cheny123");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from usuarios where username='" + userName + "' and password='" +password + "'");
    if (rs.next()) {
        session.setAttribute("idusuarios", userName);
        System.out.println("Variable de sesión configurada");
        response.sendRedirect("success.jsp");
    } else {
        out.println("Invalid password <a href='index.jsp'>try again</a>");
    }
%>