public class Math {
    public static void main(String[] args) {

        int x = 10;
        int y = 5 ;
        int res = x + y;
        int res2 = x - y;
        int res3 = x * y;
        int res4 = x / y;
        System.out.println(getAddition (x, y, res));
        System.out.println(getSubtraction (x, y, res2));
        System.out.println(getMultiplication (x, y, res3));
        System.out.println(getDivision (x, y, res4));


    }

    private static int getDivision(int x, int y, int res4) {
        return res4;
    }

    private static int getMultiplication(int x, int y, int res3) {
        return res3;
    }

    private static int getSubtraction(int x, int y, int res2) {
        return res2;
    }

    private static int getAddition(int x, int y, int res) {
        return res;
    }
}
