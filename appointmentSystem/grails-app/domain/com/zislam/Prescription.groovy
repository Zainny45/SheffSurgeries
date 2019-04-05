package com.zislam

class Prescription {
String pharmacyName
String prescripNumber
String medicine
Double totalCost
Date dateIssued
Boolean patientPaying
String daysofSupply


String toString(){
return pharmacyName
}


    static constraints = {
pharmacyName nullable: false, blank: false
prescripNumber nullable: false, blank: false, unique: true, maxSize: 20
medicine nullable: false, blank: false
totalCost nullable: false, blank: false, scale: 2
dateIssued nullable: false, blank: false
patientPaying nullable: false, blank: false
daysofSupply nullable: false, blank: false
    }
}
