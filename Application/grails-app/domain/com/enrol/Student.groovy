package com.enrol

class Student {
// Declaring Variable Data Types
	String studentName
	String studentID
	Date dob
	Boolean isFundingAvailable
	String studentEmail
	String studentUsername
	String studentPassword
	//String course// declared as a foreign key in bootstrap. 1-1 relationship.

	//String toString(){
	//return studentName
	//}	

    
static constraints = {

// Declaring Constraints

	studentName nullable:false, blank:false
	studentID nullable:false, blank:false
	dob nullable:false, blank:false
	studentEmail nullable:false, blank:false, email:true
	studentUsername nullable:false, blank:false, unique:true
	studentPassword nullable:false, blank:false
	isFundingAvailable nullable:false, blank:false
	//course nullable:false, blank:false
    	}
static hasMany = [modulee:Module] // m:m relationship. This requires belongto statement to indicate the ownership of the relation.	
static belongsTo = [course:Course, modulee:Module] // belongsTo indicates ownership of relation. this has to be declared while creating 1:1 relationship. This has to be declared for 1:m.

//UNCOMMENT ALL ABOVE AND IT WILL WORK. ITS ONLY COMMENTED OUT COS OF HARDCODING THE BOOTSTRAP.
}
