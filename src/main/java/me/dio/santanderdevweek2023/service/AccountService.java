package me.dio.santanderdevweek2023.service;

import me.dio.santanderdevweek2023.exceptions.NoSuchElementException;
import me.dio.santanderdevweek2023.model.Account;
import me.dio.santanderdevweek2023.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class AccountService {
    @Autowired
    AccountRepository repository;

    public Iterable<Account> findAllAccounts(){
        return repository.findAll();
    }

    public Account findAccountById(UUID id) {
        Optional<Account> accountFound = repository.findById(id);
        return accountFound.orElseThrow(() -> new NoSuchElementException(id, "account"));
    }

    public Account saveAccount(Account account){
        return repository.save(account);
    }

    public void updateAccount(UUID id, Account account){
        Optional<Account> accountFound = repository.findById(id);
        if(accountFound.isPresent()) {
            repository.save(account);
        }
    }

    public boolean deleteAccount(UUID id){
        repository.deleteById(id);
        Optional<Account> accountDelete = repository.findById(id);
        return accountDelete.isEmpty();
    }

}
