package begginner;

public class Letters {
    public static void main(String[] args){
        char a = '닳';
        String letter="동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
        int letterNumber = letter.length();
        int loc  = letter.indexOf(a);
        System.out.printf("\"%s\"=> %d 자이며 , '%c'은 %d번째 있다.\n", letter,letterNumber, a , loc);
        char b = letter.charAt(loc);
        System.out.printf("\"%s\"의 %d번쨰 문자는 '%c'이다.",letter,loc,b);
    }
}
