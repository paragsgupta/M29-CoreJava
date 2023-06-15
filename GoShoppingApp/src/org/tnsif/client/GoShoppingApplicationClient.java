//Driver Class
//program to demonstrate on GoShopApp
package org.tnsif.client;
import org.tnsif.framework.ShopFactory;
import org.tnsif.application.GSNormalAcc;
import org.tnsif.application.GSPrimeAcc;
import org.tnsif.application.GSShopFactory;
import org.tnsif.framework.PrimeAcc;
import org.tnsif.framework.NormalAcc;

public class GoShoppingApplicationClient {

	public static void main(String[] args) {
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(5670,"Yash",570,true);
		NormalAcc n=new GSNormalAcc(2345,"Prabal",570,60);
		System.out.println("Prime Account");
		p.bookProduct(n.getCharges());
		System.out.println("Normal Account");
		n.bookProduct(n.getCharges());
		System.out.println(p);
		System.out.println(n);
		

	}

}
