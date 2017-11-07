/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bundenforudnew;
import static java.lang.Math.random;
import java.util.Date;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author burhan
 */
public class MineMetoder {
    //Metode
    public void forlokke(){
        //For løkke som kører fra 0 til 5
        for(int a=0;a<5;a++)
        {
            System.out.println("Udskriver denne ");
        }
    }
    int b=0;
    
    //While løkke som kører så længe argumentet holder
    public void whilelokke()
    {
    while(b<10)
    {
        
        System.out.println("a");
        b++;
                
    }
    }
    //En metode
    public void Scanner()
    {
        //Scanner objekt som muliggør input
        Scanner input=new Scanner(System.in);
        //Indtastningen bliver gemt som integer
        int tal=input.nextInt();
        System.out.println("Du har skrevet tal" +tal);
                
    }
    //En metode
    public void date()
    {
        //Opretter en date klasse
      Date date = new Date();

      //Viser timen
      System.out.println(date.getTime());

    }
    //en metode
   
    public void random()
    {
        //Random klasse
        Random rand=new Random();
        //Opretter en r som har 40 random nummers,og som starter fra 1
        int r=rand.nextInt(40)+1;
        System.out.print(r);
    }
    

    
}
