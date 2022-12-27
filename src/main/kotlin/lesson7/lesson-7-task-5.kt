package lesson7

/**
 * @author : Mingaleev D
(gitHub -> Mingaleev-D92)
 * @data : 27/12/2022
 */
/**
Сложностей не должно возникнуть!Хорошая для закрепления.После просмотра видео и решения тестов и решения подобных
 задач Вам отнознаться скажут "спасибо" так как считаю что материал будет освоен крепко.
 Мне понравилось
 */

fun main() {

   println("Задайте длину пароля")
   val password = readLine()!!.toInt()
   val charPassword = ('a'..'z')

   for (i in 0 .. password){
      val result =  charPassword.random()
      print(result)
   }
}