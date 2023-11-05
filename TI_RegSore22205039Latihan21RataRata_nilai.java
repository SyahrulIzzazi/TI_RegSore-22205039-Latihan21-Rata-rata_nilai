package ti_regsore.pkg22205039.latihan21.rata.rata_nilai;
/*
NAMA    : Syahrul Izzazi
NIM     : 22205039
PRODI   : TI RegSore
DESKRIPSI : Program rata-rata nilai
*/
import java.util.Scanner;
public class TI_RegSore22205039Latihan21RataRata_nilai {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rata,total=0; 
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        int banyak = input.nextInt();
        for(int a = 1; a <= banyak; a++){
            System.out.print("Nilai Mahasiswa ke " + a + " : ");
            int nilai = input.nextInt();
            total += nilai;
        }
        rata = total / banyak;
        System.out.println("Rata Rata Nilai Adalah : " + rata);
    }
}
