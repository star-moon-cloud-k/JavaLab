package enter;

public class J007ObjectOriented3 {
    public static class Geo {

        private double latitude;
        private double longitude;

        public Geo(double latitude, double longitude) {      //생성자 선언 -> 기본 생성자가 만들어지지 않는다.
            this.latitude = latitude;
            this.longitude = longitude;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }
    }
}
