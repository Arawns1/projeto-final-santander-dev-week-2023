package me.dio.santanderdevweek2023.service;

import me.dio.santanderdevweek2023.exceptions.NoSuchElementException;
import me.dio.santanderdevweek2023.model.Card;
import me.dio.santanderdevweek2023.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CardService {
    @Autowired
    CardRepository repository;

    public Iterable<Card> findAllCards(){
        return repository.findAll();
    }

    public Card findCardById(Long id){
        Optional<Card> CardFound = repository.findById(id);
        return CardFound.orElseThrow(() -> new NoSuchElementException(id, "Card"));
    }

    public Card saveCard(Card Card){
        return repository.save(Card);
    }

    public void updateCard(Long id, Card Card){
        Optional<Card> CardFound = repository.findById(id);
        if(CardFound.isPresent()) {
            repository.save(Card);
        }
    }

    public boolean deleteCard(Long id){
        repository.deleteById(id);
        Optional<Card> CardDelete = repository.findById(Long.valueOf(id));
        return CardDelete.isEmpty();
    }

}
