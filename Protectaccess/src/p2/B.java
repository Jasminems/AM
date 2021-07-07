/*A Java program to create a protected access modifiers*/
//creating package2
package p2;
//Importing package1
import p1.*;
public class B extends A
{
	public static void main(String[] args) 
	{
		B ob=new B();
		System.out.println(ob.i);
		//accessing the protected fields and instance
		ob.print();

	}

}
