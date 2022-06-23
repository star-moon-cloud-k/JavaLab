package enter;

class MainTest {
    public static void main(String[] args){
        new J006StringArray().main();
        new J007ObjectOriented().main_Geo();

        J007ObjectOriented3.Geo geo1 = new J007ObjectOriented3.Geo(37.124123123, 49.423123);
        System.out.printf("위도 : %f , 경도 : %f\n" , geo1.getLatitude(), geo1.getLongitude());

        J007ObjectOriented3.Geo geo2 = geo1;
        System.out.printf("위도 : %f , 경도 : %f\n" , geo2.getLatitude(), geo2.getLongitude());
    }
}
