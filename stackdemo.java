package stack;

public class stackdemo<E> implements inter<E>{

	public static void main(String[] args) {
		stackdemo s=new stackdemo();
		s.push(10);
		s.push(20);
		s.pop();
		s.push(30);
		s.push(10);
		s.push(77);
		s.push(52);
		s.push(20);
		s.push(30);
		
		s.pop();
		s.pop();
		s.pop();
		s.display();
	}
	private int t=-1;
	private static final int cap=20;
	private E[] data;
	stackdemo()
	{
		data=(E[])new Object[cap];
	}
	public void push(E e) {
		// TODO Auto-generated method stub
		if(t+1==cap)
		{
			System.out.println("stack overflow");
		}
		else
		{
			t++;
			data[t]=e;
		}
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			System.out.println("stack underflow");
		}
		else
		{
			data[t]=null;
			t--;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return t+1;
	}

	@Override
	public boolean isEmpty() {
		
		return t==-1;
	}

	@Override
	public E top() {
		// TODO Auto-generated method stub
		return data[t];
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		for(int i=0;i<t+1;i++)
		{
			System.out.println(data[i]);
		}
		System.out.println("+++++"+size());
	}

}
