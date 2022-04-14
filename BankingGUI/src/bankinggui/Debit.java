/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankinggui;

/**
 *
 * @author chuyn5
 */
public class Debit {
    double balance;
    double interest;
    public void deposit(String accType, Debit currentAccount, double depositAmount){
        switch (accType){
            case "s":
                ((SavingAccount)currentAccount).deposit(depositAmount);
                break;
            case "c":
                ((ChequingAccount)currentAccount).deposit(depositAmount);
                break;
        }
    }
}
