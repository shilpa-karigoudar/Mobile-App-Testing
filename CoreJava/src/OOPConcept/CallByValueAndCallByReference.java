package OOPConcept;

public class CallByValueAndCallByReference {

	int p;
	int q;
	
	public static void main(String[] args) {
		
		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		int x=10;
		int y=20;
		obj.testSum(x, y); //call by value or pass by value
	obj.p=50;
	obj.q=60;
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);

	}
	
	public int testSum(int a,int b){
		a=30;
		b=40;
		int c=a+b;
		return c;
	}

	
	public void swap(CallByValueAndCallByReference t){
		int temp;
		temp=t.q;
		t.q=t.p;
		t.p=temp;
		
	}
}
