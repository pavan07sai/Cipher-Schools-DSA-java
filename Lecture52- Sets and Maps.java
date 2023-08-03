import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Set<Integer> s = new HashSet<>();
	    System.out.println(s.size());
	    Syystem.out.println(s.isEmpty());
	    s.add(1);
	    s.add(2);
	    s.add(3);
	    System.out.println(s.contains(2));
	    System.out.println(s.contains(4));
	    System.out.println(s.size());
	    System.out.println(s.contains(3));
	    s.remove(3);
	    System.out.println(s.contains(3));
	    System.out.println(s.size());
	    s.add(2);
	    System.out.println(s.size());
		for(Integer x:s){
		    System.out.println(x+" ");
		}
		System.out.println();
	}
}


import java.util.*;

public class MapImp1{
    
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("Mango",5);
        map.put("Apple",7);
        map.put("Bananas",9);
        map.put("Orange",10);
        System.out.println("Mangoes: " + map.get("Mango"));
        System.out.println("Apple: " + map.get("Apple"));
        System.out.println("Bananas: " + map.get("Bananas"));
        System.out.println("Orange: " + map.get("Orange"));
        map.put("Mango",10);
        
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
