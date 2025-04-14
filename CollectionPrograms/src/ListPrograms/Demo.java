package ListPrograms;

import java.util.Stack;

public class Demo 
{
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(40);
		s.push(30);
		s.add(20);
		s.addElement(10);
		s.pop();
		System.out.println(s.peek());
		System.out.println(s.empty());
		System.out.println(s.search(20));
		System.out.println(s.indexOf(20));
		System.out.println(s);
	}
}
