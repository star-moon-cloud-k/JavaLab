package intermediate;

public class J69StringBuffer {
    public static void main(String[] args) {
        //Stringbuffer 생성
        StringBuffer sb1 = new StringBuffer();

        //1 계속 붙이는 함수 mutable

        sb1.append("안녕")
                .append("반가워")
                .append("또 만나");

        System.out.println(sb1.toString() + sb1.hashCode());

        //2 replace
        sb1.replace(0,2, "나보기가 역겨워");
        System.out.println(sb1.toString() + sb1.hashCode());

        //3 reverse
        sb1.reverse();
        System.out.println(sb1.toString());

        //4 delete
        sb1.delete(10, 15);
        System.out.println(sb1.toString());

        //5 cal by reference, shallow copy
        replaces(sb1);
        System.out.println(sb1.toString());


    }

    public static void replaces(StringBuffer stringBuffer) {
        stringBuffer.reverse();
        stringBuffer.replace(0, 3, "GoGo"); //0 부터 2까지 GoGo로
    }
}
