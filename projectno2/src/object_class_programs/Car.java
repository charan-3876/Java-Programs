package object_class_programs;

public class Car 
{
   String bn;
   int ts;
   double m;
   String c;
   public Car(String bn,int ts,double m,String c)
   {
	   this.bn=bn;
	   this.ts=ts;
	   this.m=m;
	   this.c=c;
   }
   public boolean equals(Object o1)
   {
	   Car rv=(Car) o1;
	   return (this.ts == rv.ts) &&  (this.m == rv.m);
   }
}
