public class ScreenSaver {

    public static void printAfterIterations(int textLength, int attemptsAdjust, int maxHeight, int maxWidth){
        int i = 0, j = 0;
        int iMover = 1, jMover = 1;

        for(int k = 0; k < attemptsAdjust; k++){

            if(i + iMover < 0 || i + iMover >= maxHeight){
                iMover *= -1;
            }
            if(j + jMover < 0 || j + jMover + (textLength-1) >= maxWidth){
                jMover *= -1;
            }

            i += iMover;
            j += jMover;
            System.out.println(i + " " + j);


        }
        System.out.println();
        System.out.println(i + " " + j);
    }

    public static void main(String[] args) {
        String input = "Zoho";

        int textLength = input.length();

        int maxHeight = 10;
        int maxWidth = 10;
        int attempts = 100;

        printAfterIterations(textLength, attempts, maxHeight, maxWidth);

    }
}
