package univas.edu.br;

import java.util.*;

public class CustomerController {

	public Customer createCustomer() {

		Scanner scan = new Scanner(System.in);
		Customer cliente = new Customer();

		System.out.println("Entre com o ID do cliente:");
		cliente.setId(scan.nextLong());
		scan.nextLine();
		System.out.println("Entre com o nome do cliente");
		cliente.setName(scan.nextLine());
		System.out.println("Entre com o CPF do cliente");
		cliente.setCpf(scan.nextLine());
		System.out.println("Entre com a forma de pagamento");
		System.out.println("1 - Credit Card\n");
		System.out.println("2 - Account Debit\n");
		System.out.println("3 - PIX");
		System.out.println("4 - Bank Slip");
		int option = scan.nextInt();
		scan.nextLine();
		try {
			if (option == 1) {
				cliente.setPaymentMethod(new CreditCard());
			}
			if (option == 2) {
				cliente.setPaymentMethod(new AccountDebit());
			}
			if (option == 3) {
				cliente.setPaymentMethod(new Pix());
			}
			if (option == 4) {
				cliente.setPaymentMethod(new BankSlip());
			}

			return cliente;

		} catch (Throwable treta) {
			treta.getMessage();
			return null;
		} finally {
			scan.close();
		}

	}

}
