/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankinggui;
/**
 *
 * @author rghos1
 */
class ChequingAccount extends Debit{
    
    public ChequingAccount(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        balance+=amount;
        interest();
    }
    
    private void interest(){
        interest=balance*0.010;
    }
    
 /*
    public double balance;
    public double interest;
    
    public ChequingAccount(double b){
        balance=b;
        interest();
    }
    
    public void deposit(double depositAmount){
        balance+=depositAmount;
        interest();
            
}
    public void withdraw(double withdrawAmount){
        balance-=withdrawAmount;
        interest();
    }
    
    private void interest(){
        interest=balance*0.010;
    }
*/
    
}
        