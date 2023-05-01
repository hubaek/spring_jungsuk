package com.fastcampus.ch2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {
    public static void main(String[] args) {
//        Calendar today = Calendar.getInstance();
//        System.out.println(today.get(Calendar.YEAR)+"년 "+ today.get(Calendar.MONTH)+"월 "
//                + today.get(Calendar.DATE)+"일 ");
//        System.out.println(today.get(Calendar.HOUR_OF_DAY)+"시 "+today.get(Calendar.MINUTE)+"분");

        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
        sdf.format(today);
        System.out.println(sdf.format(today));
    }
}
