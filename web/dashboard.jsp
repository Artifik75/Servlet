<%@page import="com.company.servlets.DashboardServlet"%>
<%@ page import="java.io.PrintWriter" %>
<!DOCUMENT html>
<html>
<head>
</head>
<body>

    <%
        for (int i = 0;i< DashboardServlet.map.size();i++) {
    %>
    <% PrintWriter op = response.getWriter();  op.println(DashboardServlet.map.get(i));op.println("</br>");  %>

    <%
        }
    %>

<form action="/Servletss_war_exploded/dashboard" method="post">
    Title: <input type="text" name="title">
    Author: <input type="text" name="author">
    Year: <input type="text" name="year">
    <button type="submit">Dodaj ksiazke </button>
</form>

<form action="/Servletss_war_exploded/dashboard" method="post">
    <select name="usun">
        <%  for (int i = 0;i< DashboardServlet.map.size();i++)  { %>
    <option value="<%=i %> " name="title">
            <%=DashboardServlet.map.get(i).getTitle() %>
    </option>
        <%
            }
        %>
    </select>
    <button type="submit">Usun ksiazke </button>
</form>



</body>
</html>