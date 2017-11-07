/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bundenforudnew;

/**
 *
 * @author burhan
 */
public class Studerende {
    int alder;
    String navn;
    
    Studerende()
    
    {
        System.out.println("Har oprettet en studerende");
        
    }
    Studerende(int alder,String navn)
    {
        this.alder=alder;
        this.navn=navn;
    }
        public void setStuderende(String navn,int alder)
    {
        this.alder=alder;
        this.navn=navn;
    }

}
