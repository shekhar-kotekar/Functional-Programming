package edu.shekhar.fp

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import java.util

class TestFunctionalShoppingCart extends AnyFlatSpec with Matchers {

  "A shopping cart" should "return a discount on books" in {
    val shoppingItems: List[String] = List("Apple","Book","Lemon")
    FunctionalShoppingCart.getDiscountPercentage(shoppingItems) shouldEqual 5.0f
  }

}
