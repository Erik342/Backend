/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author zirkl
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // Logikai értélk
        boolean igaz=true;
        boolean hamis=false;
        
        //Adat bekérés
        System.out.println("Kerek egy sor szoveget:");
        Scanner be = new Scanner(System.in); //Beolvasás létrehozása
        String adat= be.nextLine(); //b.nest egy sor szöveg STRING
        System.out.println(adat);
        
        System.out.println("Kerek egy egesz szamot:");
        int a = be.nextInt();
        System.out.println(a);
        
        System.out.println("Kerek egy szot:");
        String szo = be.next();
        System.out.println(szo);
        
        //Konverzió
        String szam = "12";
        System.out.println(szam + 10);
        
        int SzamInt = Integer.parseInt(szam);
        System.out.println(SzamInt + 10);
        
        int num = 100;
        double doubleNum = num;
        System.out.println(doubleNum);
        
        doubleNum = 100.5;
        num = (int) doubleNum;
        System.out.println(num);
        
        String sz1 = "alma";
        sz1 = "almafa";
        System.out.println(sz1);
       
        be.close();
    }
    
}
