package intermediate;

public class J038_2 {
    public static String textInfor(J038_type index, double value){
        String result = "";
        switch(index){
            case PHYSICAL : result = "신체 지수: ";break;
            case EMOTIONAL : result  = "감정 지수 : " ; break;
            case INTELLECTUAL : result = "지성 지수 : "; break;
            default : result = result = "미결정 : "; break;
        }
        return result + (value*100);
    }

    public static void main(String[] args){
        J038_type index = J038_type.PHYSICAL;
        double value = 0.86;
        System.out.println("신체 지수 주기값: "+index.getPei());
        String st = textInfor(index, value);
        System.out.println(st);
        System.out.println(index.ordinal());
        System.out.println(index.name());
        System.out.println(index);
        System.out.println(index.getPei());
    }
}
