package pboif2.pkg10119052.latihan56.umurbarangantik;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * umur barang antik dengan metode polymorphism
 * 
 */
public class PBOIF210119052Latihan56UmurBarangAntik {

    public static void main(String[] args) {
        int umur = 234;
        BarangAntik barangantik  = new BarangAntik(umur);
        Radio radio = new Radio(umur);
        radio.setName("Radio");
        radio.getName();
        barangantik .umur =(234);
        barangantik .tampilumur();
    }
    
}
