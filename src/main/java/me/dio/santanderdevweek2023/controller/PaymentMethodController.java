package me.dio.santanderdevweek2023.controller;

import me.dio.santanderdevweek2023.model.PaymentMethod;
import me.dio.santanderdevweek2023.service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/paymentmethods")
public class PaymentMethodController {

    @Autowired
    PaymentMethodService service;

    @GetMapping
    public ResponseEntity<Iterable<PaymentMethod>> findAllPaymentMethods(){
        return ResponseEntity.ok(service.findAllPaymentMethods());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaymentMethod> findAllPaymentMethods(@PathVariable("id") UUID id){
        return ResponseEntity.ok(service.findPaymentMethodById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PaymentMethod> updatePaymentMethod(@PathVariable("id") UUID id, @RequestBody PaymentMethod paymentMethod){
        service.updatePaymentMethod(id, paymentMethod);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @PostMapping
    public ResponseEntity<PaymentMethod> savePaymentMethod( @RequestBody PaymentMethod paymentMethod){
        service.savePaymentMethod(paymentMethod);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePaymentMethodById(@PathVariable("id") UUID id){
        boolean isPaymentMethodDeleted = service.deletePaymentMethod(id);
        return ResponseEntity.status(isPaymentMethodDeleted ? HttpStatus.NO_CONTENT : HttpStatus.NOT_FOUND).build();
    }

}
