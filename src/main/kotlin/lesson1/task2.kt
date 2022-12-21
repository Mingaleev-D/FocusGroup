package lesson1

/**
 * @author : Mingaleev D
(gitHub -> Mingaleev-D92)
 * @data : 21/12/2022
 */

/**
 задача не сложная.Если честко идти по условию все понятно
 Изначально количеству сотрудникол было присвоено val
 так как вроде рекомендуется всегда переменная должна быть неизменяемая
 Во общем пока все просто
 */



fun main() {

   // перемеенная с количествои заказов
   val numberOfOrders = 75
   // переменная с текстом
   val thankYouText = "Первый заказ собран"

   println("заказ: $numberOfOrders текст: $thankYouText")

   var storeEmployees = 2000

   // println(" количество сотрудников $storeEmployees")

   storeEmployees = 2000 - 1
   println("количество сотрудников (-1) $storeEmployees")
}