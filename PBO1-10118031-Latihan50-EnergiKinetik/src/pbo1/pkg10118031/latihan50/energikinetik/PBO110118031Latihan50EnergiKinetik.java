package pbo1.pkg10118031.latihan50.energikinetik;

import java.text.DecimalFormat;

/**
 *
 * @author Vendetta 
 * NAMA              : Rizki Aria Putra 
 * KELAS             : PBO1 
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk menghitung enegi kinetik
 */
public class PBO110118031Latihan50EnergiKinetik {

    public static void main(String[] args) {

        Energi kinetik = new Energi();
        kinetik.setMassa(0.145);
        kinetik.setKecepatan(25);
        kinetik.setKecepatanAwal(0);
        kinetik.setKecepatanAkhir(25);

        DecimalFormat df = new DecimalFormat("#.#");

        System.out.println("=====PROGRAM MENCARI ENERGI KINETIK=====");
        System.out.println("Energi Kinetik\t : " + df.format(
                kinetik.hitungEnergiKinetik(kinetik.getMassa(), kinetik.getKecepatan())));
        System.out.println("Usaha\t\t : " + df.format(kinetik.hitungUsaha(kinetik.getKecepatanAwal(),
                kinetik.getKecepatanAkhir())));
    }

}
