package lesson5

/**
 * @author : Mingaleev D
(gitHub -> Mingaleev-D92)
 * @data : 21/12/2022
 */

/**
Довольно прикольная задача, на мой взгляд слишком простая, но это наверное и правильно так как можно решить
и другими способами. Не сложная понятная задача тут сложностей не должно возникнуть
 */


fun main() {

   println("Здравствуйте, подтвердите лично решив пример -> 2*2 = ???")
   val resultText = readLine()!!.toInt()

   when (resultText) {
      4    -> println("Верно! Добро пожаловать!")
      else -> println("Ответ неверный! Доступ запрещен")
   }
}