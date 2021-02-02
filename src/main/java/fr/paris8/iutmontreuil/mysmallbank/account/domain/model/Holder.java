package fr.paris8.iutmontreuil.mysmallbank.account.domain.model;

import java.time.LocalDate;
import java.util.List;

public class Holder {

    private final String id;
    private final String lastName;
    private final String firstName;
    private final Address address;
    private final LocalDate birthDate;

    private final List<Account> accounts;


    public Holder(String id, String lastName, String firstName, Address address, LocalDate birthDate, List<Account> accounts) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.birthDate = birthDate;
        this.accounts = accounts;
    }

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Address getAddress() {
        return address;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
