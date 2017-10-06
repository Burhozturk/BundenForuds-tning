/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bundenforud;
//Importerer klasser
import java.util.Scanner;
import java.util.Random;
//Enum uden argument
public enum{
    Burhan, Mads
}

public class MineMetoder {
    int a=0;
    //if løkke/kører hvis argumentet er true(1) 
    if(a=0)
    {
        //Udskriver
        System.out.println("A er lig med 0");
    }
    //For løkke fra 0 til 30, 
    for(int b=0;<30;b++)
    {
        //Udskriver
        System.out.println("for løkke");
    }
    System.out.println("Indtast et værdi");
    //Opretter en objekt af klassen Scanner, som muliggør Input fra console
    Scanner input = new Scanner(System.in);
    int noget=input.nextInt()//Gemmer input i en variabel(hukommelsen)
    
    Random rand = new Random();//Opretter en objekt af random klassen
    int  n = rand.nextInt(50) + 1;//Bruger random klassens metode, og gemmer det i en variabel
    System.out.printl(n);//Printer gemt variabel
    
    
}
    
    
    
    
    
}
