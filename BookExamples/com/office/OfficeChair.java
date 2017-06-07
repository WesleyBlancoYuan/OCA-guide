package com.office;

import com.Chair;

public class OfficeChair extends Chair {
    public OfficeChair() {
        Chair c = new Chair();
        c.seat();
        int h = c.height;
    }
}
