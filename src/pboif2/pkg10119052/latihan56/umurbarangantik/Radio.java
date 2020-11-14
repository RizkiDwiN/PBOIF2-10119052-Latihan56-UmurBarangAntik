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
public class Radio extends BarangAntik{
    private String name;

    public Radio(int umur) {
        super(umur);
    }

    public String getName() {
         System.out.println("Nama barang Antik : "+name+" AM");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
