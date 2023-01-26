/*
Erstelle (in der Datei Main.kt) eine Hunden-Instanz, mit dem Namen "Bello" und der Rasse "Golden-Retriever".
Lass den Hund bellen.
 */

fun main (){
    var hund: Hund= Hund("Bello", "Golden-Retriever")
    println("Der Hund Bello bellt:")
    hund.bark()
}