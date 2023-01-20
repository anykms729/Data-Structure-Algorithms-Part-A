import java.util.Hashtable;

public class Hashtable_Demo {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>(10);
        Hashtable<String, String> hashtable2 = new Hashtable<>(10);


        hashtable.put(100, "A Student");
        hashtable.put(200, "B Student");
        hashtable.put(300, "C Student");
        hashtable.put(400, "D Student");
        hashtable.put(500, "E Student");
        hashtable.put(600, "F Student");

        for (Integer key:hashtable.keySet()){
            System.out.println("Hashcode: "+key.hashCode()+" & Key "+key+" "+"& Value: "+hashtable.get(key));
        }

        hashtable2.put("100", "A Student");
        hashtable2.put("200", "B Student");
        hashtable2.put("300", "C Student");
        hashtable2.put("400", "D Student");
        hashtable2.put("500", "E Student");
        hashtable2.put("600", "F Student");

        for (String key:hashtable2.keySet()){
            System.out.println("Hashcode: "+key.hashCode()+" & Key "+key+" "+"& Value: "+hashtable2.get(key));
        }
    }
}
