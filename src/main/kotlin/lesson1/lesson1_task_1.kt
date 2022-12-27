package lesson1

import kotlin.random.Random

/**
 * @author : Mingaleev D
(gitHub -> Mingaleev-D92)
 * @data : 26/12/2022
 */
/**
Мое решение такое.Мне показалось, что задача сложная.Мне нравятся такие.Думаю что и другим понравятся тоже
 */

fun main() {

   var number = (1..9)
   var char = ('a'..'z')
   var password = ""

   for (i in 1..3) {
      password += number.random()
      password += char.random()
   }
   println(password)
}
