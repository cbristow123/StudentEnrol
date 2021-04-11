package com.enrol

class Module {

//declaring variables
	String module_title
	String module_code
	int credits
	String lecturer
	String course
	String description
	String toString(){
	return module_title
	}	
    static constraints = {

//declaring constraints
	module_title nullable:false, blank:false
	module_code nullable:false, blank:false
	credits nullable:false, blank:false, min:20, max:120
	lecturer nullable:false, blank:false
	description nullable:false, blank:false, size: 1..5000, widget:'textarea'
    }
static hasMany = [coursezz:Course, studenttt:Student]
static belongsTo = [lecturers:Lecturer, course:Course]
}
