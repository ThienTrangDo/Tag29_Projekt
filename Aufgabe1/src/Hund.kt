/*
Wir wollen einen Hund erstellen. Der Hund hat als Eigenschaft einen Namen und eine Rasse. Der Hund kann bellen.
Aufgabe:
Erstelle (in der Datei Hund.kt) eine Hunde-Klasse.
 */

class Hund (var name: String, var race: String){
    fun bark(){
        println("Wuff, wuff!")
    }
}