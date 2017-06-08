package com;

public class Chair {
    protected void seat() {
        System.out.println("Have a seat.");
    }
    int height = 10;
	private String name = "Name";
    public Chair() {

    }

    class NoWhereToRun {
        public NoWhereToRun() {
            name = "NameChanged";
        }
    }
}

