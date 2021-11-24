package mivneiNetunim;
import java.util.PriorityQueue;
import java.util.Comparator;


public class Ex3 {

//	class stObject{                              I created a new object with a value and variable that sets priority 
//	int priority;																	I brought the realization here	
//	Object value;
//	
//	public stObject(int n, Object obj) {
//		this.priority=n;
//		this.value=obj;
//	}
	private PriorityQueue<stObject> a=new PriorityQueue<>();

	
	public Ex3() {
		this.a=new PriorityQueue<>(new Comparator<stObject>() {    //Setting the priority in the queue according to the priority variable
			public int compare(stObject x,stObject y) {
				return y.priority-x.priority;
			}
		});
		}
	
	
	int priorityorder=0;
	public void push(Object x) {
		stObject n=new stObject(priorityorder,x);   //Every time an object enters it gets the higher priority
		priorityorder++;    //Promoting the priority value towards the next object
		a.add(n);
		
	}
	
	public Object pop() {
		if(a.isEmpty())
			return null;
		priorityorder--;    //Decreasing the priority value after removing an object
		Object ans=a.poll().value;
		return ans;
	}
	
	public boolean isEmpty(){
		return a.isEmpty();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ex3 v=new Ex3();
//		v.push(7);
//		v.push(5);
//		v.push(-6);
//		v.push(8);
//		v.push("hello");
//		Object c=v.pop();
//		System.out.println(v.isEmpty());
	}

	}
