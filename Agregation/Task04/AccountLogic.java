package by.htp.Aggregation.Task04;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AccountLogic {

    public static void createAccount(Client client, AccountRegister accountRegister, int numberAccount, double balance,
	    boolean blocked) {
	Account account = new Account(numberAccount, balance, blocked);
	client.addAccount(account);
	accountRegister.addAccount(account);
    }

    public static double calculateSummOfAccounts(AccountRegister ar) {
	double sum = 0;

	for (Account acc : ar.getAccounts()) {
	    sum = sum + acc.getBalance();
	}

	return sum;
    }

    public static double calculateSummOfAccountsWithPositiveBalance(AccountRegister ar) {
	double sum = 0;

	for (Account acc : ar.getAccounts()) {
	    if (acc.getBalance() > 0) {
		sum = sum + acc.getBalance();
	    }
	}

	return sum;
    }

    public static double calculateSummOfAccountsWithNegativeBalance(AccountRegister ar) {
	double sum = 0;

	for (Account acc : ar.getAccounts()) {
	    if (acc.getBalance() < 0) {
		sum = sum + acc.getBalance();
	    }
	}

	return sum;
    }

    public static void sortBySumm(AccountRegister ar) {
	List<Account> accounts = ar.getAccounts();

	Collections.sort(accounts, new Comparator<Account>() {
	    public int compare(Account one, Account other) {
		if (one.getBalance() < other.getBalance())
		    return -1;
		if (one.getBalance() > other.getBalance())
		    return 1;
		return 0;
	    }
	});
    }
}
