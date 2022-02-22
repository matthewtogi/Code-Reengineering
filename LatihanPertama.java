package binus.ac.id.minggu.pertama.solusi;

import java.util.Scanner;

/*
 * Smell code : Long Method
 * Penyebab   : Developer ketika terjadi penambahan/update fungsionalitas/fitur
 * hanya melakukan update perubahan di 1 method saja.
 * Solusi     : Melakukan extract method 
 */

public class LatihanPertama {
	public static int penjumlahanBilangan(int bilangan, int bilangan_dua) {
		return bilangan + bilangan_dua;
	}
	
	public static int penguranganBilangan(int bilangan, int bilangan_dua) {
		return bilangan_dua - bilangan;
	}
	
	public static int perkalianBilangan(int bilangan, int bilangan_dua) {
		return bilangan_dua * bilangan;
	}
	
	public static int pembagianBilangan(int bilangan, int bilangan_dua) {
		return bilangan_dua / bilangan;
	}
	public static void main(String[] args) {

		int bilangan = 0;
		int bilangan_dua = 0;
		int hasil = 0;
		String nama = "";
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Silahkan masukkan bilangan pertama : ");
		bilangan = scanner.nextInt();
		
		System.out.println("Silahkan masukkan bilangan kedua : ");
		bilangan_dua = scanner.nextInt();	
		
		hasil = penjumlahanBilangan(bilangan, bilangan_dua);
		System.out.println("Hasil dari penjumlahan bilangan 1 dan 2 adalah : " + hasil);
		System.out.println();

		hasil = penguranganBilangan(bilangan, bilangan_dua);
		System.out.println("Hasil dari pengurangan bilangan 1 dan 2 adalah : " + hasil);
		System.out.println();
		
		hasil = perkalianBilangan(bilangan, bilangan_dua);
		System.out.println("Hasil dari perkalian bilangan 1 dan 2 adalah : " + hasil);
		System.out.println();
		
		hasil = pembagianBilangan(bilangan, bilangan_dua);
		System.out.println("Hasil dari pembagian bilangan 1 dan 2 adalah : " + hasil);
		System.out.println();
	}

}