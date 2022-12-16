<%-- 
    Document   : registration
    Created on : 26 Sep, 2022, 2:58:27 PM
    Author     : Amare
--%>
<%@ page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           String Id = request.getParameter("Id");
            String Name = request.getParameter("Name");
            String Phone = request.getParameter("Phone");
            String Email = request.getParameter("Email");
            String Address= request.getParameter("Address");
              String Month = request.getParameter("Month");
            String PICKUP_DATE = request.getParameter("PICKUP_DATE");
          
            
            
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pglife?useSSL=false", "root", "Sanu@123");
            Statement st=conn.createStatement();
            int i=st.executeUpdate("INSERT INTO booking(Id,Name, Phone, Email,Month,Address,PICKUP_DATE) values('"+Id+"','"+Name+"','"+Phone+"','"+Email+"','"+Address+"','"+Month+"','"+PICKUP_DATE+"')");
            out.println("Data is successfully inserted!");
            out.println(i);
            if(i == 1){
                String redirectURL = "adminDashboard.html";
                response.sendRedirect(redirectURL);
            }
            else{
                out.println("Data is not inserted!");
            }
        }
        catch(Exception e)
            {
            System.out.print(e);
            e.printStackTrace();
        }

        %>
    </body>
</html>
