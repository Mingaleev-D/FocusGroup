package lesson5

/**
 * @author : Mingaleev D
(gitHub -> Mingaleev-D92)
 * @data : 22/12/2022
 */
/**
Довольно интересная задача в какой то степени даже на подумать
В принципе не сложная но и относительно и не легкая
 Думаю ребятам понравиться
 */

fun main() {

   val number1 = 1
   val number2 = 2

   println("Добро пожаловать! Угадайте 2 числа (от 0 до 100) загаданные системой")
   println("Введите первое число: ")

   val enterNumber1 = readLine()!!.toInt()

   println("Введите второе число: ")

   val enterNumber2 = readLine()!!.toInt()

   if (enterNumber1 == number1 && enterNumber2 == number2)
      println("Поздравляем! Вы выиграли главный приз!")
   else if (enterNumber1 == number1 || enterNumber2 == number2)
      println("Вы выиграли утешительный приз!")
   else println("Неудача! Крутите барабан!")

   println("Числа были загаданы $number1 и $number2")
}