<%--
  Created by IntelliJ IDEA.
  User: shekh
  Date: 6/16/2021
  Time: 7:19 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>List Products</title>
</head>

<body>
    <table border="1">
        <g:each in="${allProducts}" var="thisProduct">
            <tr>
                <td>${thisProduct.name}</td>
                <td>${thisProduct.price}</td>
                <td>${thisProduct.sku}</td>
            </tr>
        </g:each>
    </table>
</body>
</html>