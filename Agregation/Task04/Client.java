package by.htp.Aggregation.Task04;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String lastName;
    private String firstName;
    private List<Account> accounts;

    public Client(String lastName, String firstName) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.accounts = new ArrayList<Account>();
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
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
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
	result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
	result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Client other = (Client) obj;
	if (accounts == null) {
	    if (other.accounts != null)
		return false;
	} else if (!accounts.equals(other.accounts))
	    return false;
	if (firstName == null) {
	    if (other.firstName != null)
		return false;
	} else if (!firstName.equals(other.firstName))
	    return false;
	if (lastName == null) {
	    if (other.lastName != null)
		return false;
	} else if (!lastName.equals(other.lastName))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Client [lastName=" + lastName + ", firstName=" + firstName + ", accounts=" + accounts + "]";
    }
}
