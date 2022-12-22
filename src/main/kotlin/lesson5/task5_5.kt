package lesson5

/**
 * @author : Mingaleev D
(gitHub -> Mingaleev-D92)
 * @data : 22/12/2022
 */
/**
Неплохая задача , но думаю она покажется сложной для новичка
Т.к решение не было на уроке.Поэтом удумаю что тут нужно вкинуть какую ниюудь подсказку
 типо в котлине есть абстракный класс Рандом или типо почитай про рандом() это поможет при решении
 Если это не знать от слова вообще то решение будет сложным.

 */


fun main() {

   val number1 = (0..100).random()
   val number2 = (0..100).random()

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