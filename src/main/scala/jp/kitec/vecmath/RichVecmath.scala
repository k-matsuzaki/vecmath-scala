package jp.kitec.vecmath

import javax.vecmath.Point3d
import javax.vecmath.Tuple3d
import javax.vecmath.Vector3d
import javax.vecmath.Point3f
import javax.vecmath.Tuple3f
import javax.vecmath.Vector3f

object RichVecmath {
  def Point(x: Float, y: Float, z: Float) = new Point3f(x, y, z)
  def Vector(x: Float, y: Float, z: Float) = new Vector3f(x, y, z)
  def Point(x: Double, y: Double, z: Double) = new Point3d(x, y, z)
  def Vector(x: Double, y: Double, z: Double) = new Vector3d(x, y, z)

  implicit class RichPoint3f(val self: Point3f) extends AnyVal {
    def :=(that: Tuple3f) = {
      self.set(that);
    }
    def +=(that: Tuple3f) = {
      self.add(that);
    }
    def -=(that: Tuple3f) = {
      self.sub(that);
    }
    def *=(scale: Float) = {
      self.scale(scale);
    }
    def +(that: Vector3f) = {
      val v = new Point3f();
      v.add(self, that);
      v;
    }
    def -(that: Vector3f) = {
      val v = new Point3f();
      v.sub(self, that);
      v;
    }
    def -(that: Point3f) = {
      val v = new Vector3f();
      v.sub(self, that);
      v;
    }
    def *(scale: Float) = {
      val v = new Point3f();
      v.scale(scale, self);
      v;
    }
  }

  implicit class RichPoint3d(val self: Point3d) extends AnyVal {
    def :=(that: Tuple3d) = {
      self.set(that);
    }
    def +=(that: Tuple3d) = {
      self.add(that);
    }
    def -=(that: Tuple3d) = {
      self.sub(that);
    }
    def *=(scale: Double) = {
      self.scale(scale);
    }

    def +(that: Vector3d) = {
      val v = new Point3d();
      v.add(self, that);
      v;
    }
    def -(that: Vector3d) = {
      val v = new Point3d();
      v.sub(self, that);
      v;
    }
    def -(that: Point3d) = {
      val v = new Vector3d();
      v.sub(self, that);
      v;
    }
    def *(scale: Double) = {
      val v = new Point3d();
      v.scale(scale, self);
      v;
    }
  }

  implicit class RichVector3f(val self: Vector3f) extends AnyVal {
    def :=(that: Tuple3f) = {
      self.set(that);
    }
    def +=(that: Tuple3f) = {
      self.add(that);
    }
    def -=(that: Tuple3f) = {
      self.sub(that);
    }
    def *=(scale: Float) = {
      self.scale(scale);
    }
    def unary_- = {
      val v = new Vector3f();
      v.negate(self)
      v;
    }
    def +(that: Vector3f) = {
      val v = new Vector3f();
      v.add(self, that);
      v;
    }
    def -(that: Vector3f) = {
      val v = new Vector3f();
      v.sub(self, that);
      v;
    }
    def **(that: Vector3f) = {
      val v = new Vector3f();
      v.cross(self, that);
      v;
    }
    def *(scale: Float) = {
      val v = new Vector3f();
      v.scale(scale, self);
      v;
    }
    def *(that: Vector3f) = self.dot(that)
  }

  implicit class RichVector3d(val self: Vector3d) extends AnyVal {
    def :=(that: Tuple3d) = {
      self.set(that);
    }
    def +=(that: Tuple3d) = {
      self.add(that);
    }
    def -=(that: Tuple3d) = {
      self.sub(that);
    }
    def *=(scale: Double) = {
      self.scale(scale);
    }
    def unary_- = {
      val v = new Vector3d();
      v.negate(self)
      v;
    }
    def +(that: Vector3d) = {
      val v = new Vector3d();
      v.add(self, that);
      v;
    }
    def -(that: Vector3d) = {
      val v = new Vector3d();
      v.sub(self, that);
      v;
    }
    def **(that: Vector3d) = {
      val v = new Vector3d();
      v.cross(self, that);
      v;
    }
    def *(scale: Double) = {
      val v = new Vector3d();
      v.scale(scale, self);
      v;
    }
    def *(that: Vector3d) = self.dot(that)
  }
}
