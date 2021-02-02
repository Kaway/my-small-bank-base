package fr.paris8.iutmontreuil.mysmallbank.transfer;

import fr.paris8.iutmontreuil.mysmallbank.account.domain.model.Account;
import fr.paris8.iutmontreuil.mysmallbank.account.domain.model.Holder;
import fr.paris8.iutmontreuil.mysmallbank.account.infrastructure.AccountEntity;
import fr.paris8.iutmontreuil.mysmallbank.account.infrastructure.HolderEntity;

import java.util.List;
import java.util.stream.Collectors;

public class TransferMapper {

    private TransferMapper() { }

    public static TransferDTO toDTO(Transfer transfer) {
        return null;
    }

    public static Account toAccount(AccountEntity accountEntity) {
        return null;
    }

    public static AccountEntity toAccountEntity(Account account) {
        return null;
    }

    public static HolderEntity toHolderEntity(Holder holder) {
        return null;
    }

    public static Holder toHolder(HolderEntity entity) {
        return null;
    }

    public static List<AccountEntity> toAccountEntities(List<Account> accounts) {
        // Use java 8 streams
        return null;
    }


}
