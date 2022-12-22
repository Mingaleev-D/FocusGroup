package lesson2

/**
 * @author : Mingaleev D
(gitHub -> Mingaleev-D92)
 * @data : 21/12/2022
 */

/**
Пришлось подумать(
Надеюсь все правильно понял.Для меня задача оказалось непростая.
Если бы не было пояснения к задаче не знаю сколько бы я над ней трудился.
Спасибо что заставили меня подумать.Но опять же как будто меня терзают сомнения в правильности
На данном этапе обучения как будто бы все норм.
 Во общем было не просто но интересно
 */

fun main() {

   val travelTimeOfMinutes = 9 * 60 + 39
   val journeyInMinutes = 457
   val arrivalTime = travelTimeOfMinutes + journeyInMinutes
   println(
      """
      Врем прибытия ${arrivalTime / 60} часов ${arrivalTime / 60 % 60} минут
   """.trimIndent()
   )

}


