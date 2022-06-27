package enter.J007;

/*
자주 쓰이는 패키지
java.lang : 자바 언어의 가장 중요한 클래스
java.util : java.lang을 도와주거나 편리하게 해주는 클래스
java.io : IO에 관련된 클래스
 */
public class J007ObjectOriented {
    public class Geo{       //Geo 클래스를 선언, 설계도와 같다
        public double latitude = 0.0;     //위도 멤버 -> 중요한 데이터
        public double longitude = 0.0;   //경도 멤버 -> 중요한 데이터
    }
    public void main_Geo(){
        Geo geo1 = new Geo();               //객체 생성
        geo1.latitude = 37.19849239847;     //위도 값을 객체의 멤버에 대입 _ setter
        geo1.longitude = 127.00081039749234;    //경도 값을 객체의 맴버에 대입

        System.out.printf("위도: %f , 경도 : %f \n", geo1.latitude, geo1.longitude);        //객체의 멤버 값 가져오기 (getter)

        Geo geo2 = geo1;
        System.out.printf("위도: %f , 경도 : %f\n", geo2.latitude , geo2.longitude);

    }

}
