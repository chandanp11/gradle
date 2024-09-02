package org.example

class Patient {
    def firstName, lastName, age
    static hospitalCode = '001'

    void setFirstName(firstName){
        if (firstName==null){
            throw new IllegalArgumentException("first name cannot be null")
        }
        this.firstName = firstName
    }

    static void display(){
        println hospitalCode
    }
}

p = new Patient(firstName: 'Chandan', lastName: 'Patil', age: 48)
println "${p.lastName}, ${p.firstName} = ${p.age}"

p.setFirstName("Atharva")
println "${p.lastName}, ${p.firstName} = ${p.age}"

Patient.display()
