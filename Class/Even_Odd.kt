fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var sumEven = 0
    var sumOdd = 0

    for (num in arr) {
        if (num % 2 == 0) {
            sumEven += num
        } else {
            sumOdd += num
        }
    }

    println("Sum of even numbers: $sumEven")
    println("Sum of odd numbers: $sumOdd")
}

