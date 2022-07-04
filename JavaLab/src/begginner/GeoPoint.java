package begginner;

public class GeoPoint {
    public static void main(String[] args){
        double latitude1 = 37.5431213412;
        double longitude1 = 127.007717384;
        double latitude2 = 35.2879234;
        double longitude2 = 129.90982309;

        System.out.println(latitude1 + "\t" + longitude1);

        double[] latlng1 = {latitude1 , longitude1};
        double[] latlng2 = {latitude2, latitude2};
        System.out.println(latlng1[0] + "\t" + latlng1[1]);

        double [][]latlng = {{latitude1, longitude1},
                {latitude2, longitude2}};

        System.out.println(latlng[0][0] + "\t" + latlng[0][1]);
    }
}
