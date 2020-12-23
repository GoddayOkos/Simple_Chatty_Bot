import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    var max = Int.MIN_VALUE
    var count = 0
    var input = 0
    var position = 0
    while (scanner.hasNextInt()) {
        input = scanner.nextInt()
        count++
        if (input > max) {
            max = input
            position = count
        }
    }
  println("$max $position")
  
}
