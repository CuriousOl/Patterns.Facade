public class BinOps {
    public String sum(String a, String b) {
        String result = "";
        /*Перевод числа из двоичной записи в
          строках в int, сложение и перевод
          обратно в двоичную запись*/
        int A = Integer.parseInt(a, 2);
        int B = Integer.parseInt(b, 2);
        int C = A + B;
        System.out.println(A + " + " + B + " = " + C);
        result = Integer.toBinaryString(C);
        return result;
    }

    public String mult(String a, String b) {
        String result = "";
        /*Перевод числа из двоичной записи в
          строках в int, умножение и перевод
          обратно в двоичную запись*/
        int A = Integer.parseInt(a, 2);
        int B = Integer.parseInt(b, 2);
        int C = A * B;
        System.out.println(A + " * " + B + " = " + C);
        result = Integer.toBinaryString(C);
        return result;
    }
}