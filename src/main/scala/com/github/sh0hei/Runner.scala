package com.github.sh0hei

object Runner {

  // Json4s
  def json4s() = {
    println(Json4s.jsonSimple())
    println(Json4s.jsonComplex())
    println(Json4s.simple())
    println(Json4s.complex())
  }
}
