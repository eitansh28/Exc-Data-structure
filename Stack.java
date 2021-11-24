package mivneiNetunim;

import java.util.Arrays;

public class Stack {

	private int[]arr;
	private int p;
	
	public Stack(int[]arr1,int c) {
		arr=arr1;
		p=c;
	}
	public void push(int a) {
		if(p<arr.length)
			arr[p++]=a;
	}
	public boolean empty() {
		return (p==0);
	}

	public int pop() {
		if(!empty()) {
			arr[--p]=0;
			return arr[p];
		}
		return -1;
	}
	
	public int peek() {
		if (!empty())
			return arr[p-1];
		return -1;
	}
	public int get(int i) {
		return arr[i];
	}

	public String toString() {
		String s="";
		for(int i=0;i<arr.length;i++) {
			String c=String.valueOf(arr[i]);
			if(arr[i]!=0) {
				s+=c;
				s+=',';
			}
		}if(s.length()>0 && s.charAt(s.length()-1)==',')
			s=s.substring(0, s.length()-1);
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= new int[10];
		Stack a=new Stack(arr,0);
		a.push(8);
		a.push(5);
		a.push(7);
		a.pop();
		System.out.println(a.peek());
		System.out.println(a);
	}

}
