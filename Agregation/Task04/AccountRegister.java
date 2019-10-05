package by.htp.Aggregation.Task04;

import java.util.ArrayList;
import java.util.List;

public class AccountRegister {
    private List<Account> accounts;

    public AccountRegister() {
	this.accounts = new ArrayList<Account>();
    }

    public List<Account> getAccounts() {
	return accounts;
    }

    public void setAccounts(List<Account> accounts) {
	this.accounts = accounts;
    }

    public void addAccount(Account account) {
	accounts.add(account);
    }

    @Override
    public String toString() {
	return "AccountRegister [accounts=" + accounts + "]";
    }
}
