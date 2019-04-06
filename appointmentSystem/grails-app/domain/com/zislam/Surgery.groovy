package com.zislam

class Surgery {
String name
String address
String postCode
String openingTime
String description
String telephone
int numberofPatients


static hasMany=[receptionists:Receptionist,patients:Patient,doctors:Doctor,appointments:Appointment,nurses:Nurse]

static belongsTo=[Doctor,Appointment]


String toString(){
return name

}
    static constraints = {
name nullable: false, blank: false
address nullable: false, blank: false
postCode nullable: false, blank: false
openingTime nullable: false, blank: false
description nullable: false, blank: false, maxSize: 5000, widget: 'textarea'
telephone nullable: false, blank: false
numberofPatients nullable: false, blank: false, max: 50



   }
}
