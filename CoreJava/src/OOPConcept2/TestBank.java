package OOPConcept2;

public class TestBank {

	public static void main(String[] args) {


		// USBank us = new USBank(); - cannot instantiate the interface
		
		HSBCBank hs = new HSBCBank();
		// complile time polymorphism
		hs.credit();
		hs.debit();
		hs.transfterMoney();
		hs.carLoan();
		hs.educationLoan();

		//dynamic polymorphism
		//chils class object can be referred by parent interface reference
		
		USBank us = new HSBCBank();
		
		System.out.println(USBank.min_Bal);
	}

}
