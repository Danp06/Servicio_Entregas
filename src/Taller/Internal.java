package Taller;

public class Internal extends Person {
    public Role role;
    private BankAccount account;

    public Internal(Role role, BankAccount account, String id, String nationalId, String idType, String name, String email, String lastName, Location location, PersonType personType) {
        super(id, nationalId, idType, name, email, lastName, location, personType);
        this.role = role;
        this.account = account;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    @Override
    public boolean biometricValidation() {
        return super.biometricValidation();
    }
}
