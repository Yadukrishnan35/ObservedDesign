package com.blz;

public class Page {
	public void onDataRecieved(String data) {
    	System.out.println("data recieved in "+getClass().getSimpleName()+ "" +data);
    }

}
