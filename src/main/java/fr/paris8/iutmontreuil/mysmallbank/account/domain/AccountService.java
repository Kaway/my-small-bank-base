package fr.paris8.iutmontreuil.mysmallbank.account.domain;

import fr.paris8.iutmontreuil.mysmallbank.account.domain.model.Account;
import fr.paris8.iutmontreuil.mysmallbank.common.ValidationError;
import fr.paris8.iutmontreuil.mysmallbank.account.infrastructure.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> listAllAccount() {
        // TODO
        return null;
    }

    public Account getAccount(String accountUid) {
        // TODO
        return null;
    }

    public Account createAccounts(Account account) {

        // TODO validate account before creating:
        /*
            For accounts:
             - All account fields but id should be present
             - Minimum balance depending of account type
            For holders:
             - Holder is must be present
             - Holder must exist in database
         */

        return null;
    }

    public List<Account> createAccounts(List<Account> account) {

        // TODO validate account before creating:
        /*
            For accounts:
             - All account fields but id should be present
             - Minimum balance depending of account type
            For holders:
             - Holder is must be present
             - Holder must exist in database
         */

        return null;
    }

    public void delete(String accountUid) {
        // TODO
        // Can delete only if balance == 0
    }


    private List<ValidationError> validate() {
        // TODO
        return Collections.emptyList();
    }

}
