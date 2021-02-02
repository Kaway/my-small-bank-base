package fr.paris8.iutmontreuil.mysmallbank.account.exposition.dto;

import java.time.LocalDate;
import java.util.List;

public class HolderDTO {

    private String id;
    private String lastName;
    private String firstName;
    private AddressDTO address;
    private LocalDate birthDate;

    private List<AccountDTO> accounts;

    public HolderDTO() {
    }

    public HolderDTO(String id, String lastName, String firstName, AddressDTO address, LocalDate birthDate) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.birthDate = birthDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<AccountDTO> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AccountDTO> accounts) {
        this.accounts = accounts;
    }
}
