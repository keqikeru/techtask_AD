
public class task1
{
    public static void main(String[] args) {
        int n = Integer.parseInt (args[0]);
        int m = Integer.parseInt (args[1]);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int current = 0;
        System.out.print("Path: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[current]);
            current = (current + m -1) % n;
        }
    }
}