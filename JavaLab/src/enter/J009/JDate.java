package enter.J009;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
자바는 날짜의 기준을 1970.1.1.0.0.0 (연도 , 월 , 날짜 ,시간 , 분 , 초) 로 설정하고 상대적으로 얼마가 경과했는지를 이용한다.
ex : 오늘이 1970.1.2.0.0.0 -> 1 * 24 * 60 * 60 * 1000(하루) 경과한 것이다.

java.lang.System.currentTimeMillis()가 경과 시간을 long으로 반환하는 과정은 다음 그림과 같다

java.util.Date 는 경과 시간을 long을 이용하여 원하는 Date로 변환한다.
java.util.Calendar의 getTimeMillis()는 경과 시간을 long으로 반환하고, getTime()은 Date를 준다.
java.text.SimpleDateFormat은 Date와 String을 서로 변환할 수 있다.

 */
public class JDate {
    public static void JDate() {
        long millis = System.currentTimeMillis();
        int days = (int) (millis / 1000 / 24 / 60 / 60);     //1970.01.01부터 며칠

        Date d = new Date();         //오늘
        Date dd = new Date(d.getTime() + 24 * 60 * 60 * 1000); //하루 후 = 내일

        Calendar cal1970 = Calendar.getInstance();      //오늘

        cal1970.set(1970, 1 - 1, 1); //자바에서는 1월 ~ 12월을 0월 ~ 11월로 사용한다.
        //(1970,1-1,1) 은 1970.1.1이다.

        Calendar today = Calendar.getInstance();
        long minus = today.getTimeInMillis() - cal1970.getTimeInMillis();     //현재 - 1970.1.1

        //date를 String으로
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //연도 4자리 - 월 2자리 , 일 2자리
        String st = sdf.format(dd);
        Date d2 = new Date();


        // 예외처리
        try {
            d2 = sdf.parse(st);
        } catch (ParseException e) {
            System.out.println(d2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
