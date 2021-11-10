/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author LENOVO
 */
public class Keledai01 extends Binatang01 implements Herbivora01{
    private String suara;
    private String warnaBulu;

    public Keledai01(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;

    }

    @Override
    public void displayBinatang() {
        System.out.println("Jenis : Herbivora");
        System.out.println("Nama :" + super.nama);
        System.out.println("Jumlah Kaki : " + super.jmlKaki);
    }

    @Override
    public void displayMakanan() {
        System.out.println("Makanan : " + herbivora);
    }

    public void displayData() {
        System.out.println("Suara : " + suara);
        System.out.println("Warna Bulu : " + warnaBulu);
        System.out.println("");
    }
}
