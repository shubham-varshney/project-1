
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>ADD PRODUCT</h1>


<form:form action="productSubmitted" method="post" commandName="prod">

<div class="form-group">
<label for="name"> Product Name</label>
<form:input path="name" class="form-control" />

</div>

<div class="form-group">
<label for="description">Description</label>
<form:input path="description" class="form-control" />
</div>


<div class="form-group">
<label for="image">Product Image</label>
<form:input path="image" class="form-control" />
</div>



<div class="form-group">

<label for="price">price</label>
<form:input path="price" class="form-control" />
</div>


<div class="form-group">
<label for="quantity">Quantity</label>
<form:input path="Qnt" class="form-control" />
</div>


<div class="form-group">

<input type="submit" value="submit" class="btn btn-default" />

</div>


</form:form>



</body>
</html>