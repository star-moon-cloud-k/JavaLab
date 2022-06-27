package enter.J007;

public class J007ObjectOriented4 {
    public static class Geo{
        private double latitude;
        private double longitude;

        public Geo(double latitude , double longitude){
            this.latitude = latitude;
            this.longitude = longitude;
        }
        public Geo() {
            /*  기본 생성자  */
            this(37.5 , 127.0);  //기본으로 생성
        }
        public double getLatitude(){        //getter
            return latitude;
        }
        public void setLatitude(double latitude){       //setter
            this.latitude = latitude;
        }
         public double getLongitude(){
            return longitude;
         }
         public void setLongitude(double longitude){
            this.longitude = longitude;
         }
    }
}
