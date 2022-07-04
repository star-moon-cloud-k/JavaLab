package begginner;

public class BioCalendar {

    public static final int PHYSICAL = 23;
    // 상수
    // 변수에 public static final을 붙이면 됨

    public static void main(String[] args){
        System.out.println(PHYSICAL);
        int index = PHYSICAL;

        double vals = 2 * Math.PI / index;
        System.out.println(vals + "라디안");
    }
}
