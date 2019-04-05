package com.zislam

class Patient {
String patientName
String patientAddress
String patientResidence
String patientId 
Date   dateRegistered
String patientPhone
Date dob

String toString(){
return patientName
}

static hasMany=[prescriptions:Prescription,doctors:Doctor]
static belongsTo=[Doctor]

    static constraints = {
patientName nullable: false, blank: false
patientAddress nullable: false, blank: false
patientResidence nullable: false, blank: false
patientId nullable: false, blank: false, unique: true, maxSize: 8
dateRegistered nullable: false, blank: false
patientPhone nullable: false, blank: false
dob nullable: false, blank: false
    }
}
