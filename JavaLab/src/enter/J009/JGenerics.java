package enter.J009;

import enter.J007.J007ObjectOriented4.*;

import java.util.ArrayList;

public class JGenerics {
    public static void main(String[] args) {
        ArrayList<Geo> geoArrayList = new ArrayList<Geo>();     //Geo 타입만 저장
        geoArrayList.add(new Geo(47.01, 10.2));
        Geo gt =  geoArrayList.get(0);      //index 0의 객체를 가져온다.

        System.out.printf("위도 : %f , 경도 : %f\n", gt.getLatitude(), gt.getLongitude());

    }
}
