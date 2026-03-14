public class NumberPyramid {

    public static void main(String[] args) {

        int n = 5; // total rows

        for (int i = 1; i <= n; i++) {

            // print leading spaces
            for (int s = 1; s <= (n - i) * 2; s++) {
                System.out.print(" ");
            }

            // increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // move to next row
            System.out.println();
        }
    }
}