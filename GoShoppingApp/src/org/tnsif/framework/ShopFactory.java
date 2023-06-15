package org.tnsif.framework;

public abstract class ShopFactory {
	
	abstract public PrimeAcc getNewPrimeAcc(int accNo, String accnm,
			float chatges, boolean isPrime);
	abstract public NormalAcc getNewNormalAcc(int accNo, String accnm,
			float chatges, float deliveryCharges);

}
