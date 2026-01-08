package com.example.szunetnapok;

import java.time.LocalDate;

public class HolidayDay {
    public LocalDate date;
    public String name;
    public int type;
    public int weekday;

    public HolidayDay(LocalDate date, String name, int type, int weekday) {
        this.date = date;
        this.name = name;
        this.type = type;
        this.weekday = weekday;
    }
}
