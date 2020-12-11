import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {4, 7, 5, 6, 2, 9, 8, -1, 0};
        System.out.println(Arrays.toString(arr));
        int index;
        System.out.print("Nhap vi tri: ");
        index = scanner.nextInt();
        int number;
        System.out.print("So muon thay the: ");
        number = scanner.nextInt();
        int a = checkIndex(arr, index);
        pushNumber(arr, a, number);
        System.out.println(Arrays.toString(arr));
    }

    public static int checkIndex(int[] arr, int number) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (0 < number && number < arr.length - 1) {
                index = number;
                break;
            } else {
                System.out.println("Out of Ranger");
                break;
            }
        }
        return index - 1;
    }

    public static void pushNumber(int[] arr, int index,int number) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = number;

    }

}




