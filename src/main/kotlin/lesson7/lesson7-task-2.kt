package lesson7

/**
 * @author : Mingaleev D
(gitHub -> Mingaleev-D92)
 * @data : 27/12/2022
 */
/**
МНе понравилось, думаю относительно не сложно.Думаю если брать пройдённую тему урока
то решение наверное должно быть такое
 */

fun main() {

   val randomNumber = (1..9)
   var showNumber = ""

   for (i in 1..4) {
      showNumber += randomNumber.random()
   }
   println("Ваш код: $showNumber")

   println("Введите код")

   var enterNumber = readLine()

   if (enterNumber != showNumber) {
      var showNumberNew = ""
      for (i in 1..4) {
         showNumberNew += randomNumber.random()
      }
      println("Ваш новый код: $showNumberNew")

      println("Введите код")
      var enterNumberNew = readLine()
   } else println("Привет")
}