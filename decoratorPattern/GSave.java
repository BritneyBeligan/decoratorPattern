package decoratorPattern;

public class GSave implements BankAccountDecorator {

    public BankAccount bankAccount;
    public GSave(SavingsAccount account) {

    }

    @Override
    public String showAccountType() {
        return "Gsave";
    }

    @Override
    public Double getInterestRate() {
        return 0.025;
    }

    @Override
    public Double getBalance() {
        return 10250.0;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account, Gcash Transfer";
    }

    @Override
    public String showInfo() {

        return "Account number: " + bankAccount +  "\nAccount Name: ";
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {

    }

    public double computeBalanceWithInterest() {
        return 10250.0;
    }
}
