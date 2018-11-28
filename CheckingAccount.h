//
// Created by Ted Hoeller on 11/27/2018.
//

#ifndef CheckingAccount_h
#define CheckingAccount_h

#include <stdio.h>
#include <string>
#include "BankAccount.h"

using namespace std;

class CheckingAccount : public BankAccount{
public:
    CheckingAccount(std::string n, double b);
    void deductFees();
private:
    int transactionCount;
    const double TRANSACTION_FEE = 3.0;
};
#endif //BANKACCOUNT_CHECKINGACCOUNT_H
