package com.office;

import com.Chair;

public class OfficeChair extends Chair {
    public OfficeChair() {
        Chair c = new Chair();
        c.seat(); //with protect method seat() this will not compile.
        int h = c.height; //with package variable height, this will not compile.
        seat(); //but, this compiles. Because we can use protected method in child class.
        int h1 = height; //this will not compile. Because height is package.

        //conclusion:
        //a protected method or variable, can be accessed directly in child class.
        //without instantiate with new().
        //with new instance, package member or protected member are not accessible.
    }
}
