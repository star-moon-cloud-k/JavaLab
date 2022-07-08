package intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForLambdaCondition {
    public static void main(String[] args){
        List<Integer> ilist = new ArrayList<>();
        int s = 0;
        for (int i =1 ; i <= 10; i++){
            ilist.add(i);
        }

        ilist = ilist.stream()
                .filter(i -> i % 2 == 1)    //홀수 구하기
                .map(i -> i * i)            //홀수에 대하여 제곱
                .collect(Collectors.toList());  //홀수에 대한 제곱수를 저장
        ilist.forEach(i->{
            System.out.printf(i + "\t");});
        System.out.println();

        s = ilist.stream().reduce(0, Integer::sum);
        System.out.println("1 ~ 10 사이의 홀 수에 대한 제곱합" + s);
    }
}
