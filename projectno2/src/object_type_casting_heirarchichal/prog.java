package object_type_casting_heirarchichal;

public class prog 
{
  public static void main(String[] args) 
  {
	A a1=(A) new C();
	a1.run();
	C c1=(C)a1;
	c1.eat();
	A a2=(A) new B();
	a2.run();
	B b1=(B)a2;
	b1.walk();
  }
}
