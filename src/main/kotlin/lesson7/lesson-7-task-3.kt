package lesson7

/**
 * @author : Mingaleev D
(gitHub -> Mingaleev-D92)
 * @data : 27/12/2022
 */
/**
 Думаю сложностей не возникнет.Задача простая и понятная
 */

fun main() {

   println("Введите число: ")
   var interNumber = readLine()!!.toInt()

 for (i in 1 .. interNumber){
    if (i % 2 == 0) {
       println(i)
    }
 }
}