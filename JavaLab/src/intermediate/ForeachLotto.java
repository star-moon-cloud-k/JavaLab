package intermediate;

import java.util.ArrayList;
import java.util.List;

public class ForeachLotto {
//    public static void main(String[] args){
//        int[] mm = {1, 2, 16, 22, 23, 33};
//        for (int m : mm){
//            System.out.printf(m + "\t");
//        }
//        System.out.println();
//    }
    public static void print(int ... mm){
        for(int m : mm){
            System.out.printf(m + "\t");
        }
        System.out.println();
    }


    public static void main(String[] args){
        int[] mm = {1, 6, 16, 22, 23, 33};
        print(mm);
        int a = 1, b = 6, c = 16;
        print(a);
        print(a, b);
        print(a, b, c);

        List<Integer> ilist = new ArrayList<>();
        //넣기
        for(int i = 1 ; i< 10 ; i++){
            ilist.add(i);
        }
        //가져오기
        for(int i = 0 ; i<ilist.size(); i++){
            int m = ilist.get(i);
            System.out.printf("%d\t", m);

        }
        System.out.println();
    }

}
