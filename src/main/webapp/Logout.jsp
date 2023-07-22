
<%@page language="java" pageEncoding="UTF-8"%>
<%
  HttpSession s = request.getSession(false);
  if(s != null){
    s.invalidate();
  }

  response.sendRedirect("index.jsp");
%>
