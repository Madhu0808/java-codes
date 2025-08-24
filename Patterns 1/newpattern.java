public class newpattern {
    public static void main(String[] args) {
                int rows = 5, cols = 5; // Define the dimensions
        
                for (int i = 0; i < rows; i++) { // Loop through rows
                    for (int j = 0; j < cols; j++) { // Loop through columns
                        // Print '*' for first/last row or first/last column
                        if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  "); // Print space for hollow part
                        }
                    }
                    System.out.println(); // Move to the next line
                }
            }
        }

