package com.example.absolutebank;

import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController("/balance")
public class BalanceController {
    @GetMapping("/{accauntId}")
    public BigDecimal getBalance(@PathVariable Long accountId){

    }
    @PostMapping("/{accountId}")
    public BigDecimal addMoney(
            @PathVariable Long,
            @RequestBody BigDecimal amount
    ){

    }

    @PostMapping("/{accountId}")
    public BigDecimal transfer(
            @PathVariable Long,
            @RequestBody BigDecimal amount
    ){

    }
}
