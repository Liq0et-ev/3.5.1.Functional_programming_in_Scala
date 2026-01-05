/*Vladislav Ebert
241RDB316*/

import scala.annotation.tailrec
import scala.io.StdIn.readLine

object Main {

  def main(args: Array[String]): Unit = {
    val ievade = readLine().trim
    val varbutSkaitlis = ievade.toIntOption

    varbutSkaitlis match {
      case Some(skaitlis) if skaitlis >= 2 =>
        val pirmreizin = SadaliPirmreizin(skaitlis)
        println(s"n=$skaitlis")
        println(pirmreizin.mkString(" "))

      case _ =>
        println("error")
    }}

  def SadaliPirmreizin(skaitlis: Int): List[Int] = {

    @annotation.tailrec
    def rekurs(atlik: Int, dalitaj: Int, uzkrajum: List[Int]): List[Int] = {
      if (dalitaj > atlik) uzkrajum.reverse
      else if (atlik % dalitaj == 0)
        rekurs(atlik / dalitaj, dalitaj, dalitaj :: uzkrajum)
      else
        rekurs(atlik, dalitaj + 1, uzkrajum) }

    rekurs(skaitlis, 2, Nil)
  }}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
//Note for myself:12 pirmskaili ir max