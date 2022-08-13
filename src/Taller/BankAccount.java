package Taller;


public class BankAccount {
    public String accountId, bankName, bankId;

    public BankAccount(String accountId, String bankName, String bankId) {
        this.accountId = accountId;
        this.bankName = bankName;
        this.bankId = bankId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accountId=" + accountId + ", bankName=" + bankName + ", bankId=" + bankId + '}';
    }
    
    public boolean deposit(float amount){
        boolean deposited = false;
        return deposited;
    }
}
