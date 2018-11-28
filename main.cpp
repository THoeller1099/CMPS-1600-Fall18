#include <iostream>
#include <string>

using namespace std;

#include "BankAccount.h"
#include "SavingsAccount.h"
#include "CheckingAccount.h"
int main() {
    BankAccount *Ted = new BankAccount("Ted", 0);
    BankAccount *Tom = new BankAccount("Tom", 500);
    Ted->deposit(1000);
    Tom->withdraw(100);
    Ted->transfer(Tom, 200);

    Ted->toString();
    Tom->toString();

    SavingsAccount *Tim = new SavingsAccount("Tim", 0, .01);
    CheckingAccount *Tiffany = new CheckingAccount("Tiffany", 500);

    Tim->deposit(1000);
    Tiffany->withdraw(100);

    Tim->transfer(Tiffany, 200);

    Tim->addInterest();
    Tiffany->deductFees();

    Tim->toString();
    Tiffany->toString();
    return 0;
}