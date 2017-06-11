package com.home;

import com.Chair;

public class RoomChair extends Chair {
    public RoomChair() {
        seat();
        //int h = height;
    }
    @Override
    private void seat() {
        System.out.println("Have a seat.     ");
    }
}