import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var balance = scanner.nextInt()
    while (scanner.hasNextInt()) {
        var expenses = scanner.nextInt()
        if (expenses > balance) {
                println("Error, insufficient funds for the purchase." +
                        " You have $balance, but you need $expenses.")
                return
            } else {
                balance -= expenses
            }

    }
    println("Thank you for choosing us to manage your account!" +
            " You have $balance money.")


    // write your code here
}