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
public class Start {
    public static void main(String[] args) {
        Datholdet dat=new Datholdet();
        dat.opretStuderende();
        Studerende stu=new Studerende();
        stu.setStuderende("kasper", 23);
        MineMetoder mine=new MineMetoder();
        mine.Scanner();
        mine.date();
        mine.forlokke();
        mine.whilelokke();
        mine.random();
        
    }
}
