package com.zislam

class ReceptionistController {

    def scaffold= Receptionist
<<<<<<< HEAD

def login() {
 }

def validate() {
def user = Receptionist.findByRecepUsername(params.username)
if (user && user.recepPassword == params.password){
session.user = user
render view:'home'
}
else{
flash.message = "Invalid username and password."
render view:'login'
}
=======
def login() {
 }
def validate() {
def user = Receptionist.findByUsername(params.username)
if (user && user.password == params.password){
session.user = user
render view:'home'
}
else{
flash.message = "Invalid username and password."
render view:'login'
}
>>>>>>> origin
}
def logout = {
 session.user = null
 redirect(uri:'/')
 }
<<<<<<< HEAD
}

=======


}


>>>>>>> origin
