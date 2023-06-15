package org.tnsif.framework;

public abstract class PrimeAcc extends ShopAcc {
	
	@SuppressWarnings("unused")
	private boolean isPrime;
	static final private float deliveryCharges=0.0f;
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Account No: "+this.getAccNo()+
							"Account Name: "+this.getAccNm()+
							"charges: "+(charges+deliveryCharges));
	}

}
