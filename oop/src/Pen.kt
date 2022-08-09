import java.util.Scanner

class Pen(var color: String) {

    var on: Boolean = false
    var penInk: Int = 10

    fun onPen(isTrue: Boolean): Boolean {
        return true
    }

    fun offPen(isFalse: Boolean): Boolean {
        return false
    }
}


fun main() {
    var scanner = Scanner(System.`in`)
    val pen = Pen("blue")
    var p = pen.offPen(pen.on)
    p = pen.onPen(true)

    if (p == pen.onPen(false)) {
        println("Pen off")
        println("Pen on -> 1")
        print("= ")
        var n = scanner.nextInt()
        var res = pen.penInk
        if (n == 1) {

            print("Write: ")
            scanner = Scanner((System.`in`))
            val write = scanner.nextLine()
            for (i in 0 .. write.length) {
                res--

            }
            println(res)
            if (res <= 0) {
                print(write)
                println()
                println("Pen ink end")
            } else {
                println("Continue")
            }
        }else {
            println("Pen off")
        }
        while (true) {
            println("Off pen->1")
            println("Write->2")
            print("= ")
            val s = scanner.nextInt()

            if (s == 1) {
                break
            }else if (s == 2) {
                print("Write: ")
                scanner = Scanner((System.`in`))
                val w = scanner.nextLine()
                for (i in 0 .. w.length) {
                    res--

                }
                println(res)
                if (res <= 0) {
                    print(w)
                    println("Pen ink end")
                } else {
                    println("Continue")
                }
            }else {
                println("Pen off")
            }
            }
        }

    }


