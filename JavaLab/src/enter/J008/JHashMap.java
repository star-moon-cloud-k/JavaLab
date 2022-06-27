package enter.J008;


import java.util.HashMap;

import static enter.J007.J007ObjectOriented4.*;

public class JHashMap {
    public static void main(String[] args){
        HashMap<String, Geo> cities = new HashMap<String , Geo>();

        cities.clear();
        cities.put("Korea", new Geo(37.6780, 126.5900));
        cities.put("Austria", new Geo(47.01, 10.2));
        cities.put("USA", new Geo(40.714086, -74.228697));

        System.out.println(cities.size());      //Map에 저장된 개수
        System.out.println(cities.containsKey("Austria"));     //키값에 Austria가 있는가?
        Geo geo = cities.get("Austria");
        System.out.printf("%s: 위도 : %f , 경도 : %f \n", "Austria",geo.getLatitude(), geo.getLongitude() );

    }
}
