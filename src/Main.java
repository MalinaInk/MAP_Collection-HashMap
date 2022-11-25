import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){
        //Task 3
        Task3 mapa = new Task3();

        try {

            mapa.addToMap("пять", 5);
            mapa.addToMap("три", 5);
            mapa.addToMap("пять", 6);
            mapa.addToMap("пять", 6);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
//            System.out.println("Такое значение уже есть");
//            e.printStackTrace();
        }
//        } catch (NullPointerException e){
//            System.out.println("Такое значение уже есть");
//        } catch (IllegalStateException ignored){
//
//        } catch (Throwable e){}

        System.out.println(mapa.toString());


        //Task 2.1
        ListMap listMap = new ListMap();
        System.out.println(listMap.getOriginalMapEntries());
        System.out.println(listMap.getTransformedCollection());


        //Task 2.2
        Map<Integer, String> orderedMap = new LinkedHashMap<>();
        orderedMap.put(5, "Test5");
        orderedMap.put(2, "Test2");
        orderedMap.put(8, "Test8");
        orderedMap.put(4, "Test4");
        orderedMap.put(1, "Test1");
        orderedMap.put(9, "Test9");
        orderedMap.put(7, "Test7");
        orderedMap.put(3, "Test3");
        orderedMap.put(10, "Test10");
        orderedMap.put(6, "Test6");

        for (Map.Entry<Integer, String> entry : orderedMap.entrySet()) {
            System.out.printf("%d:%s%n", entry.getKey(), entry.getValue());
        }
    }
}