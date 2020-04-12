class A 
{
	 void hello() 
	{
		System.out.println("Hello in class A");
	}
}
class B extends A
{
void hai()
	{
	System.out.println("Hai in class B");

     }
}

class SingleDemo
{
	public static void main(String args[])
	{
		
		B bone=new B();//creating object for class B
		bone.hai();
		bone.hello();
		
	}

}
