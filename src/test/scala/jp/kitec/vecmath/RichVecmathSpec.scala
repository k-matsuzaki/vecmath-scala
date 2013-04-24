package jp.kitec.vecmath

import javax.vecmath.Vector3f
import javax.vecmath.Point3f

import jp.kitec.vecmath.RichVecmath._

import org.junit.runner._
import org.specs2.mutable._
import org.specs2.runner._

@RunWith(classOf[JUnitRunner])
class RichVecmathSpec extends Specification {
  "Point3f" should {
    val a = Point(1, 2, 3);
    val b = Vector(5, 7, 9);
    val c = Point(5, 7, 9);
    "point + vector" in {
      a + b must_== Point(6, 9, 12)
    }
    "point - vector" in {
      a - b must_== Vector(-4, -5, -6)
    }
    "point - point" in {
        a - c must_== Vector(-4, -5, -6)
    }
    "unary-" in {
        -Vector(1, 2, 3) must_== Vector(-1, -2, -3)
    }
    "expression" in {
        -Vector(1, 2, 3) + Vector(2, 5, 0) * 2 must_== Vector(3, 8, -3)
    }
  }
  "Vector3f" should {
    val a = new Vector3f(1, 2, 3);
    val b = new Vector3f(5, 7, 9);
    "vector + vector" in {
      a + b must_== Vector(6, 9, 12)
    }
    "vector - vector" in {
        a - b must_== Vector(-4, -5, -6);
    }
    "vector * float" in {
        a * 3 must_== Vector(3, 6, 9);
    }
    "vector ** float" in {
        Vector(1f, 0f, 0f) ** Vector(0f, 1f, 0f) must_== Vector(0f, 0f, 1f);
    }
    "vector := vector" in {
      val e = Vector(1f, 2f, 3f);
      e := Vector(2f, 3f, 4f)
      e must_== Vector(2f, 3f, 4f)
    }
    "expression" in {
        Point(1, 2, 3) + Vector(2, 5, 0) * 4 must_== Point(9, 22, 3)
    }
  }
}
