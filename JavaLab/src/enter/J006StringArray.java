package enter;

public class J006StringArray {
    public static void main(String[] args){
        String city1 = "Asia";  //문자열
        String city2 = "Europe";
        city2 = city1;          //값이 복사되므로 city2 = "Asia"

        System.out.println(city1.length()); //문자열의 길이를 구한다.
        String city4 = String.format("%s - %s", city1,city2);   //원하는 포맷 만들기

        int[] nums2 = {1,2,3};      //크기가 결정된 배열
        //nums2 ={1,2};     //다시 초기화 불가능

        int[] lotto = new int[6];       //{0,0,0,0,0,0} 0으로 초기화
        lotto[0] = -1;                  //set 넣기 -1
        int a = lotto[0];               //get 가져오기 a = -1
        lotto = new int[]{2,3,4,5};     //다시 초기화 가능

        String[] myNum = new String[]{"2022-01-01" , "2022-01-02", "2022-01-03"};
        String[] myNum2 = {"2022-01-01" , "2022-01-02", "2022-01-03"};
    }
}
