package lesson5

/**
 * @author : Mingaleev D
(gitHub -> Mingaleev-D92)
 * @data : 22/12/2022
 */
/**
Во общем и целом прикольная задача весьма легка но для закрепления самый сок, то что надо!
 */

fun main() {

   println("Здравствуйте! ВВедите Ваш логин:")
   val enterLogin = readLine().toString()

   if (enterLogin != LOGIN){
      println("Логин не найден.До свидания")
   }

   else if (enterLogin == LOGIN){
      println("Здравствуйте $LOGIN, введите пароль")
      val enterPassword = readLine().toString()
      if (enterPassword == PASSWORD){
         println("Вы успешно авторизовались")
      }else
         println("Ошибка! пароль не верный")
   }


}

const val LOGIN = "Batman"
const val PASSWORD = "password"