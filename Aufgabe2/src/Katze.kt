/*
Wir wollen eine Katze erstellen. Die Katze hat als Eigenschaften einen Namen und eine Fellfarbe. Die Katze kann miauen.
Aufgabe:
Erstelle (in der Datei Katze.kt) eine Katzen-Klasse.
 */

class Katze (var name: String, var fellfarbe: String) {
    fun meow (){
        println("Die Katze miaut:")
        println("Meow, meow.")
    }
}