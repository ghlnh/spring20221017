<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
	<h1>공급자 정보 수정</h1>
	<form action="" method="get">
	<input type="number" name="id" placeholder="공급자ID" value="${supplier.id }">
	<input type="submit" value="조회">
	</form>	
	<hr>
	<form action=""></form>
	<form action="" method="post">
	<input type="text" value="${supplier.id }" name="id" readonly> <br>
	<input type="text" placeholder="이름" value="${supplier.name }" name="name">
	<br>
	<input type="text" placeholder="계약명" value="${supplier.conName }" name="conName">
	<br>
	<input type="text" placeholder="주소" value="${supplier.address }" name="address">
	<br>
	<input type="text" placeholder="도시" value="${supplier.city }" name="city">
	<br>
	<input type="text" placeholder="우편번호" value="${supplier.postalCode }" name="postalCode">
	<br>
	<input type="text" placeholder="나라" value="${supplier.country }" name="country">
	<br>
	<input type="text" placeholder="전화번호" value="${supplier.phone }" name="phone">
	<br>
	<input type="submit" value="수정">
	</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>