package com.zislam

class Doctor {
String fullName
String qualification
String postion
String doctorEmail
String password
String doctorOffice
String phone
String bio




static hasMany=[prescriptions:Prescription,appointments:Appointment,nurses:Nurse,patients:Patient,surgeries:Surgery]
static belongsTo=[Patient,Nurse,Appointment,Surgery,Prescription]


String toString(){
return fullName
}    


   static constraints = {
fullName nullable: false, blank: false
qualification nullable: false, blank: false
postion nullable: false, blank: false
doctorEmail nullable: false, blank: false, email: true
password nullable: false, blank: false, password: true, unique: true, minSize: 8, maxSize: 16
doctorOffice nullable: false, blank: false
phone nullable: false, blank: false 
bio nullable: false, blank: false, maxSize: 5000, widget: 'textarea'


    }
}
