package fr.paris8.iutmontreuil.mysmallbank.account.exposition;

import fr.paris8.iutmontreuil.mysmallbank.account.AccountMapper;
import fr.paris8.iutmontreuil.mysmallbank.account.domain.AccountService;
import fr.paris8.iutmontreuil.mysmallbank.account.domain.model.Account;
import fr.paris8.iutmontreuil.mysmallbank.account.exposition.dto.AccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<AccountDTO> listAllAccounts() {
        List<Account> accounts = accountService.listAllAccount();
        return AccountMapper.toDTOs(accounts);
    }

    /* TODO
    @GetMapping("TODO : what path ?")
    public AccountDTO getAccount(@PathVariable("account-uid") String accountUid) {
        return null;
    }
    */

    @PostMapping
    public ResponseEntity<AccountDTO> createAccount(@RequestBody AccountDTO accountDTO) throws URISyntaxException {
        // TODO
        /*
            Transform the AccountDTO to Account object with the AccountMapper and call the right of the service
         */

        // return ResponseEntity.created(new URI("/accounts/" + createdAccount.getUid())).build();
        return null;
    }

    @PostMapping("/batch")
    public List<AccountDTO> createAccount(@RequestBody List<AccountDTO> accountDTO) {
        List<Account> account = AccountMapper.toAccount(accountDTO);
        List<Account> createdAccount = accountService.createAccounts(account);
        return AccountMapper.toDTOs(createdAccount);
    }

    @DeleteMapping(/* TODO */)
    public void deleteAccount() {
        // TODO
    }

}
