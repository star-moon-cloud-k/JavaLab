package intermediate;

public class BitNShiftMain {
    public static String shifts1(int a) {
        String s = "";
        for (int i = 0; i <= 31; i++) {
            int aa = a % 2;
            s = (aa >= 0) ? aa + s : (-aa) + s;
            a >>= 1;
        }
        return s;
    }

    public static int BITMASK = 1;
    public static String shifts2(int a){
        int BITMASK =1;
        String s ="";
        for(int i =0; i<= 31; i++){
            s = (a & BITMASK) + s;
            a >>=1;        //a /= 2;
        }
        return s;
    }

    public static String shifts3(int a){
        int BITMASK =1;
        String s ="";
        for(int i =0; i<= 31; i++){
            s = (a & BITMASK) + s;
            a >>=1;        //a /= 2;
        }
        return s.substring(s.indexOf('1'));
    }
        public static void main(String[] args){
            int intNums = 123;
            int intNums2= -123;
            System.out.printf("shifts1 %d : %s %n", intNums, shifts1(intNums));
            System.out.printf("shifts1 %d : %s %n", intNums2, shifts1(intNums2));

            System.out.printf("shifts2 %d : %s %n", intNums, shifts2(intNums));
            System.out.printf("shifts2 %d : %s %n", intNums2, shifts2(intNums2));

            System.out.printf("shifts3 %d : %s %n", intNums, shifts3(intNums));
            System.out.printf("shifts3 %d : %s %n", intNums2, shifts3(intNums2));
        }

}
