package com.saunv.assignment01.stack;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MyStack myStack = new MyStack();
    System.out.println("---------------My Stack----------------");
    myStack.push(5);
    myStack.push(3);
    myStack.push(19);
    myStack.push(50);
    myStack.push(99);
    System.out.print("List element in Stack: ");
    for (int i = 0; i < myStack.getTop() + 1; i++) {
      System.out.print(myStack.get(i) + "  ");
    }
    System.out.println("\nPop a element: " + myStack.pop());
    System.out.println("Pop a element: " + myStack.pop());
    System.out.println("Get element index = 1: " + myStack.get(1));
    System.out.println("Get element index = 2: " + myStack.get(2));
    sc.close();
  }

}
