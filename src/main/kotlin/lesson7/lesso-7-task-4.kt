package lesson7

/**
 * @author : Mingaleev D
(gitHub -> Mingaleev-D92)
 * @data : 27/12/2022
 */
/**
 Думаю задача не сложная и интересная.На закрепление самое то
 */

fun main() {

   println("Ваше число: ")
   var enterNumber = readLine()!!.toInt()

   for (i in 0..enterNumber) {
      println("Отчет $i")
   }
}