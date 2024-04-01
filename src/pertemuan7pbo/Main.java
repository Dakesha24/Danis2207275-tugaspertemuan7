package pertemuan7pbo;

/*
Danis (2207275)
*/

//program uji yang mengukur waktu eksekusi pengurutan 100.000 angka menggunakan selection sort.
public class Main {

    public static void main(String[] args) {

        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        int[] deretAngka = new int[100_000];
        for (int i=0; i<deretAngka.length; i++) {
            deretAngka[i] = (int)(Math.random() * 100_000);
        }

        selectionSort(deretAngka);

        stopwatch.stop();
        long elapsedTime = stopwatch.getElapsedTime();

        System.out.println("Waktu eksekusi pengurutan menggunakan selection sort = " + elapsedTime + " milidetik");
    }

    //method selection sort
    private static void selectionSort(int[] deretAngka) {
        for (int i=0; i<deretAngka.length-1; i++) {
            int minIndex = i;
            for (int j=i+1; j<deretAngka.length; j++) {
                if (deretAngka[j]<deretAngka[minIndex]) {
                    minIndex=j;
                }
            }

            int temp = deretAngka[i];
            deretAngka[i] = deretAngka[minIndex];
            deretAngka[minIndex] = temp;
        }
    }
}
