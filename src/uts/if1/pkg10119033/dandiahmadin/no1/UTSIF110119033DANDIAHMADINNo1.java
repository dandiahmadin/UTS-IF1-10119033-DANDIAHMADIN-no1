/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119033.dandiahmadin.no1;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi menentukan tandanya kamu dengan menghitung umur serta dengan pendekatan 
 * object oriented dan penerapan konsep pewarisan
 */
public class UTSIF110119033DANDIAHMADINNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Age dandi = new Age(2020);
        
        System.out.print("Masukan Tahun Lahir Anda : ");
        dandi.setYearBirth(input.nextInt());
        
        
        System.out.println("\n=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : " + dandi.getYearBirth());
        System.out.println("Hari ini Tahun : " + dandi.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + dandi.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu ".concat(dandi.tandanyaKamu(dandi.hitungUmur())));
    }
    
}
