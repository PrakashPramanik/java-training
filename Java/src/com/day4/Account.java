package com.day4;

class AmountNotSufficient extends RuntimeException {
	public AmountNotSufficient(String m) {
		super(m);
	}
}

public class Account {
	int amount;
	public Account(int amount) {
		this.amount=amount;
	}
	public void withdrow(int amount1) {
		if(this.amount<amount1) {
			throw new AmountNotSufficient("You don't have sufficient amount to withdraw.");
		}
		else {
			System.out.println("Your withdraw amount " + amount1);
			this.amount-=amount1;
			
		}

	}

	public static void main(String[] args) {
		try {
			Account m1 = new Account(200);
			m1.withdrow(100);
			m1.withdrow(100);
			m1.withdrow(100);
			
		} catch (Exception e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}
		
	}
}
