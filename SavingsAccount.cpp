//
// Created by Ted Hoeller on 11/27/2018.
//

#include "SavingsAccount.h"
#include <string>

using namespace std;

SavingsAccount::SavingsAccount(std::string n, double b, double i) : BankAccount(n, b) {
    this->interest = i;
}

void SavingsAccount::addInterest() {
    double added = interest * getBalance();
    deposit(added);
}