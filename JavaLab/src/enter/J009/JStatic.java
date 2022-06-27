package enter.J009;

import enter.J007.J007ObjectOriented4;
import enter.J007.J007ObjectOriented4.*;

/*
 static은 객체를 생성하지 않고 상요할 수 있는 키워드
 */
public class JStatic {
    public class HaversineDistance {
        public static double distance(double latl, double lng1, double lat2, double lng2) {
            double earthR = 6371;   //km
            //생략
            return earthR;
        }
    }

    public class GeoDistance {
        public static void main(String[] args) {
            Geo seoul = new Geo(37.5670, 126.9807);     //서울 위도 경도 설정
            Geo austria = new Geo(47.01, 10.2);        //오스트리아 빈 위도 경도 설정
            double distance = HaversineDistance.distance(
                    seoul.getLatitude(), seoul.getLongitude(),
                    austria.getLatitude(), austria.getLongitude());
            System.out.println(distance);

        }
    }
}
