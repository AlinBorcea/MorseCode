private val morseMap: Map[Char, String] = Map.apply('E' -> ".", 'T' -> "_", 'I' -> "..", 'A' -> "._", 'N' -> "_.", 'M' -> "__", 'S' -> "...", 'U' -> ".._", 'R' -> "._.", 'W' -> ".__", 'D' -> "_..", 'K' -> "_._", 'G' -> "__.", 'O' -> "___", 'H' -> "....", 'V' -> "..._", 'F' -> ".._.", 'Ț' -> "", 'L' -> "._..", 'Ă' -> "", 'P' -> ".__.", 'J' -> ".___", 'B' -> "_...", 'X' -> "_.._", 'C' -> "_._.", 'Y' -> "_.__", 'Z' -> "__..", 'Q' -> "__._", 'Â' -> "", '*' -> "")

def encode(message: String): List[String] = {
  var morseMessage = List[String]()
  message.foreach(c => morseMessage = morseMessage ::: List(encodeLetter(c)))
  morseMessage
}

def encodeLetter(c: Char): String = {
  morseMap.get(c) match
    case Some(str) => str
    case None => ""
}

def decode(morse: List[String]): String = {
  var message = ""
  morse.foreach(str => message += decodeItem(str))
  message
}

def decodeItem(item: String): Char = {
  morseMap.find((c, str) => item == str) match
    case Some((c, str)) => c
    case None => '!'
}