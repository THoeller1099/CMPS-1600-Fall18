//
// Created by Ted Hoeller on 11/27/2018.
//

#ifndef SavingsAccount_h
#define SavingsAccount_h

#include <stdio.h>
#include <string>
#include "BankAccount.h"
using namespace std;

class SavingsAccount : public BankAccount {
public:
    SavingsAccount(std::string n , double b, double i);
    void addInterest();
private:
    double interest;
};

#endif //BANKACCOUNT_SAVINGSACCOUNT_H
