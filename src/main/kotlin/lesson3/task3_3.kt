package lesson3

/**
 * @author : Mingaleev D
(gitHub -> Mingaleev-D92)
 * @data : 21/12/2022
 */
/**
Надеюсь правильно понял задание.Тут в принципе ничего сложного
Задача на изи
 */

fun main() {

   println("Введите положительное число: ")

   val number = readLine()!!.toInt()

   for (i in 1..10) {
      val product = number * i
      println("$number * $i = $product")
   }
}

