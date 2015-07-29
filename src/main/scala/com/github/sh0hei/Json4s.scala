package com.github.sh0hei

import org.json4s._
import org.json4s.native.JsonMethods._

object Json4s {

  implicit val formats = DefaultFormats

  def jsonSimple() = {
    val s = Company.example
    parse(s)
  }

  def jsonComplex() = {
    val s = Person.example
    parse(s)
  }

  def simple() = {
    val s = Company.example
    val j = parse(s)
    j.extract[Company]
  }

  def complex() = {
    val s = Person.example
    val j = parse(s)
    j.extract[Person]
  }
}

case class Company(name: String)

object Company {
  val example =
    """
      |{"name": "Nitro Guild & Co"}
    """.stripMargin
}

case class Person(name: String, age: Int, address: Address, company: Option[Company])

case class Address(zip: String, city: String)

object Person {
  val example =
    """
      |{"name": "Root Charley", "age": 30, "address": {"zip": "177", "city": "Tokyo"}, "company": {"name": "Nitro Guild & Co"}}
    """.stripMargin
}