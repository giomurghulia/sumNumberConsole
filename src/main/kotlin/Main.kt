import java.lang.Double.parseDouble
import java.lang.NumberFormatException
import java.util.*
import kotlin.random.Random.Default.nextInt

val scanner = Scanner(System.`in`)

fun main(args: Array<String>) {
    var check = true
    while (check) {
        sumNumber()
        check = checkAnswer()
    }
}

fun sumNumber() {
    println("დაწყება")
    println("შეიყვანეთ X ცვლადის მნიშვნელობა")
    val x = scanner.nextLine()
    println("შეიყვანეთ Y ცვლადის მნიშვნელობა")
    val y = scanner.nextLine()
    try {
        val checkX = parseDouble(x)
        val checkY = parseDouble(y)
        val sum = checkX + checkY
        println("X და Y ჯამი არის: $sum")

    } catch (e: NumberFormatException) {
        println("შეყვანილი რიცხვი არასწორია")
    }
}

fun checkAnswer(): Boolean {
    var check = true
    while (check) {
        println("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?")
        val answer = scanner.nextLine()
        if (answer == "Y") {
            check = true
            break
        } else if (answer == "N") {
            println("დასასრული")
            check = false
            break
        } else {
            println("პასუხი არასწორია")
        }
    }
    return check
}