public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] arrDouble = {1.57, 7.654, 9.986};
        byte[] arrByte = {-10, 0, 20, 100};

        System.out.println("\n\nЗадание 2");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else System.out.println(arr[i]);
        }
        for (double i = 0; i < arrDouble.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arrDouble[(int) i] + ", ");
            } else System.out.println(arrDouble[(int) i]);
        }

        System.out.println("\n\nЗадание 3");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        for (int i = arrDouble.length - 1; i >= 0; i--) {
            System.out.print(arrDouble[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("\n\nЗадание 4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
            }
            System.out.println(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
