//
// Created by Ted Hoeller on 11/27/2018.
//

#include <iostream>
#include "BankAccount.h"
BankAccount::BankAccount() = default;

BankAccount::BankAccount(std::string n, double b) {
    this->name = n;
    this->balance = b;
}

std::string BankAccount::getName() {
    return this->name;
}

double BankAccount::getBalance() {
    return this->balance;
}

void BankAccount::deposit(double a) {
    this->balance = this->balance + a;
}

void BankAccount::withdraw(double a) {
    this->balance = this->balance - a;
}

void BankAccount::toString() {
    std::cout << name << ": " << std::to_string(balance) << std::endl;
}

void BankAccount::transfer(BankAccount *other, double b) {
    this->balance = this->balance - b;
    other->balance = other->balance + b;
}