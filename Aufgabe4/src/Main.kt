/*
Erstelle in der main()-Funktion der Aufgabendatei Main.kt eine Computer-Instanz.
Schalte den Computer dann an, versende eine E-Mail und schalte ihn wieder aus.
 */

fun main (){
    var computer= Computer(false)
    computer.pressOnButton()
    computer.sendEmail()
    computer.pressOffButton()

}