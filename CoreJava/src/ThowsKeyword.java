
public class ThowsKeyword {

	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub
		
		ThowsKeyword obj = new ThowsKeyword();
		
		obj.sum();

	}

	public void sum() throws ArithmeticException{
		div();
	}
	
	public void div() throws ArithmeticException{
		int i=9/0;
	}
}
