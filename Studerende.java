/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bundenforud;
//Opretter variabler som kun kan ses fra klassen


/**
 *
 * @author burhan
 */
public class Studerende {
    //Opretter variabler som kun er tilgængelig for klassen
    private int alder;
    private String navn;
    //Constructor uden argumenter
    Studerende()
    {
        System.out.println("Et studerende er oprettet");
    }
    //Constructor med en argument
    Studerende(int alder)
    {
        this.alder=alder;
    }
    //Constructor med en argument
    Studerende(String navn)
    {
        this.navn=navn;
    }
    //En metode uden argument
    public void Syg()
    {
            
        System.out.println("Studerende er syg");
    }
    
    public void Aflevering()
    {
        System.out.println("Studerende har afleveret opgaven");
    }
    
}
