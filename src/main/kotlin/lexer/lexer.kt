package lexer

import java.io.File

class lexer(private val input: File){
    var mapOfTokens = mutableMapOf<String, String>()

    fun run(){
        createTokens(input)
    }

    private fun createTokens(input: File){
        val lines = input.readLines()
        for(line in lines){
            val tokens = line.split(" ")
            mapOfTokens[tokens[0]] = tokens[1]
        }
    }
}