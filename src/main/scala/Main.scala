object Main {
  def main(args: Array[String]): Unit= {
    val PersonOne = new Person("Test", 24)
    val PersonTwo = new Person("Test", 25)

    if ((PersonOne.name).equals(PersonTwo.name)) {
      if ((PersonOne.age) equals (PersonTwo.age)) {
        println(true)
      }
      else {
        println(true)
      }
    }
    else if ((PersonTwo.name.length()) equals (PersonOne).name.length()) {
      println(true)
    }
    else {
      println(false)
    }

  }


}
