/*
2.1 Define a class to represent a bank account. Include the following members
Data members:
1. Name of the depositor
2. Account number
3. Type of account (savings or current)
4. Balance amount in the account
Member functions:
1. To assign initial values
2. To deposit an amount
3. To withdraw an amount after checking the balance
4. To display name and balance
Write a main function to test the program.

2.2 Modify the class and program of Problem No. 2.1 for handling of 10 customers.

2.3 Create two classes DM and DB which store the value of distances. DM stores distances in
metres and centimetres and DB in feet and inches. Write a program that can read values for
the class objects and add one object of DM with another object of DB.
Use a friend function to carry out the addition operation. The object that stores the results
may be a DM object or DB object, depending on the units in which the results are required.
The display should be in the format of feet and inches or metres and centimetres depending
on the object on display.

2.4 Create a class distance with private data members km,m,cm. Include the following member
functions:
input distance() with 3 parameters to initialize the distance object.
display() to display a distance object.
add distance() to perform addition of 2 distance objects and will return the result.
In the main function, create an array of n distance objects, initialize and display them. Perform
addition of any 2 distance object by prompting the user for the index of 2 objects in the array.
Display the result.
*/

// 1)
// #include <iostream>
// #include <string>
// using namespace std;

// class BankAccount {
// private:
//     string depositorName;
//     int accountNumber;
//     string accountType;
//     double balance;

// public:
//     // Constructor to initialize values
//     BankAccount(string name, int accNo, string type, double bal) {
//         depositorName = name;
//         accountNumber = accNo;
//         accountType = type;
//         balance = bal;
//     }

//     // Function to deposit an amount
//     void deposit(double amount) {
//         balance += amount;
//         cout << "Amount Deposited: " << amount << endl;
//     }

//     // Function to withdraw an amount
//     void withdraw(double amount) {
//         if (amount > balance) {
//             cout << "Insufficient balance!" << endl;
//         } else {
//             balance -= amount;
//             cout << "Amount Withdrawn: " << amount << endl;
//         }
//     }

//     // Function to display name and balance
//     void display() {
//         cout << "Name: " << depositorName << ", Balance: " << balance << endl;
//     }
// };

// int main() {
//     // Creating an account
//     BankAccount acc1("John Doe", 123456, "Savings", 5000.0);

//     // Performing transactions
//     acc1.deposit(2000);
//     acc1.withdraw(3000);
//     acc1.display();

//     return 0;
// }

// 2)
// #include <iostream>
// #include <string>
// using namespace std;

// class BankAccount {
// private:
//     string depositorName;
//     int accountNumber;
//     string accountType;
//     double balance;

// public:

//     BankAccount(){}
//     // method to initialize values
//     // void initialize(string name, int accNo, string type, double bal) {
//         BankAccount(string name, int accNo, string type, double bal) {
//         depositorName = name;
//         accountNumber = accNo;
//         accountType = type;
//         balance = bal;
//     }

//     void deposit(double amount) {
//         balance += amount;
//         cout << "Deposited: " << amount << endl;
//     }

//     void withdraw(double amount) {
//         if (amount > balance)
//             cout << "Insufficient balance!" << endl;
//         else {
//             balance -= amount;
//             cout << "Withdrawn: " << amount << endl;
//         }
//     }

//     void display() {
//         cout << "Name: " << depositorName << ", Balance: " << balance << endl;
//     }
// };

// int main() {
//     BankAccount accounts[10];

//     // Initializing 10 accounts
//     for (int i = 0; i < 10; i++) {
//         // accounts[i].initialize("Customer" + to_string(i + 1), 1000 + i, "Savings", 1000.0 * (i + 1));
//         accounts[i] = BankAccount("Customer" + to_string(i + 1), 1000 + i, "Savings", 1000.0 * (i + 1));
//     }

//     // Performing transactions for demonstration
//     accounts[0].deposit(500);
//     accounts[1].withdraw(300);
//     accounts[2].display();

//     return 0;
// }

// 3)
#include <iostream>
using namespace std;

class DB; // Forward declaration

class DM {
private:
    int meters, centimeters;

public:
    DM(int m = 0, int cm = 0) : meters(m), centimeters(cm) {}

    void display() {
        cout << meters << " meters " << centimeters << " centimeters" << endl;
    }

    friend DM add(DM, DB);
};

class DB {
private:
    int feet, inches;

public:
    DB(int f = 0, int in = 0) : feet(f), inches(in) {}

    void display() {
        cout << feet << " feet " << inches << " inches" << endl;
    }

    friend DM add(DM, DB);
};

// Function to add DM and DB
DM add(DM d1, DB d2) {
    int totalCM = (d1.meters * 100 + d1.centimeters) + (d2.feet * 30.48 + d2.inches * 2.54);
    return DM(totalCM / 100, totalCM % 100);
}

int main() {
    DM d1(3, 50);
    DB d2(5, 8);

    DM result = add(d1, d2);
    result.display();  // Display in meters and centimeters

    return 0;
}


// 4)
// #include <iostream>
// using namespace std;

// class Distance {
// private:
//     int km, m, cm;

// public:
//     // Constructor
//     Distance(int k = 0, int me = 0, int c = 0) {
//         km = k;
//         m = me;
//         cm = c;
//     }

//     // Function to input distance
//     void input(int k, int me, int c) {
//         km = k;
//         m = me;
//         cm = c;
//     }

//     // Function to display distance
//     void display() {
//         cout << km << " km " << m << " m " << cm << " cm" << endl;
//     }

//     // Function to add two distance objects
//     Distance add(Distance d) {
//         int totalCM = (km * 100000 + m * 100 + cm) + (d.km * 100000 + d.m * 100 + d.cm);
//         return Distance(totalCM / 100000, (totalCM % 100000) / 100, totalCM % 100);
//     }
// };

// int main() {
//     int n;
//     cout << "Enter number of distance objects: ";
//     cin >> n;

//     Distance distances[n];

//     // Initializing distances
//     for (int i = 0; i < n; i++) {
//         int km, m, cm;
//         cout << "Enter distance " << i + 1 << " (km, m, cm): ";
//         cin >> km >> m >> cm;
//         distances[i].input(km, m, cm);
//     }

//     // Displaying distances
//     for (int i = 0; i < n; i++) {
//         cout << "Distance " << i + 1 << ": ";
//         distances[i].display();
//     }

//     // Performing addition
//     int index1, index2;
//     cout << "Enter indexes of two distances to add (1-based index): ";
//     cin >> index1 >> index2;

//     Distance result = distances[index1 - 1].add(distances[index2 - 1]);
//     cout << "Resultant Distance: ";
//     result.display();

//     return 0;
// }