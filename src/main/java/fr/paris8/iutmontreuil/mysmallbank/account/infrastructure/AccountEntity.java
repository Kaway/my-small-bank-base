package fr.paris8.iutmontreuil.mysmallbank.account.infrastructure;

import fr.paris8.iutmontreuil.mysmallbank.account.domain.model.AccountType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class AccountEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String uid;

    @Column(name = "balance")
    private double balance;

    @ManyToOne
    @JoinColumn(name = "holder_id", nullable = false)
    private HolderEntity holder;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private AccountType accountType;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public HolderEntity getHolder() {
        return holder;
    }

    public void setHolder(HolderEntity holder) {
        this.holder = holder;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
