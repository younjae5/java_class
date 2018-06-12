package kr.ac.kookmin.cs.oop.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//기말고사에 list사용법 나올거!
public class ListExample {
    private List<String> slackIds;
    //private String[] slackIds = new String()[10];
    
    public ListExample() {
        slackIds = new ArrayList<String>();
                 //new LinkedList<String>();
        slackIds.add("leeky");
        slackIds.add("kylee");
        slackIds.add("kmu-bigdata");
    }
    
    public void iterateIds() {
        for(String id : slackIds) {
            System.out.println(id);
        }
        
        System.out.println(slackIds.get(1));
        slackIds.remove(1);
        System.out.println(slackIds.size());
        System.out.println(slackIds.get(1));
        slackIds.add("kmu-cs");
        System.out.println(slackIds.size());
    }
    
}
