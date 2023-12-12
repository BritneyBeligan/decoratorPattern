package decoratorPattern;

public class UpSave implements BankAccountDecorator {

    private BankAccount bankAccount;

    public UpSave(SavingsAccount account) {

    }

    @Override
    public String showAccountType() { return "Upsave";
    }

    @Override
    public Double getInterestRate() {
        return 0.04;
    }

    @Override
    public Double getBalance() {
        return 1000.0;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account, With Insurance";
    }

    @Override
    public String showInfo() {
        return "Account Number: " + bankAccount +  "\nAccount name: " + bankAccount;
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {

    }

    public double computeBalanceWithInterest() {

        return 10400.0;
    }
}
