/*
Wir wollen einen Computer erstellen. Der Computer soll an- und ausschaltbar sein.
Und wenn er an ist, soll man E-Mails verschicken können.

Der Computer hat eine Eigenschaft:

on vom Typ Boolean, das angibt, ob der Computer gerade an (true) oder aus (false) ist.
Der Computer hat einen Konstruktor:

Computer()
und die Methoden:

pressOnButton(), das den Computer anmacht, wenn er noch nicht an ist.
pressOffButton(), das den Computer ausmacht, wenn er noch nicht aus ist.
sendEMail(), das in der Konsole "EMail sent!" ausgibt, wenn der Computer gerade an ist.

 */

class Computer (var on: Boolean){

    fun pressOnButton(){
        if (!on){
            on = true
            println("Computer ist jetzt an.")
        }
    }

    fun pressOffButton(){
        if (on){
            on = false
            println("Computer ist jetzt aus.")
        }
    }

    fun sendEmail(){
        if (on){
            println("Email sent!")
        }
    }
}