package enter.J007;

import enter.J006.J006StringArray;

class MainTest {
    public static void main(String[] args) {
        new J006StringArray().main();
        new J007ObjectOriented().main_Geo();

        J007ObjectOriented3.Geo geo1 = new J007ObjectOriented3.Geo(37.124123123, 49.423123);
        System.out.printf("위도 : %f , 경도 : %f\n", geo1.getLatitude(), geo1.getLongitude());

        J007ObjectOriented3.Geo geo2 = geo1;
        System.out.printf("위도 : %f , 경도 : %f\n", geo2.getLatitude(), geo2.getLongitude());

        J007ObjectOriented4.Geo geo3 = new J007ObjectOriented4.Geo();
        System.out.printf("위도 : %f , 경도 : %f\n", geo3.getLatitude(), geo3.getLongitude());

        J007ObjectOriented4.Geo geo4 = geo3;
        System.out.printf("위도 : %f , 경도 : %f\n", geo4.getLatitude(), geo4.getLongitude());

        System.out.println("\n\n");
        J007ObjectOriented4.Geo seoul = new J007ObjectOriented4.Geo(37.5670, 126.9807);  // 서울 위도 경도 설정
        J007ObjectOriented4.Geo austria = new J007ObjectOriented4.Geo(47.01, 10.2);  //오스트리아 위도 경도 설정
        J007ObjectOriented4.Geo newyork = new J007ObjectOriented4.Geo(40.714086, -74.228697);  //뉴욕 위도 경도 설정

        showGeo(seoul, seoul, newyork);
        showGeo(seoul, newyork, austria, austria);

        J007ObjectOriented4.Geo[] geo5 = new J007ObjectOriented4.Geo[]{
                new J007ObjectOriented4.Geo(37.5670, 126.9807), new J007ObjectOriented4.Geo(47.01, 10.2),
                new J007ObjectOriented4.Geo(40.714086, -74.228697)
        };

        J007ObjectOriented4.Geo[] geo6 = new J007ObjectOriented4.Geo[3];
        geo6[0] = new J007ObjectOriented4.Geo(37.5670, 126.9807);
        geo6[1] =  new J007ObjectOriented4.Geo(47.01, 10.2);
        geo6[2] = new J007ObjectOriented4.Geo(40.714086, -74.228697);

        System.out.printf("배열 // 위도 : %f , 경도: %f\n" , geo5[0].getLatitude(), geo5[0].getLongitude());
        System.out.printf("배열 // 위도 : %f , 경도: %f\n" , geo6[0].getLatitude(), geo6[0].getLongitude());
    }


    public static void showGeo(J007ObjectOriented4.Geo... goose) {      //여러개의 인자를 받음.
        for (J007ObjectOriented4.Geo gg : goose) {
            System.out.printf("여러개의 인자 // 위도 : %f , 경도 : %f\n", gg.getLatitude(), gg.getLongitude());
        }
        System.out.println("");
    }
}
