package Clase;

public class Clase {

	public static void main(String[] args)

	{

		Customer customer = new Customer("Anton", "Panaitescu", 1);
		Adress adress = new Adress("Mijloc", "brasov", 1);
		PaymentMethod pm = new PaymentMethod("Card");
		System.out.println(customer);
		// System.out.println(adress);
		// System.out.println(pay);
		Customer customer1 = new Customer("Andrei", "Botezatu", 21, adress, pm);
		System.out.println(customer1);

		System.out.println(customer1.getPaymentMethod().gettype());
		System.out.println(customer1.getCompleteName());
		System.out.println(customer1.getAdress().getnumber());
		System.out.println(customer1.getAdress().getFullAdress());
		System.out.println(customer1.getAdress().getcity());
               System.out.println(customer1.getAdress());
	}

}
