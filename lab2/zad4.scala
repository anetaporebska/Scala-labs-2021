import scala.math.sqrt

class Int2DVec(val x: Int, val y: Int) {
  def +(other: Int2DVec) = new Int2DVec(x + other.x, y + other.y)
  def unary_- = new Int2DVec(-x, -y)
  override def toString() = "(" + x.toString + "," + y.toString + ")"
  def -(other: Int2DVec) = new Int2DVec(x - other.x, y - other.y)
  def *(other: Int2DVec) = new Int2DVec(x*other.x, y*other.y)
}

object Int2DVec {
  def apply(x: Int, y: Int) = new Int2DVec(x, y)
  def apply() = new Int2DVec(0, 0)
  def apply(prototype: Int2DVec) = new Int2DVec(prototype.x, prototype.y)
  def unitVectorOf(prototype: Int2DVec) = {
    val len = sqrt( prototype.x * prototype.x + prototype.y*prototype.y)
    val x = (prototype.x/len).toInt
    val y = (prototype.y/len).toInt
    new Int2DVec(x,y)
  }
}



object Appl {
  def main(agrs: Array[String]) {
    val v1 = new Int2DVec(1, 2)
    val v2 = new Int2DVec(10, 20)
    val v3 = v1 + v2
    val v4 = -v2
    println(v3)
    println(v4)
    val v6 = v2 - v1
    val v7 = v1*v2
    println(v6)
    println(v7)

    println(Int2DVec())
    println(Int2DVec(v1 + v1 + v2))
    println(Int2DVec.unitVectorOf(new Int2DVec(10,10)))
  }
}

