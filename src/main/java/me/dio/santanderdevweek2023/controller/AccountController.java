package me.dio.santanderdevweek2023.controller;

import me.dio.santanderdevweek2023.model.Account;
import me.dio.santanderdevweek2023.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    AccountService service;

    @GetMapping
    public ResponseEntity<Iterable<Account>> findAllAccounts(){
        return ResponseEntity.ok(service.findAllAccounts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> findAllAccounts(@PathVariable("id") UUID id){
        return ResponseEntity.ok(service.findAccountById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Account> updateAccount(@PathVariable("id") UUID id, @RequestBody Account account){
        service.updateAccount(id, account);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @PostMapping
    public ResponseEntity<Account> saveAccount( @RequestBody Account account){
        service.saveAccount(account);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccountById(@PathVariable("id") UUID id){
        boolean isAccountDeleted = service.deleteAccount(id);
        return ResponseEntity.status(isAccountDeleted ? HttpStatus.NO_CONTENT : HttpStatus.NOT_FOUND).build();
    }

}
