package mivneiNetunim;
import java.util.NoSuchElementException;
import java.util.Stack;
public class Ex2 {

	
	private Stack<Object> a,b;
	
	public Ex2() {
		this.a=new Stack<Object>();
		this.b=new Stack<Object>();
	}
	
	public void Enqueue(Object x) {
		a.push(x);
	}
	
	public Object Dequeue() {
		if(a.empty() && b.empty())
			throw new NoSuchElementException("No elements present in Queue");;
		if(!b.empty()) {
			return b.pop();
		}else {
			while(!a.empty())
				b.push(a.pop());
		}return b.pop();
	}
	
	public boolean isEmpty() {
		return a.empty() && b.empty();
	}
	
//	public String toString() {
//		return a.toString()+b.toString();
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2 q=new Ex2();
		q.Enqueue(3);
		q.Enqueue(5);
		q.Enqueue("eitan");
		q.Enqueue(0.7);
		System.out.println(q.Dequeue());
		
	}

}
