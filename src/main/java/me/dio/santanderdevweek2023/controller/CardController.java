package me.dio.santanderdevweek2023.controller;

import me.dio.santanderdevweek2023.model.Card;
import me.dio.santanderdevweek2023.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cards")
public class CardController {

    @Autowired
    CardService service;

    @GetMapping
    public ResponseEntity<Iterable<Card>> findAllCards(){
        return ResponseEntity.ok(service.findAllCards());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Card> findAllCards(@PathVariable("id") Long id){
        return ResponseEntity.ok(service.findCardById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Card> updateCard(@PathVariable("id") Long id, @RequestBody Card card){
        service.updateCard(id, card);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @PostMapping
    public ResponseEntity<Card> saveCard( @RequestBody Card card){
        service.saveCard(card);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCardById(@PathVariable("id") Long id){
        boolean isCardDeleted = service.deleteCard(id);
        return ResponseEntity.status(isCardDeleted ? HttpStatus.NO_CONTENT : HttpStatus.NOT_FOUND).build();
    }

}
