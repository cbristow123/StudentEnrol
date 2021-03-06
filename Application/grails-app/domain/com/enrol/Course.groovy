package com.enrol

class Course {

//Declaring Variables
	String department
	String courseTitle
	String courseLeader
	String courseCode
	Date startDate
	Date endDate
	String description
	int numberOfStudents
	double tuitionFees
	String studyMode
//Represent instance of class with the class name
	String toString(){
	return courseTitle
	}	

static constraints = {

//Writing Constraints
	courseTitle nullable:false, blank:false
	department nullabe:false, blank:false
	courseLeader nullable:false, blank:false
	courseCode nullable:false, blank:false
	numberOfStudents nullable:false, blank:false, minSize: 20, maxSize: 60
	startDate nullable:false, blank:false
	endDate nullable:false, blank:false
	studyMode nullable:false, blank:false, minSize: 4
	description nullable:false, blank:false, size: 1..5000, widget:'textarea'
	tuitionFees nullable:false, blank:false, scale:2
	}	
static hasMany = [students:Student, lecturer:Lecturer, module:Module] // 1 to many relationship. secondpart is declaration of belongsTo statement
static belongsTo = [courseLeader:Course] 
}
