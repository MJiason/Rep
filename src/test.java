public class test {

    public static void main(String[] args) {
        double S = 0;
        char a = 3;
        char b = 4;
        char n = 0;
        char m = 3;
        for (int i = a; i <= n; i++) {
            for (int j = b; j <= m; j++) {
                S = ((double) i + j) / (i + 1) + S;
            }
        }
        System.out.println("S=" + S);
        String j="";
        System.out.println(j.isEmpty());
    }
}