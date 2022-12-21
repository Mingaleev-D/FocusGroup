package lesson2

/**
 * @author : Mingaleev D
(gitHub -> Mingaleev-D92)
 * @data : 21/12/2022
 */

/**
 Тут ничего сложного. Закоментированный код - это то как бы я сделал, но по условию как я понял немного по другому нужно сделать
 поэтому сделал как по условию.Выглядит конечно некрасиво.Но мне хочется так оставить
 */

fun main() {

   val allHuman = 50
   val perEmployee = 30000
   val trainees = 30
   val perTrainee = 20000

   val salariesOfPermanentEmployees = allHuman * perEmployee
   val generalExpensesWithTrainees = (allHuman * perEmployee) + (trainees * perTrainee)
   val mediumSalaryEmployees = ((allHuman * perEmployee) + (trainees * perTrainee)) / (allHuman + trainees)

   println("расходы на выплату зарплаты постоянных сотрудников: $salariesOfPermanentEmployees")
   println("общие расходы по ЗП после прихода стажеров: $generalExpensesWithTrainees")
   println("среднюю ЗП одного сотрудника после устройства стажеров: $mediumSalaryEmployees")

//   println(
//      """
//- расходы на выплату зарплаты постоянных сотрудников: ${allHuman * perEmployee}
//- общие расходы по ЗП после прихода стажеров: ${(allHuman * perEmployee) + (trainees * perTrainee)}
//– среднюю ЗП одного сотрудника после устройства стажеров:  ${((allHuman * perEmployee) + (trainees * perTrainee)) / (allHuman + trainees)}
//   """.trimIndent()
//   )
}