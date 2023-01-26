/*
Die Person hat die Eigenschaften:

name (Name) vom Typ String
phoneNumber (Telefonnummer) vom Typ Int
age (Alter) vom Typ Int

Die Person hat einen Konstruktor:
Person(), mit den Parametern name, phoneNumber und age.
Es speichert die übergebenen Parameter in den Eigenschaften ab.

und die Methode:
sayHello(), das "Hallo an alle!" in der Konsole ausgibt.
 */

class Person{
    var name: String
    var phoneNumber: Int
    var age: Int

    constructor(name: String, phoneNumber: Int, age: Int){
        this.name = name
        this.phoneNumber = phoneNumber
        this.age = age
    }

    fun sayHello (){
        println("Hallo an alle!")
    }
}