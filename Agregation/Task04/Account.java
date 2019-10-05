package by.htp.Aggregation.Task04;

public class Account {
    private boolean blocked;
    private double balance;
    private int accountNumber;

    public Account(int accountNumber, double balance, boolean blocked) {
	this.accountNumber = accountNumber;
	this.balance = balance;
	this.blocked = blocked;
    }

    public boolean isBlocked() {
	return blocked;
    }

    public void setBlocked(boolean blocked) {
	this.blocked = blocked;
    }

    public double getBalance() {
	return balance;
    }

    public void setBalance(double balance) {
	this.balance = balance;
    }

    public int getAccountNumber() {
	return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + accountNumber;
	long temp;
	temp = Double.doubleToLongBits(balance);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + (blocked ? 1231 : 1237);
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
	Account other = (Account) obj;
	if (accountNumber != other.accountNumber)
	    return false;
	if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
	    return false;
	if (blocked != other.blocked)
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Account [blocked=" + blocked + ", balance=" + balance + ", accountNumber=" + accountNumber + "]";
    }
}
