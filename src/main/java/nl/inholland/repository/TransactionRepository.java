package nl.inholland.repository;

import nl.inholland.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;

import java.util.List;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long>
{
    List<Transaction> findAll();
    List<Transaction> findAllByAccountFromEqualsAndDateEquals(String accountFrom, LocalDate today);
    List<Transaction> findAllByAccountFromEqualsAndDateGreaterThanEqualAndDateLessThanEqual(String userAccount, LocalDate dateFrom, LocalDate dateTo);
}
