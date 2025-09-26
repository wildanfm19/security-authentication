package com.wildan.project.constant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class AppConstant {


    // DATE TIME NOW
    static ZoneId jakartaZone = ZoneId.of("Asia/Jakarta");
    public static final LocalTime TIME = LocalTime.now(jakartaZone);
    public static final LocalDate DATE = LocalDate.now(jakartaZone);
    public static final LocalDateTime DATE_TIME = LocalDateTime.now(jakartaZone);


    //PAGINATION
    //SET SORT BY
    public static final String PAGE_NUMBER = "0";
    public static final String PAGE_SIZE = "50";
    public static final String SORT_BY = "id";
    public static final String SORT_DIR = "asc";
}
