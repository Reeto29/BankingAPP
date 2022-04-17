/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankinggui;

/**
 *
 * @author REETO
 */
public class TaxFreeSavingsAccount extends Debit{

    public TaxFreeSavingsAccount(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){

           if(amount <= 6000){
            balance+=amount;
            interest();
           }
        }
    
    private void interest(){
        interest=balance*0.010;
    }
/*
public class SavingAccount {
    public static double balance=2500;
}
*/
    
}
