/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankinggui;

/**
 *
 * @author REETO
 */
public class RegisteredEducationSavingsPlanAccount extends Debit {

    public RegisteredEducationSavingsPlanAccount(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
       balance+=amount;
       interest();
    }
    
    private void interest(){
        interest=balance*0.020;
    }
}
