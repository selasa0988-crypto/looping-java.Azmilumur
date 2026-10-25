public class tugas_array_azmillevel3 {
    public static void main(String[] args) {
        int [] nilai = {78, 90, 65, 90, 85, 72, 95, 85};
        for(int i= 0; i< nilai.length ; i++){
            for(int j = 0; j < nilai.length ; j++){
                if(nilai [j]< nilai [j+1]){
                    int temp = nilai [j];
                    nilai [j] = nilai [j + 1];
                    nilai[j+1] = temp; 
                }
                System.out.println(java.util.Arrays.toString(nilai));

            }
        }
    }

}
