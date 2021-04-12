<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Home Page</title>
</head>
<body>

<div id="content" role="main">
	<div class="row">
	<table>
	<tr>
	<td>
		<div class="first">
			<h3> Course Management </h3>
			<p> lorem ipsum </p>
			<button type="button" class="btn btn-success">
			<g:link controller="course" action="create"> Add Course </g:link>
			</button>	
		</div>
	</td>
	</tr>
	<tr>
	<td>
		<div class="second">
			<h3> Student Enrolment </h3>
			<p> placeholder </p>
			<button type="button" class="btn btn-success">
			<g:link controller="student" action="create"> Enrol Student </g:link>
			</button>
		</div>
	</td>
	</tr>
	<tr>
	<td>
		<div class="third">
			<h3> Modules </h3>
			<p> placeholder2 </p>
			<button type="button" class="btn btn-success">
			<g:link controller="Module" action="create"> Modules </g:link>
			</button>	
		</div>
	</td>
	</tr>
	<tr>
	<td>
		<div class="fourth">
			<h3> Lecturer Management </h3>
			<p> placeholder3 </p>
			<button type="button" class="btn btn-success">
			<g:link controller="Lecturer" action="create"> Add Lecturer </g:link>
			</button>	
		</div>

		<div class="first">
			<h3>Simple Search</h3>
			<p> Search placeholder </p>
			<button type="button" class="btn btn-success">
			<g:link controller="student" action="search">Search</g:link>
			</button>
		</div>
	</td>
	</tr>
	</div>
</div>
</body>
</html>


