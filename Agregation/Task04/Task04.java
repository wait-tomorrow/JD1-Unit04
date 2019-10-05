package by.htp.Aggregation.Task04;

import java.util.List;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. 
 * Учитывать возможность блокировки/разблокировки счета. 
 * Реализовать поиск и сортировку счетов. 
 * Вычисление общей суммы по счетам. 
 * Вычисление суммы по всем счетам, имеющим положительный и 
 * отрицательный балансы отдельно.
 */

public class Task04 {

    public static void main(String[] args) {
	AccountRegister accountRegister = new AccountRegister();

	Client client1 = new Client("Иванов", "Иван");
	AccountLogic.createAccount(client1, accountRegister, 12345678, 10000, false);
	AccountLogic.createAccount(client1, accountRegister, 43267895, -20, true);

	Client client2 = new Client("Петров", "Пётр");
	AccountLogic.createAccount(client2, accountRegister, 87543296, 150, false);

	double summOfAllAccounts = AccountLogic.calculateSummOfAccounts(accountRegister);
	System.out.println("Сумма по всем счетам: " + summOfAllAccounts);

	double summOfPositiveAccounts = AccountLogic.calculateSummOfAccountsWithPositiveBalance(accountRegister);
	System.out.println("Сумма по счетам с положительным балансом: " + summOfPositiveAccounts);

	double summOfNegativeAccounts = AccountLogic.calculateSummOfAccountsWithNegativeBalance(accountRegister);
	System.out.println("Сумма по счетам с отрицательным балансом: " + summOfNegativeAccounts);

	printAllAccountsOfClient(client1);

	System.out.println("\nВсе счета: ");
	printAccounts(accountRegister.getAccounts());

	System.out.println("\nСортировка счетов по сумме:");
	AccountLogic.sortBySumm(accountRegister);
	printAccounts(accountRegister.getAccounts());
    }

    private static void printAllAccountsOfClient(Client client) {
	System.out.println("\nСчета клиента " + client.getLastName() + " " + client.getFirstName() + ":");

	printAccounts(client.getAccounts());
    }

    private static void printAccounts(List<Account> accounts) {
	for (Account acc : accounts) {
	    System.out.println("Номер счёта: " + acc.getAccountNumber() + " | Сумма: " + acc.getBalance()
		    + " | Заблокирован: " + acc.isBlocked());
	}
    }
}
