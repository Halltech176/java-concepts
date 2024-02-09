package com.halltech;

import static java.math.BigDecimal.ZERO;
import java.math.BigDecimal;

public class BankAccount {
   private String name;
  private  BigDecimal balance;
   private boolean hasOverDraft;

    public BankAccount(){}

    public BankAccount(String name) {
        this.name = name;
        this.balance = ZERO;
        this.hasOverDraft = false;
    }

    public  BankAccount(String name, BigDecimal balance, boolean hasOverDraft){
        this.name = name;
        this.balance = balance;
        this.hasOverDraft = hasOverDraft;

    }


    public BigDecimal withdraw(BigDecimal amount) {
        if (balance.subtract(amount).compareTo(ZERO) >= 0) {
            this.balance = this.balance.subtract(amount);
            return amount;
        }
        return ZERO;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal amount) {
        this.balance = amount;
    }


}
