public class tugas_array_azmillevel4 {
    public static void main(String[] args) {
        int[] scores = {80, 90, 70, 85};
        int total = 0;

        for (int i = 0; i < scores.length; i++) {
           total += scores[i];
        }

        double rataRata = (double) total / scores.length;
        System.out.println("Rata-rata: " + rataRata);
    }
}
// program ini tidak berjalan benar karean ini ada yang error saat mengakses indeks luar batas array 
//kesahan nya yaitu di <= scores.length karena menggukan int hanya bisa melakukan yang bulat saja
//dsini saya akan memperbaiki nya