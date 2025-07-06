

public class MyMainClass {
    public static void main(String[] args) {
        
        // nested loop example
        // pattern has 7 rows =7;

        int rows = 7;

           // outer loop for each row
        for (int i = 0; i < rows; i++) {
            // inner loop for creating the spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            // inner loop for the right side of the triangle, decreasing numbers in twos
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((int) Math.pow(2, j) + " ");
            }
            // inner loop for the left side of the triangle, increasing numbers in twos
            for (int j = 0; j <= i; j++) {
                System.out.print((int) Math.pow(2, j) + " ");
            }
            // Do not forget the @ symbol at the end of each row
            System.out.println("@");
            // move to the next line after each row
            
        }
    }
}
