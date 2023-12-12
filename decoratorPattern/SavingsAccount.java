package decoratorPattern;

public class SavingsAccount implements BankAccount  {
    private String accountNumber;
    private String accountName;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public Double getInterestRate() {
        return 0.01;
    }

    @Override
    public Double getBalance() {
        return 1000.0;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings account";
    }

    @Override
    public String showInfo() {
        return "Account Number: " + accountNumber +  "\nAccount name: " + accountName;
    }

    public void setAccountNumber(String valueOf) {
    }

    public void setAccountName(String juanDelaCruz) {
    }

    public void setBalance(double v) {
    }

    public double computeBalanceWithInterest() {
        return 10100.0;
    }
}
