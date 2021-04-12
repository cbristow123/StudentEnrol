<!doctype html>
<html lang="en">
<head>
    <meta name="layout" content="main"/>
    <title>SHU Enrolment System - Simple Search</title>
</head>
<body>

<div class="row">
	<h1> SHU Enrolment System</h1>
	<formset>
		<legend>Search For Student (simple)</legend>
		<g:form action="results">
			<label for="name">Student Name</label>
			<g:textField name="name"/>
			<g:submitButton name="search" value="Search" />
			<g:/form>
		</g:form>
	</formset>
</div>
</body>
</html>
