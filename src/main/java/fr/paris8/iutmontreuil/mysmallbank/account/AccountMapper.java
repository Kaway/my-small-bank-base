package fr.paris8.iutmontreuil.mysmallbank.account;

import fr.paris8.iutmontreuil.mysmallbank.account.domain.model.Account;
import fr.paris8.iutmontreuil.mysmallbank.account.domain.model.Holder;
import fr.paris8.iutmontreuil.mysmallbank.account.exposition.dto.AccountDTO;
import fr.paris8.iutmontreuil.mysmallbank.account.exposition.dto.HolderDTO;
import fr.paris8.iutmontreuil.mysmallbank.account.infrastructure.AccountEntity;
import fr.paris8.iutmontreuil.mysmallbank.account.infrastructure.HolderEntity;

import java.util.List;
import java.util.stream.Collectors;

public class AccountMapper {

    private AccountMapper() { }

    public static Account toAccount(AccountDTO accountDTO) {
        return new Account(accountDTO.getUid(), toHolder(accountDTO.getHolder()), accountDTO.getType(), accountDTO.getBalance());
    }

    private static Holder toHolder(HolderDTO holderDTO) {
        return new Holder(holderDTO.getId(), null, null, null, null, null);
    }

    public static AccountDTO toHolderDTO(Account account) {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setBalance(account.getBalance());
        accountDTO.setHolder(toHolderDTO(account.getHolder()));
        accountDTO.setType(account.getCategory());
        accountDTO.setUid(account.getUid());
        return accountDTO;
    }

    public static Account toAccount(AccountEntity accountEntity) {
        return new Account(accountEntity.getUid(), toHolder(accountEntity.getHolder()), accountEntity.getAccountType(), accountEntity.getBalance());
    }

    public static AccountEntity toEntity(Account account) {
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setBalance(account.getBalance());
        accountEntity.setHolder(toHolderEntity(account.getHolder()));
        accountEntity.setAccountType(account.getCategory());
        accountEntity.setUid(account.getUid());
        return accountEntity;
    }

    private static HolderEntity toHolderEntity(Holder holder) {
        HolderEntity holderEntity = new HolderEntity();
        holderEntity.setId(holder.getId());
        return holderEntity;
    }


    public static Holder toHolder(HolderEntity holderEntity) {
        return new Holder(holderEntity.getId(), holderEntity.getLastName(), holderEntity.getFirstName(), null, holderEntity.getBirthDate(), null);
    }

    public static HolderDTO toHolderDTO(Holder holder) {
        HolderDTO holderDTO = new HolderDTO();
        holderDTO.setBirthDate(holder.getBirthDate());
        holderDTO.setFirstName(holder.getFirstName());
        holderDTO.setLastName(holder.getLastName());
        holderDTO.setId(holder.getId());

        return holderDTO;
    }

    public static List<AccountDTO> toDTOs(List<Account> accounts) {
        // Call the toDTO method with a java 8 stream
        return null;
    }

    public static List<Account> toAccounts(List<AccountEntity> accounts) {
        // Call the toAccount method with a java 8 stream

        return null;
    }

    public static List<AccountEntity> toEntities(List<Account> account) {
        // Call the toEntity method with a java 8 stream
        return null;
    }

    public static List<Account> toAccount(List<AccountDTO> accountDTO) {
        // call the toAccount method with a java 8 stream;
        return null;
    }


}
