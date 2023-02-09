package com.example.absolutebank;

import com.example.absolutebank.model.TransferBalance;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
@AllArgsConstructor
@RestController("/balance")
public class BalanceController {
    private final BankService bankService;

    @GetMapping("/{accauntId}")
    public BigDecimal getBalance(@PathVariable Long accountId) {
        return bankService.getBalance(accountId);
    }

    @PostMapping("/{add}")
    public BigDecimal addMoney(@RequestBody TransferBalance transferBalance) {
        return bankService.addMoney(transferBalance.getTo(), transferBalance.getAmount());
    }

    @PostMapping("/{accountId}")
    public BigDecimal transfer(@RequestBody TransferBalance transferBalance) {
        bankService.makeTransfer(transferBalance)
    }
}
