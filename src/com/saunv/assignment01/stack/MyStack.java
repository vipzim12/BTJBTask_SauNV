package com.saunv.assignment01.stack;

import java.util.ArrayList;

class MyStack {
  private ArrayList<Integer> stackValue;
  private int top;

  public MyStack() {
    stackValue = new ArrayList<>();
    top = -1;
  }

  public void push(int element) {
    top++;
    stackValue.add(element);
  }

  public int pop() {
    if (stackValue.size() == 0) {
      System.out.println("Stack Underflow");
      return -1;
    } else {
      int element = stackValue.get(top);
      stackValue.remove(top);
      top--;
      return element;
    }
  }

  public int get(int index) {
    int element = stackValue.get(index);
    return element;
  }

  public int getTop() {
    return top;
  }

  public void setTop(int top) {
    this.top = top;
  }

}