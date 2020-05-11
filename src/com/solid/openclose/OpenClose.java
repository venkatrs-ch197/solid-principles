package com.solid.openclose;

public class OpenClose {

	public static void main(String[] args) {
		CheckoutWOOpenClose checkoutWOOpenClose = new CheckoutWOOpenClose();
		checkoutWOOpenClose.processCheckOut(new Receipt(), "Cash");
		
		CheckoutStrategy checkoutStrategy = new CardTypeCheckoutStrategy();
		checkoutStrategy.processCheckout(new Receipt());
		
		checkoutStrategy =  new CashTypeCheckoutStrategy();
		checkoutStrategy.processCheckout(new Receipt());
	}

}
