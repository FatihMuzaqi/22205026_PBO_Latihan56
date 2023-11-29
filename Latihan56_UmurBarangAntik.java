
package oop;
class BarangAntik {
   private int umur;

    public BarangAntik(int umur) {
        this.umur = umur;
    }

    public void tampilUmur() {
        System.out.println("Umur barang antik: " + umur + " tahun");
    }
}

// Radio class
class Radio extends BarangAntik {
    private String name;

    public Radio(int umur) {
        super(umur);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Main class for testing
public class Latihan56_UmurBarangAntik {
    public static void main(String[] args) {
        Radio radio = new Radio(234);

        // Menggunakan metode dari kelas BarangAntik
        radio.tampilUmur();

        // Menggunakan metode dari kelas Radio
        radio.setName("Radio AM");
        System.out.println("Nama radio: " + radio.getName());
    }
}
