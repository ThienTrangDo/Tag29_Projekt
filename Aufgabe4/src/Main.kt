/*
Erstelle in der main()-Funktion der Aufgabendatei Main.kt eine Computer-Instanz.
Schalte den Computer dann an, versende eine E-Mail und schalte ihn wieder aus.
 */

fun main (){
    var computer: Computer = Computer(false)
    println(computer.on)
    computer.pressOnButton()
    println(computer.on)
    computer.sendEmail()
    computer.pressOffButton()
    println(computer.on)
}