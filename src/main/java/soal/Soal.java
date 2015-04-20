/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soal;

/**
 *
 * @author SB 604-13
 */
public class Soal {
    
    public int pangkat(int bil, int pangkat){
        int hasil = 0;
        int n = 1;
        while(n <= pangkat){
            n++;
            hasil += bil;
        }
        return hasil;
    }
    
    
    
    public int perkalian(int bilA, int bilB){
        return bilA * bilB;
    }
    
    public void tampil(){
        int hasil = perkalian(1,2);
        System.out.println("Hasilnya adalah "+hasil);
    }
    
    
}
