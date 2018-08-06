<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="Golf Home Page" />

	<c:url value="/scoresHomePageUrl" var="/" />

	<h2>Welcome to Golf Handicap Tracker</h2>
	
	<form method="POST" action="home">
	
		<br>
		
	<label for="name">Golfers Name</label>
		<input type="text" name= "name"/><br>
		
	<label for="golfCourse">Golf Course:</label>
		<input type="text" name= "golfCourse"/><br>
		
	<label for="score">18 Hole Score: </label>
		<input type="text" name="score" /><br>
		
	<label for="handicap">How Many Over Par: </label>
		<input type="text" name="handicap" /><br>
	<br>
	
	<div class="formGroup">
		<input type="submit" value="Submit Score"/>
	</div>
	
</form>
	
		
	
