package fr.paris8.iutmontreuil.mysmallbank.account.infrastructure;

import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {

    private final AccountDAO accountDAO;
    private final HolderDAO holderDAO;

    public AccountRepository(AccountDAO accountDAO, HolderDAO holderDAO) {
        this.accountDAO = accountDAO;
        this.holderDAO = holderDAO;
    }

    // TODO: on the Holder Repository model
}
