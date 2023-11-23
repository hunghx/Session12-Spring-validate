<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: hung1
  Date: 11/23/2023
  Time: 7:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">


</head>
<body>
<h1>Đăng kí</h1>

<form:form method="post" action="/auth/sign-up" modelAttribute="register">

    <div class="mb-3">
        <label class="form-label">Username</label>
        <form:input path="userName" type="text" class="form-control"/>
        <form:errors path="userName" cssClass="text-danger" element="p"/>    </div>
    <div class="mb-3">
        <label class="form-label">Password</label>
        <form:input path="password" type="password" class="form-control"/>
        <form:errors path="password" cssClass="text-danger" element="p"/>

    </div>
    <div class="mb-3">
        <label class="form-label">Confirm Password</label>
        <form:input path="rePassword" type="password" class="form-control"/>
        <form:errors path="rePassword" cssClass="text-danger" element="p"/> <p style="color:red"></p>
    </div>
    <div class="mb-3">
        <label class="form-label">Phone</label>
        <form:input path="phone" type="text" class="form-control"/>
        <form:errors path="phone" cssClass="text-danger" element="p"/>
    </div>
    <div class="mb-3">
        <label class="form-label">Fullname</label>
        <form:input path="fullName" type="text" class="form-control"/>
        <form:errors path="fullName" cssClass="text-danger" element="p"/>

    </div>
    <button type="submit" class="btn btn-primary">Register</button>
</form:form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>

</body>
</html>
