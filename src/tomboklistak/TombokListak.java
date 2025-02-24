/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tomboklistak;

/**
 *
 * @author szebb
 */
public class TombokListak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        
        // Tömbök 1D
        // lineáris: ([1][2][3]...)
        // Fix méretük, mérete nem változtatható a futás során
        // Indexelés
        /*
            [10, 3, 5, 7, 9] => 5 elemű
              0. 1. 2. 3. 4. => elemszám -1
              5. index --> hiba
        */
        
        // Tömb létrehozása
        // Típus[] neve = new típus[maxelemszám];
        int[] szamok = new int[2]; // 2 elemű tömb
        // ilyenkor 0-kat tartalmaz
        
        szamok[0] = a; // tömb első eleme = az 'a' értékben lévő elem
        szamok[1] = b; // tömb második eleme
        // szamok[2] = 4; // ez egy hibás sor, mivel csak 2 elemű!
        
        // %d - egész érték helymegörző
        // \n - sortörés
        System.out.printf("szamok[0] = %d\n", szamok[0]);
        System.out.printf("szamok[1] = %d\n", szamok[1]);
        
        // tömb elemszáma
        int hossz = szamok.length;
        System.out.println("A számok tömb hossza: " + hossz);
    }
    
}
