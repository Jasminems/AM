/*A Java program to create a default access modifiers*/
package pack;
class A 
{
	//default fields and methods
	int i=10;
	void print()
	{
		System.out.println(i);
	}
public static void main(String[] args)
{
	A ob=new A();
	ob.print();
}
}