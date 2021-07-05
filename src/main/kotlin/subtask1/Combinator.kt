package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        println(factorial(20.toLong()))
        println("${array[0]}, ${array[1]}")
        for (i in 1..array[1]){
            if (array[0].toLong() == factorial(array[1].toLong())/(factorial(array[1].toLong()-i)*factorial(i.toLong())))
            {
                return i
            }
        }
        //throw NotImplementedError("Not implemented")
        return  null
    }
    private fun factorial(a: Long) : Long{
        var rez: Long = 1
        for (i in 1..a){
            rez *= i
        }
        return rez
    }

}
