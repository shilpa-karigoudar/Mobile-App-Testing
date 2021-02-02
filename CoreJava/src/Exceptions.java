
public class Exceptions {
	
	int a=10;

	public static void main(String args[]) throws InterruptedException{
		
		//int i=9/0;
		
		//System.out.println(i); // uncaught exception
		
		//Thread.sleep(3000);//Caught Exception
		
		Exceptions obj = new Exceptions();
		//obj=null;
		//System.out.println(obj.a);
		
		//1. try - catch block
		
		//try and catch are pair
		
		
		
		
		try{
			int j=9/0; // this code will throw some exception
		}
		catch(Throwable e){   //Throwable , Exception Name , Error
		e.printStackTrace();
		}
		
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		}
		
		
	}

