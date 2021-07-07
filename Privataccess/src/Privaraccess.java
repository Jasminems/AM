/*A Java program to create a private access modifiers*/
class A
{  
	private int i=10;  
	private void print()
	{
		System.out.println(i);
	}  
}  
class Privaraccess
{  
	  public static void main(String args[])
	  {  
		  Privaraccess ob = new Privaraccess();
		  ob.print();  //compile-time error
	  }  
}