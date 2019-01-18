<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="staticElements/navBar.jsp"%>
<div class="container">
	<div class="row justify-content-md-center">
		<div class="col-md-auto">
			<h2>${randomQuestion.getQuestion()}</h2>
		</div>
	</div>
	<form method="POST" action="/random">
		<div class="form-check">
			<input class="form-check-input" type="radio" name="question"
				id="answerA" value="${randomQuestion.getAnswerA()}"> <label
				class="form-check-label" for="answerA">
				${randomQuestion.getAnswerA()}</label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio" name="question"
				id="answerB" value="${randomQuestion.getAnswerB()}"> <label
				class="form-check-label" for="answerB">${randomQuestion.getAnswerB()}</label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio" name="question"
				id="answerC" value="${randomQuestion.getAnswerC()}"> <label
				class="form-check-label" for="answerC">
				${randomQuestion.getAnswerC()}</label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio" name="question"
				id="answerD" value="${randomQuestion.getAnswerD()}"> <label
				class="form-check-label" for="answerD">
				${randomQuestion.getAnswerD()}</label>
		</div>
		<div class="row justify-content-md-center">
			<button class="btn btn-primary" type="submit">Submit form</button>
		</div>
	</form>

</div>
</body>
</html>