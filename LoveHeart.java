
public class LoveHeart {
    public static void main(String[] args) throws Exception {

        String love = "I love you  Te amo  Je t'aime  "
                + "Ich liebe dich  Ti amo  "
                + "Aku cinta kamu  Eu te amo  "
                + "Saranghae  Seni seviyorum  ";

        String red = "\u001B[91m";
        String reset = "\u001B[0m";

        int rows = 36;
        int cols = 100;
        int k = 0;

        for (int i = 0; i < rows; i++) {

            double y = 1.4 - 2.8 * i / (rows - 1);

            for (int j = 0; j < cols; j++) {

                double x = -1.5 + 3.0 * j / (cols - 1);
                double a = x*x + y*y - 1;

                boolean heart = a*a*a - x*x*y*y*y <= 0;

                // Position inside the heart
                int r = i - 11;
                int c = j - 28;

                // Big S shaped empty space
                boolean S = false;

                if (r >= 0 && r < 13 && c >= 0 && c < 15) {

                    if ((r <= 1 || (r >= 5 && r <= 7)
                            || r >= 11) && c >= 1 && c <= 13)
                        S = true;

                    if (r <= 6 && c <= 2)
                        S = true;

                    if (r >= 6 && c >= 12)
                        S = true;
                }

                // Big V shaped empty space
                int v = c - 22;
                boolean V = false;

                if (r >= 0 && r < 13 && v >= 0 && v < 23) {

                    if (Math.abs(v - Math.round(1 + r * 0.8)) <= 1
                        || Math.abs(v - Math.round(21 - r * 0.8)) <= 1) {
                        V = true;
                    }
                }

                // Print letters except in S and V
                if (heart && !S && !V) {

                    System.out.print(red
                            + love.charAt(k % love.length())
                            + reset);

                    k++;
                    Thread.sleep(5);

                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
