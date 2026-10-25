public class tugas_array_azmil1 {
    public static void main(String[] args) {
        int[] stock = {12, 8, 15, 6 };
        System.out.println("barang pertama "+stock [0]);
        System.out.println("barang terakhir "+stock [3]);
        stock[1]= 10;
        for(int i = 0; i<stock.length; i++){
            System.out.println(stock[i]);
        }
    }

}
//jika sctock [4] maka hasil nya akan error karena di dalam array hanya ada 4 angka
//harus nya ada 5 angka baru akan keluar untuk memasukan sctock[4]
//sebab menghitung nya dari 0 bukan dari 1
