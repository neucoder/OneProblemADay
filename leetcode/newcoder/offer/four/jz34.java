package newcoder.offer.four;

import java.util.HashMap;

public class jz34 {
    public int FirstNotRepeatingChar(String str) {
        if(str==null){
            return -1;
        }
        if(str.length()==0){
            return -1;
        }
        class Record{
            public int index;
            public int count;
        }

        HashMap<Character, Record> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))){
                map.get(str.charAt(i)).count++;

            }else {
                Record r = new Record();
                r.count = 1;
                r.index = i;
                map.put(str.charAt(i), r);
            }
        }
        int index = Integer.MAX_VALUE;
        for (Character c:map.keySet()){
            if(map.get(c).count==1&&map.get(c).index<index){
                index = map.get(c).index;
            }
        }
        return index!=Integer.MAX_VALUE?index:-1;
    }
}
