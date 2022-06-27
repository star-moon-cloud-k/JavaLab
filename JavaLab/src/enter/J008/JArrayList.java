package enter.J008;

import enter.J007.J007ObjectOriented4;

import static enter.J007.J007ObjectOriented4.*;

public class JArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Geo> geoArrayList = new java.util.ArrayList<Geo>();
        geoArrayList.add(new J007ObjectOriented4.Geo(37.5670, 126.213423));
        geoArrayList.add(new J007ObjectOriented4.Geo(37.5670, 126.213423));
        geoArrayList.add(new J007ObjectOriented4.Geo(47.01, 10.2));

        System.out.println(geoArrayList.size());
        Geo gt = geoArrayList.get(1);

        System.out.printf("위도 : %f 경도 : %f \n", gt.getLatitude(), gt.getLongitude());

    }
}
