package quizzes

class CloudJump {
}

fun main() {
//    var iar: Array<Int> = arrayOf(1,2,3,4,5,6)
//    [2, 4, 6]
    var ar: IntArray = intArrayOf(0, 1, 0, 0, 0, 1, 0 )

    fun jump(n:Int, c:IntArray ) {
        var res:MutableList<Int> = mutableListOf()

        var i =0;
        do {
            if (i+2<c.size && c[i+2]==0){
                i+=2
                res.add(i)
            }else if (i+1<c.size && c[i+1] == 0){
                i++
                res.add(i)
            }else{
                i++
            }
        }while (i<c.size)
        println(res)
    }
        jump(ar.size, ar)
}