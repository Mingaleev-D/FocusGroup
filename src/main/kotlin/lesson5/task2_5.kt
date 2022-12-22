package lesson5

/**
 * @author : Mingaleev D
(gitHub -> Mingaleev-D92)
 * @data : 22/12/2022
 */
/**
Простая и понятная задача.Думаю не плохо было бы усложнить условие для интереса
 */

fun main() {

   println("Введите Ваш год рождения")
   val printResult = readLine()!!.toInt()

   if (YEAR_OF_BIRTH >= printResult)
      println("Показать экран со скрытым контентом")

}

const val YEAR_OF_BIRTH = 2004