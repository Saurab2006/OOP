package Tutorial;

abstract class Bank {
	abstract void getBalance();
	}

	class BankA extends Bank {
	    int balance = 100;
	    @Override
	   void getBalance() {
	    	System.out.println("Balance of A");
	    }
	}


	class BankB extends Bank {
	    int balance = 150;
	    	@Override
	    void getBalance() {
	    		System.out.println("Balance of B");
	    }
	}

	class BankC extends Bank {
	    int balance = 200;
	    @Override
	    void getBalance() {
	    	System.out.println("Balance of C");
	    }
	}
