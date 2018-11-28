//
// Created by Ted Hoeller on 11/27/2018.
//

#include "CheckingAccount.h"
#include <string>

using namespace std;

CheckingAccount::CheckingAccount(std::string n, double b) : BankAccount(n, b) {
    transactionCount++;
}

void CheckingAccount::deductFees() {
    double fees = transactionCount * TRANSACTION_FEE;
    deposit(fees);
}

