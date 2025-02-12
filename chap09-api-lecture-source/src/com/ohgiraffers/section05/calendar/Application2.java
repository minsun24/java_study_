package com.ohgiraffers.section05.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {
        // Calendar 클래스
        /* 수업목표. java.util.Calendar 클래스 사용법을 이해하고 사용할 수 있다. */

        /* 설명.
        *   Date형 대비 개선점
        *   1. Timezone과 관련된 기능이 추가되었다. (국가별 타임존)
        *   2. 윤년 관련 기능이 내부적으로 추가되었다.
        *   3. 날짜 및 시간 필드 개념을 추가해 불필요한 메소드명을 줄였다.
        * */

//        Calendar calendar = new Calendar();
        //에러.
        //
        // 'Calendar' is abstract; cannot be instantiated

        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);
//        calendar = java.util.GregorianCalendar[time=1738732174801,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=5,DAY_OF_YEAR=36,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=9,SECOND=34,MILLISECOND=801,ZONE_OFFSET=32400000,DST_OFFSET=0]
        // 내부적으로 GregorianCalendar 객체가 생성된다.

        System.out.println(calendar.getTimeZone().getID()); // Asia/Seoul


        Calendar calendar2 = new GregorianCalendar();   // Calendar를 상속받은 GregorianCalendar 클래스 
        System.out.println("calendar2 = " + calendar2); // Calendar.getInstance()와 같은 것


        int year = 2002;
        int month = 2 - 1; // month가 index 체계이므로
        int dayOfMonth = 4;
        int hour = 19;
        int min = 40;
        int second = 0;

        Calendar birthDay = new GregorianCalendar(year, month, dayOfMonth, hour, min, second);
        System.out.println("birthDay = " + birthDay);
        // birthDay = java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=2002,MONTH=1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=4,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=40,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]

        System.out.println("태어난 해 : " + birthDay.get(Calendar.YEAR));
        System.out.println("태어난 달 : " + birthDay.get(Calendar.MONTH));
        System.out.println("태어난 날 : " + birthDay.get(Calendar.DAY_OF_MONTH));
//        System.out.println("태어난 요일 : " + birthDay.get(Calendar.DAY_OF_WEEK));


        String day= "";
        int dayNum = birthDay.get(Calendar.DAY_OF_WEEK);
        switch(dayNum){
            case Calendar.SUNDAY : day = "일"; break;
            case 2 : day = "월"; break;
            case 3 : day = "화"; break;
            case 4 : day = "수"; break;
            case 5 : day = "목"; break;
            case 6 : day = "금"; break;
            case 7 : day = "토"; break;
        }

        System.out.println("태어난 요일 : " +  day +"요일");

        System.out.println("AM/PM" + birthDay.get(Calendar.AM_PM));
        System.out.println("hourOfDAY" + birthDay.get(Calendar.HOUR_OF_DAY));
        System.out.println("hour" + birthDay.get(Calendar.HOUR));
        System.out.println("minutes" + birthDay.get(Calendar.MINUTE));
        System.out.println("second" + birthDay.get(Calendar.SECOND));


        /* 설명. SimpleDateFormat 활용 */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일  HH시 mm분 ss초");
        String birthDayString = sdf.format(new java.util.Date(birthDay.getTimeInMillis()));

        System.out.println("birthDayString  " + birthDay.getTimeInMillis());




    }
}
