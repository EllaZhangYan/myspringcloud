package com.s;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class OrderController {
    public static void main(String[] args) {
        Calendar calendar   =   new GregorianCalendar();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE,1);
        System.out.println(calendar.getTime());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str=sdf.format(calendar.getTime());
        System.out.println(str);
    }
}
