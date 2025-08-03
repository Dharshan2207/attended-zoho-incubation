public class ScreenSaverVariant {
    public static void main(String[] args) throws InterruptedException {
        int rows = 10;
        int cols = 40;
        int row = 0;
        int col = 0;
        int rowDir = 1;
        int colDir = 1;
        int steps=30;
        String text = "ZOHOCORP";
        int textLen = text.length();

        while (steps!=0) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Top border
            System.out.print("+");
            for (int i = 0; i < cols; i++) System.out.print("-");
            System.out.println("+");

            for (int i = 0; i < rows; i++) {
                System.out.print("|");
                for (int j = 0; j < cols; j++) {
                    if (i == row && j == col) {
                        System.out.print(text);
                        j += textLen - 1;
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("|");
            }


            System.out.print("+");
            for (int i = 0; i < cols; i++) System.out.print("-");
            System.out.println("+");


            if (row == 0) rowDir = 1;
            else if (row == rows - 1) rowDir = -1;

            if (col <= 0) colDir = 1;
            else if (col + textLen >= cols) colDir = -1;

            row += rowDir;
            col += colDir;

            Thread.sleep(600);
            steps--;
        }
    }
}