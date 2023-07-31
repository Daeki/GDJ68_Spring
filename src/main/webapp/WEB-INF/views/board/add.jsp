<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
 	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Insert title here</title>

	<c:import url="../temp/bootStrap.jsp"></c:import>


</head>
<body>
	<c:import url="../temp/header.jsp"></c:import>
<section class="container mt-5">
		<h1 class="mb-3">NoticeAdd Page</h1>
		
		<form class="col-md-4 ms-auto" action="./add" method="post" enctype="multipart/form-data">
			<div class="row g-3 align-items-center">
				<label for="noticeSubject" class="col-form-label">제목</label>
				<input type="text" class="form-control" id="noticeSubject"  name="subject" placeholder="제목을 입력하세요"><br>
			</div>
			
			<div class="row g-3 align-items-center">
				<label for="noticeName" class="col-form-label mt-5">작성자</label>
				<input type="text" class="form-control" id="noticeName"  name="name" placeholder="작성자를 입력하세요"><br> 
			</div>
			
			<div class="row g-3 align-items-center">
				<label for="noticeContents" class="col-form-label mt-5">내용</label>
				<input type="textarea" class="form-control" id="noticeContents"  name="contents" placeholder="내용을 입력하세요"><br> 
			</div>
			
		
			
			
			<button type="submit" class="btn btn-success mt-5 me-3">글쓰기</button>
			<button type="reset" class="btn btn-success mt-5">다시입력</button>
			
			
		</form>
	</section>
</body>
</html>