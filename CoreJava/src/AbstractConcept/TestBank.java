package AbstractConcept;

public class TestBank {

	public static void main(String[] args) {


		
		HdfcBank h = new HdfcBank();
		h.credit();
		h.debit();
		h.loan();
		
		Bank hb = new HdfcBank();
		hb.credit();
		hb.debit();
		hb.loan();
		
		
		//hb.funds --- only hdfc bank reference variable can access to it
	
		// 	Bank hb = new Bank(); - we cannot create the object of abstract
		

	}

}
