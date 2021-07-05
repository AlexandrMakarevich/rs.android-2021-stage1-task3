package subtask3

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val rezArray: MutableList<String> = mutableListOf()
        val stringBuilder: StringBuilder = java.lang.StringBuilder(number)

        number.forEachIndexed { index, char ->
            val neibArray = neighborArray(char)
            if (neibArray[0] == '*') return null
            neibArray.forEach { char_neib ->
                stringBuilder[index] = char_neib
                rezArray.add(stringBuilder.toString())
                stringBuilder[index] = char
            }
        }
        return rezArray.toTypedArray()
        // throw NotImplementedError("Not implemented")
    }

    private fun neighborArray(n: Char): Array<Char>{
        val outArray: Array<Char>
        when (n) {
            '0' -> outArray = arrayOf('8')
            '1' -> outArray = arrayOf('2', '4')
            '2' -> outArray = arrayOf('1', '3', '5')
            '3' -> outArray = arrayOf('2', '6')
            '4' -> outArray = arrayOf('1', '5', '7')
            '5' -> outArray = arrayOf('2', '4', '6', '8')
            '6' -> outArray = arrayOf('3', '5', '9')
            '7' -> outArray = arrayOf('4', '8')
            '8' -> outArray = arrayOf('0', '5', '7', '9')
            '9' -> outArray = arrayOf('6', '8')
            else -> outArray = arrayOf('*')
        }
        return outArray
    }

}
