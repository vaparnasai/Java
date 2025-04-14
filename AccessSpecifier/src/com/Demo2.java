package com;
//default same packages in same class
class Demo2 {
    int a ;
	
	Demo2()
	{
		System.out.println("Hi Java");
	}
	
	void display()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.a);
		d.display();
	}
}
