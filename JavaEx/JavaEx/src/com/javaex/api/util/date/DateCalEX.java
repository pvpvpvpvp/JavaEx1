package com.javaex.api.util.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		dateEx();
		calenderEx();
	}

	private static void calenderEx() {
		Calendar ca = Calendar.getInstance(); // calendar는 추상
		Calendar custom = Calendar.getInstance();
		// 주의 월정보는 0부터
		custom.set(1999, 11, 31);
		System.out.println("현재 시간:" + ca);
		System.out.println("사용자정의:" + custom);

		// calender에서 현재 년도 월 일
		// calender 상수 사용
		int year = ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH) + 1;
		int date = ca.get(Calendar.DATE);

		System.out.printf("오늘은 %d년 %d 월 %d 일 입니다%n", year, month, date);

		// 100일 후로 이동
		Calendar future = Calendar.getInstance();
		future.add(Calendar.DATE, 100);
		System.out.printf("백일 후 %d년 %d월 %d일%n", future.get(Calendar.YEAR), future.get(Calendar.MONTH) + 1,
				future.get(Calendar.DATE));
		// 이날은 무슨요일?
		int dow = future.get(Calendar.DAY_OF_WEEK); // 일요일 1~7 토요일
		System.out.println(dow);

		String dowstr;
		switch (dow) {
		case Calendar.SUNDAY:
			dowstr = "일요일";
			break;
		case Calendar.MONDAY:
			dowstr = "월요일";
			break;
		case Calendar.TUESDAY:
			dowstr = "화요일";
			break;
		case Calendar.WEDNESDAY:
			dowstr = "수요일";
			break;
		case Calendar.THURSDAY:
			dowstr = "목요일";
			break;
		case Calendar.FRIDAY:
			dowstr = "금요일";
			break;
		case Calendar.SATURDAY:
			dowstr = "토요일";
			break;
		default:
			dowstr="?";
		}
		System.out.println(dowstr);

	}

	private static void dateEx() {
		// 날짜를 얻기
		Date now = new Date(); // 현재 날짜와 시간
		System.out.println("현재: " + now);

		// fomater: 형식화 출력
		// full long medium short
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		DateFormat dl = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat dm = DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat ds = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("FULL Format: " + df.format(now));
		System.out.println("LONG Format: " + dl.format(now));
		System.out.println("MEDIUM Format: " + dm.format(now));
		System.out.println("SHORT Format: " + ds.format(now));

		// SimpleDateFormat

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyy-MMM-ddd HHH:mmm:sss");
		System.out.println("sdf: " + sdf.format(now));

	}
}
