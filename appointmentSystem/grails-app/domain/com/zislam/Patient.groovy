package com.zislam

class Patient {
String patientName
String patientAddress
String patientResidence
String patientId 
Date   dateRegistered
String patientPhone
Date dob
Surgery surgery



static hasMany=[doctors:Doctor,prescriptions:Prescription,appointments:Appointment]
static belongsTo=[Doctor,Prescription,Appointment]

String toString(){
return patientName
}

    static constraints = {
patientName nullable: false, blank: false
patientAddress nullable: false, blank: false
patientResidence nullable: false, blank: false
patientId nullable: false, blank: false, unique: true, maxSize: 8
dateRegistered nullable: false, blank: false
patientPhone nullable: false, blank: false
dob nullable: false, blank: false
surgery nullable: false, blank: false

    }
}
