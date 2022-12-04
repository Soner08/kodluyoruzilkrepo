import java.util.Arrays;

public class Frekans {
    public static void main(String[] args) {
        int[] arr = {12,54,7,54,8,9,12,8,8,12,9};
        int[] storage = new int[arr.length];

        int başlamaİndeksi = 0;
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count++;
                storage[başlamaİndeksi++] = arr[i];
            }
        }

        storage[count] = arr[arr.length - 1];
        count++;
        System.out.println(Arrays.toString(arr));
        

        for (int i = 0; i < count; i++) {
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                if (storage[i] != 0) {
                    if (storage[i] == arr[j]) {
                        c++;
                    }
                }
            }
            System.out.println(storage[i] + "sayısı "+ c + " tekrar etti.");
    }
    }
}

