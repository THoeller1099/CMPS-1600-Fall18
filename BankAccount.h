//
// Created by Ted Hoeller on 11/27/2018.
//

#ifndef BankAccount_h
#define BankAccount_h

#include <stdio.h>
#include <string>
#include <w32api/wsman.h>

using namespace std;

class BankAccount {
public:
    BankAccount();
    BankAccount(std::string n, double b);
    std::string getName();
    double getBalance();
    virtual void deposit(double a);
    virtual void withdraw(double a);
    void transfer(BankAccount *other, double b);
    void toString();
private:
    std::string name;
    double balance;

};
#endif //BANKACCOUNT_BANKACCOUNT_H
