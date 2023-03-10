import java.util.*;

public class Main {
    public static int[] floorAndCeil(int key, int[] arr) {
        int start = 0, end = arr.length - 1;

        if (arr[end] < key)
            return new int[] { arr[end], -1 };
        else if (arr[start] < key)
            return new int[] { -1, arr[start] };

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key)
                return new int[] { arr[mid], arr[mid] };
            else if (arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return new int[] { arr[end], arr[start] };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, key;
        n = sc.nextInt();
        key = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] result = floorAndCeil(key, arr);
        System.out.println(result[0] + " " + result[1]);
        sc.close();
    }
}