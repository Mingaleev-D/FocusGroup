package lesson1

/**
 * @author : Mingaleev D
(gitHub -> Mingaleev-D92)
 * @data : 21/12/2022
 */
/**
В целом задание простое.Осталось понять правильно ли я понял условие.
Как понял условие, так и реализовал задачу.Сложностей никаких не было
Было только 1 сложно (правильно ли я понял =:))
 */

fun main() {

   val year = 1961
   var hour = "09"
   var minute = "07"
   println(
      """
       Год полете – $year
       Взлет – $hour часов
               $minute минут
      """.trimIndent()
   )
   hour = "10"
   minute = "55"

   println(
      """
       Год полете – $year
       Посадка – $hour часов
                 $minute минут
      """.trimIndent()
   )
}