<%--
  Created by IntelliJ IDEA.
  User: varduhisa
  Date: 2/18/2022
  Time: 4:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Registration</title>
    <!--mi ktor css errori hamar orenqov petq e arandzin lini bayc orinaki hamar os e -->
    <style>
        .error{
            color: crimson;
        }
        .errorblock{
            color: #4718ff;
            background-color: #8b7873;
            border: 3px solid #69ff7e;
            padding: 8px;
            margin: 16px;
        }
    </style>
    <form:form modelAttribute="registration">
        <form:errors path="*" cssClass="errorblock" element="div"/>
        <table>
            <tr>
                <td>
                    <spring:message code="name"/>
                </td>
                <td>
                    <form:input path="name"/>
                </td>
                <td>
                    <form:errors path="name" cssClass="error" />
                </td>
            </tr>
            <tr>
                <td colspan="3">
                    <input type="submit" value="Add Registration">
                </td>
            </tr>
        </table>
    </form:form>
</head>
<body>
<h1>Registration</h1>
</body>
</html>