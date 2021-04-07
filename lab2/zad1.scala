class Person(val givenname : String, var givensurname : String, protected val id : String){
    def name(): String = givenname + " " + givensurname
} 


object Appl extends App{
    val p = new Person("Jan", "Kowalski", "1234567890")
    println(p.name)
}
