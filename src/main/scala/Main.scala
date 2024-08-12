@main def main(): Unit = {
  val encoded = encode("Hello world".toUpperCase)
  val decoded = decode(encoded)

  println(s"encoded = $encoded")
  println(s"decoded = $decoded")
}
