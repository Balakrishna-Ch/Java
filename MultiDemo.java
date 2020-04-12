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
class C extends B
{
void bye()
	{
	System.out.println("Bye in class C");

     }
}


class MultiDemo
{
	public static void main(String args[])
	{
		C cone=new C();//objec to C
		cone.bye();
		cone.hai();
		cone.hello();
		B bone=new B();// object to B
		bone.hello();
		//bone.bye();
	}

}
