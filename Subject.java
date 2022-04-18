package com.blz;

import java.util.ArrayList;
import java.util.List;

public class Subject {
   List<Page> pageList = new ArrayList<Page>();
   
   public void register(Page page) {
	   pageList.add(page);
   }
   
   public void UnRegister(Page page) {
	   pageList.remove(page);
	
   }
   public void update(String data) {
	     for(Page page : pageList) {
	    	 page.onDataRecieved(data);
	    	 
	     }
   }
}
