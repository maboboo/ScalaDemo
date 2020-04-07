object HelloScala {
  /* 这是我的第一个 Scala 程序
   * 以下程序将输出'Hello World!'
   */
  def main(args: Array[String]) {
    println("Hello, Scala!") // 输出 Hello World


    def addInt(a: Int, b: Int): Int = {
      a + b
    }

    println(addInt(1,2))
  }
}