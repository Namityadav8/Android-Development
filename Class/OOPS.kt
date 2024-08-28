class car{
    var make :String = ""
    var model : String =  "" 
    var year : Int = 0

    fun getinfo() : String{
        return "$make $model"
    }
}


// make a class and make two objects with two diff parametere into it


fun fibonacci(n: Int): Int {
    if (n <= 1) return n
    var a = 0
    var b = 1
    var c = 0
    for (i in 2..n) {
        c = a + b
        a = b
        b = c
    }
    return c
}

fun sumUptoN(n: Int): Int {
    return n * (n + 1) / 2
}

fun main() {
    print("Enter the value of n: ")
    val n = readLine()!!.toInt()

    val sum = sumUptoN(n)
    println("Sum of first $n numbers: $sum")

    val fibonacciResult = fibonacci(sum)
    println("Fibonacci of the sum $sum: $fibonacciResult")
}




fun fibonacciSequence(n: Int): List<Int> {
    val sequence = mutableListOf(0, 1)
    for (i in 2..n) {
        sequence.add(sequence[i - 1] + sequence[i - 2])
    }
    return sequence
}

fun sumOfEvenAndOddFibonacci(n: Int): Pair<Int, Int> {
    val fibonacciNumbers = fibonacciSequence(n)
    var evenSum = 0
    var oddSum = 0
    
    for (num in fibonacciNumbers) {
        if (num % 2 == 0) {
            evenSum += num
        } else {
            oddSum += num
        }
    }
    return Pair(evenSum, oddSum)
}

fun main() {
    print("Enter the value of n: ")
    val n = readLine()!!.toInt()

    val (evenSum, oddSum) = sumOfEvenAndOddFibonacci(n)
    println("Sum of even Fibonacci numbers up to F($n): $evenSum")
    println("Sum of odd Fibonacci numbers up to F($n): $oddSum")
}