/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

/**
 *
 * @author Ghada Raee
 */
public class HW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "غادة";
        int age = 20;
        for(int i=0;i<3;i++)
            legalage(name,age);
        
    }
    public static void legalage(String name, int age){
        if(age>=18)
            System.out.println("مبروك يا "+name+" سوف تحصل على رخصة قيادة");
        else
            System.out.println("للأسف يا "+name+" لا زلت صغير للحصول على رخصة قيادة");
    }
    
}
