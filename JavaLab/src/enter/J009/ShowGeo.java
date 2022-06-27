package enter.J009;

import enter.J007.J007ObjectOriented4.*;
import enter.J008.JArrayList;

import java.util.ArrayList;

public class ShowGeo {
    public static void showGeo(Geo...goose){
        for(Geo gg: goose){
            System.out.printf("위도 : %f , 경도 : %f \n", gg.getLatitude(), gg.getLongitude());
        }
    }

    public static void showGeo(ArrayList<Geo> goose){
        for (Geo gg : goose){
            System.out.printf("위도 : %f , 경도 : %f\n", gg.getLatitude(), gg.getLongitude());
        }
    }
}
