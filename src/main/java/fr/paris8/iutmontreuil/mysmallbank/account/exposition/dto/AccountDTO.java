package fr.paris8.iutmontreuil.mysmallbank.account.exposition.dto;

import fr.paris8.iutmontreuil.mysmallbank.account.domain.model.AccountType;

public class AccountDTO {

    private String uid;
    private HolderDTO holder;

    private AccountType type;
    private double balance;

    public AccountDTO() {
    }

    public AccountDTO(String uid, HolderDTO holder, AccountType type, double balance) {
        this.uid = uid;
        this.holder = holder;
        this.type = type;
        this.balance = balance;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public HolderDTO getHolder() {
        return holder;
    }

    public void setHolder(HolderDTO holder) {
        this.holder = holder;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
