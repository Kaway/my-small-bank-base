package fr.paris8.iutmontreuil.mysmallbank.account.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDAO extends JpaRepository<AccountEntity, String> {
}
