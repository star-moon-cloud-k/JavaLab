package intermediate;

public class J64UsingObject {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.print("1 : hashCode : " + obj1.hashCode() + "\n");        //native 10진수
        System.out.print("2 : 16진수 hashCode : " + Integer.toHexString(obj1.hashCode()) + "\n"); //16진수

        System.out.println(obj1 == obj2);       //객체는 고유하다

        System.out.print("4 : " + obj1  + "\n");
        System.out.print("5 : " + obj2.toString()  + "\n");        //Class@hashCode()

        System.out.print("6 : "+ obj1.getClass().getName()  + "\n");  //클래스 이름
        String str = obj1.getClass().getName() + "@" +
                Integer.toHexString(obj1.hashCode() );   //16진수

        System.out.print("7 : " + str  + "\n");        //클래스 이름 @ 16진수 해시 코드

        Object objstr = new String("Good");     //다형성
        System.out.print("8 : "+ objstr.toString()  + "\n");
        System.out.print("9 : "+ objstr instanceof Object );
        System.out.println();
        System.out.print("10 : " + objstr instanceof String);
        System.out.println();
        String hello = "hello";
        System.out.print("11 : " + hello.getClass()  + "\n");   //클래스 이름

    }
}
