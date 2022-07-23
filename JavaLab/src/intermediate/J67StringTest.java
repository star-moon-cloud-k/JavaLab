package intermediate;

import java.util.Locale;

public class J67StringTest {
    public static void main(String[] args) {
        String text = " hello Java4Android";
        String com = " HEllo Java5Android";

        System.out.println(text.charAt(2));
        //text의 2번째 문자를 char형태로 출력
        System.out.println(text.concat("s"));
        //text에 문자열  "s" 를 뒤에 붙인다
        System.out.println(text.contains("And"));
        //text에 "And" 라는 단어가 존재하면 true 아니면 false
        System.out.println(text.equals(com));
        //text와 com의 문자가 서로 같은지 비교
        System.out.println(text.indexOf("a"));
        //"a"라는 단어가 있는 인덱스 값 출력
        System.out.println(text.lastIndexOf("a"));
        //"a"라는 단어가 있는 인덱스 중 가장 뒤의 값을 출력
        System.out.println(text.trim());
        //text 앞에 있는 공백을 제거
        System.out.println(text.length());
        //text의 길이 출력
        System.out.println(text.substring(7));
        //text의 7번째 인덱스의 문자열 부터 반환
        System.out.println(text.substring(7, 11));
        //text의 7번째 인덱스의 문자열부터 11번까지 반환
        System.out.println(text.replace(" ", "-"));
        //" " 의 값을 모두 "-" 로 변경
        System.out.println(text.toUpperCase());

        System.out.println(text.toLowerCase());

        String[] sp = text.split(" ");
        for (int i = 0; i < sp.length; i++) {
            System.out.println(i + "\t\t" + sp[i] + "\t\t" + sp[i].length());
        }
    }
}
