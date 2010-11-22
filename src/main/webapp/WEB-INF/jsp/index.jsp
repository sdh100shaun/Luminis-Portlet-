<%@ page import="javax.portlet.RenderResponse" %>
<%--
  Created by Shaun Hare and David Simpson
  Version 1.0 11.11.2010
  Sample view file
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet"%>



<portlet:defineObjects/>



<div>



    <p>This is the index View and my name is something like <c:out value="${person.getFullName()}"/></p>

   

</div>
