package com.zislam

class BootStrap {

    def init = { servletContext ->






/*def SMCentre = new
Surgery(
name: 'Sheffield Medical Centre',
address: '106 London Road, Sheffield',
postCode: 'S2 5TH',
openingTime: '08:00-6:00hrs',
description: '''Lorem impsum,error tantas ne Te duo putant detracto.''',
telephone: '01274 678567',
numberofPatients: '45').save()

def AMSurgery = new
Surgery(
name: 'Ashwell Medical Surgery',
address: '98 LilyCroft Road, Bradford',
postCode: 'BD9 6FG',
openingTime: '9:00-5:00hrs',
description: '''Lorem impsum,error tantas ne Te duo putant detracto.''',
telephone: '01274 345890',
numberofPatients: '36').save()





def BPitt = new
Doctor(
fullName: 'Dr Brad Pitt',
qualification: 'MBChB(Sheffield)',
postion: 'GP',
doctorEmail: 'bradpitt@hotmail.com',
password: 'brad1234',
doctorOffice: 'D-1112',
phone: '01274 555678',
bio: '''Lorem ipsum dolor sit amet, cam sale error tantas ne. Te duo putant detracto. In duo sonet urbanitas, ad vim vide tacimates.
''').save()

def CTatum = new
Doctor(
fullName: 'Dr Channing tatum',
qualification: 'MBChB(Oxford)',
postion: 'GP, Surgeon',
doctorEmail: 'ctatum@hotmail.com',
password: 'tatum123',
doctorOffice: 'A-15672',
phone: '01274 234123',
bio: '''Lorem ipsum dolor sit amet, cam sale error tantas ne. Te duo putant detracto. In duo sonet urbanitas, ad vim vide tacimates.
''').save()






def SPeters = new
Nurse(
nurseName: 'Susan Peters',
qualifications: 'Registered General Nurse',
nurseEmail: 'speters@hotmail.com',
nurseOffice: 'B-455',
nursePhone: '0114 2224433',
surgery: SMCentre).save()

def BBirds = new
Nurse(
nurseName: 'Bethany Birds',
qualifications: 'BCS Nursing',
nurseEmail: 'bbirds@hotmail.com',
nurseOffice: 'A-344',
nursePhone: '0114 5674422',
surgery: AMSurgery).save()






def BRivers = new
Receptionist(
recepName: 'Brennon Rivers',
recepEmail: 'briver@hotmail.com',
recepUsername: 'brivers123',
recepPassword: 'rivers123',
recepPhone: '01274 521782',
surgery: SMCentre).save()

def SGomez = new
Receptionist(
recepName: 'Selena Gomez',
recepEmail: 'SGomez@hotmail.com',
recepUsername: 'sgomez123',
recepPassword: 'gomez1234',
recepPhone: '01274 145719',
surgery: AMSurgery).save()






def THardy = new
Patient(
patientName: 'Tom Hardy',
patientAddress: '2 Clough road, Eckington',
patientResidence: 'Sheffield, London',
patientId: 'E2555',
dateRegistered: new Date('03/06/1999'),
patientPhone: '07976802588',
dob: new Date('02/03/1990'),
surgery: AMSurgery).save()

def LJin = new
Patient(
patientName: 'Lee Jin',
patientAddress: '20 Wind Street, Matlock',
patientResidence: 'Rugby, Coventry',
patientId: 'A2555',
dateRegistered: new Date('03/07/1993'),
patientPhone: '0797685670',
dob: new Date('02/11/1980'),
surgery: SMCentre).save()











def App1 = new
Appointment(
appDate: new Date('22/10/2018'),
time: '11:45am',
appDuration: '25',
roomNumber: 'B-123').save()

def App2 = new
Appointment(
appDate: new Date('12/04/2019'),
time: '3:00pm',
appDuration: '60',
roomNumber: 'B-1111').save()





def PCL = new
Prescription(
pharmacyName: 'Rowlands',
prescripNumber: '54647',
medicine: 'Paracetamol',
totalCost: '£00',
dateIssued: new Date('3/03/2019'),
patientPaying: 'false',
daysofSupply: '1 week').save()

def CE = new
Prescription(
pharmacyName: 'Boots',
prescripNumber: '53653',
medicine: 'Codeine',
totalCost: '£5.60',
dateIssued: new Date('04/02/2019'),
patientPaying: 'true',
daysofSupply: '2 weeks').save()



PCL.addToDoctors(CTatum)
AMSurgery.addToDoctors(CTatum)
BBirds.addToDoctors(CTatum)
LJin.addToDoctors(CTatum)



CE.addToDoctors(BPitt)
SMCentre.addToDoctors(BPitt)
SPeters.addToDoctors(BPitt)
THardy.addToDoctors(BPitt)

App2.addToSurgeries(AMSurgery)
LJin.addToAppointments(App2)
CE.addToPatients(LJin)

App2.addToDoctors(BPitt)
App1.addToDoctors(CTatum)*/
















}
def destroy = {
 }
}
