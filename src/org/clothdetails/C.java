package org.clothdetails;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C  {

	public static void main(String[] args) {
   Map<Integer, String> ok = new LinkedHashMap<>();
   ok.put(10, "vicky");
   ok.put(20, "hai");
   ok.put(30, "mohanPsycho");
   System.out.println(ok);
   int size = ok.size();
   //System.out.println(size);
   Set<Entry<Integer, String>> entrySet = ok.entrySet();
   System.out.println(entrySet);
   for (Entry<Integer, String> x : entrySet) {
	System.out.println(x.getKey()+"\t"+x.getValue());

   		}
	}
}

