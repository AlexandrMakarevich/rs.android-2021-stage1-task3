package subtask2

import kotlin.math.sqrt

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        // 50 {1, 3, 5, 8, 49}
        val squareArray: ArrayList<Int> = arrayListOf()
        for (i in number*number-1 downTo 1 step 1){
            if (isWhole(sqrt(i.toDouble()))){
                squareArray.add(i)
            }
        }
        squareArray.forEach { println(it) }



        return null
    }

    private fun isWhole(d: Double): Boolean{
        return d - d.toInt() == 0.0
    }

}
