public class tugas_array_azmillevel2 {
    public static void main(String[] args) {
        int[] nilai = {75, 80, 65, 90, 55, 85, 70, 95};
        int total = 0;
        int lulus = 0;

        for (int n : nilai) {
            total += n;
            if (n >= 70) lulus++;
        }

        double rata = (double) total / nilai.length;

        System.out.println("Rata-rata: " + rata);
        System.out.println("Nilai di atas rata-rata:");

        for (int n : nilai) {
            if (n > rata) System.out.println(n);
        }

        System.out.println("Jumlah lulus: " + lulus);
        System.out.println("Persentase lulus: "
                + (lulus * 100.0 / nilai.length) + "%");
    }
}
    