package enter.J007;


/*
* 은닉화와 접근 제한자
* */
public class J007ObjectOriented2 {
    public class Geo {
        private double latitude;        //외주에 노출되지 않는다.
        private double longitude;

        public double getLatitude() {
            return latitude;
        }
        public void setLatitude(double latitude) {
            this.latitude = latitude;           //this 레퍼런스는 생성된 객체 자신의 주소를 참조하는 레퍼런스(Reference)이다.
                                                //this 는 멤버 _ 멤버변수, 멤버 메서드를 의미한다.
        }
        public double getLongitude(){
            return longitude;
        }
        public void setLongitude(double longitude){
            this.longitude = longitude;
        }
    }
}
