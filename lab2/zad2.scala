import scala.beans.BeanProperty

class Person(givenname : String, @BeanProperty var surname : String, id : String){
    def name(): String = givenname + " " + surname
}



object Appl{
    def main(args: Array[String]){
        val p = new Person("Jan", "Kowalski", "1234567890")
        println(p.name)
	println(p.getSurname())
	p.setSurname("Nowak")
        println(p.getSurname())
        println(p.name)
    }
}

