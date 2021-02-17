package object_type_casting;

public class prog
{
  public static void main(String[] args)
  {
	A a1=(A) new C();
	a1.t1();
	B b1=(B) a1;
	b1.t1();
	b1.t2();
	C c1=(C) b1;
	c1.t1();
	c1.t2();
	c1.t3();
  }
}
