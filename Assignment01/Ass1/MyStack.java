package Ass1;

import java.util.Stack;

public class MyStack {

	public static void main(String args[]) {
		Stack<Integer> st = new Stack<>();
		st.push(new Integer(5));
		st.push(new Integer(10));
		st.push(new Integer(15));
		st.push(new Integer(20));
		System.out.println(st.pop());
		System.out.println(st.get(2));
	}
}
