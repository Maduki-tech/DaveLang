import lexer.lexer
import java.io.File

fun main(args: Array<String>) {
    val file = File("src/main/resources/main.dave")
    val lexer = lexer(file)
    lexer.run()
}