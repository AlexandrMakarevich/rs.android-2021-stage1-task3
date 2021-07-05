package subtask2

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        val newNum = number.toLong()
        val result = mutableListOf(newNum)

        var ost = 0L

        while (!result.isNullOrEmpty()) {
            val temp = result.last()
            result.indexOfLast {
                result.remove(it)
            }

            ost += square(temp)
            for (i in temp-1 downTo 0) {
                if (ost - square(i) >= 0){
                    ost -= square(i)
                    result.add(i)

                    if (ost == 0L){
                        result.sort()
                        return result.map{it.toInt()}.toTypedArray()
                    }
                }
            }
        }
        return null
    }
    private fun square(x: Long) = x * x

}
