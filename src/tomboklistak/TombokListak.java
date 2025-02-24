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
        
        /*
        float[]
        int[]
        string[]
        double[]
        char[]
        object[]
        bool[]
        */
        
        String szo = "almafa";
        // szo[3] = a
        char[] szo_bontva = new char[6];
        szo_bontva = szo.toCharArray();
        
        /*
        Hozzon létre egy három egész számot tároló tömböt,
        majd számítsa ki az összegüket és írja ki az ererdményt
        */
        
        int szam1 = 3;
        int szam2 = 4;
        int szam3 = 5;
        int osszegzes;
        int[] osszeg = new int[3];
        
        osszeg[0] = szam1;
        osszeg[1] = szam2;
        osszeg[2] = szam3;
        
        osszegzes = osszeg[0] + osszeg[1] + osszeg[2];
        System.out.printf("A számok összege %d\n", osszegzes);
        
        // String tömb
        String[] szavak = new String[3];
        szavak[0] = "alma";
        szavak[1] = "körte";
        szavak[2] = "eper";
        
        // konténer értékek az indexen
        String[] szavak2 = {"alma", "körte", "eper"}; // 3 elemű
        
        // Tömbök 2D - mátrixok / táblázatok
        // Létrehozás
        int[][] matrix = new int[3][3]; // [sor] [oszlop]
        int[][] matrix2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        }; // 3x3 konkrét elemekkel
        // [0][0] = 1   [0][1] = 2  [0][2] = 3
        // [1][0] = 4   [1][1] = 5  [1][2] = 6
        // [2][0] = 7   [2][1] = 8  [2][2] = 9
        // Sorok számának lekérdeése
        int sor = matrix2.length;
        // Oszlopok számának lekérdezése
        int oszlop1 = matrix2[0].length; // első sor oszlopainak száma
        int oszlop2 = matrix2[1].length; // második sor oszlopainak száma
        int oszlop3 = matrix2[2].length; // harmadik sor oszlopainak száma
        
        /*
        Hozzon létre egy 3x2-es tömböt, amely tartalmazza bolti termékek nevét és azok árát!
        Ezután írja ki a termék nevét és az árát
        */
        String[][] termekek = {
            {"Kenyér", "1000Ft"},
            {"Tej", "520Ft"},
            {"Parizer", "600Ft"}
        };
        System.out.println("Termék neve: " + termekek[1][0] + " - " + termekek[1][1]);
    }
    
}
