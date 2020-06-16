package databases;

import java.util.ArrayList;
import java.util.List;

public class Mysql {

    public static List<String> searchElements(){
        List<String> elements=new ArrayList<>();
        elements.add("red");
        elements.add("blue");
        elements.add("black");
        return elements;
    }
    public static int[] name={1,4,5,6};

    public static void main(String[] args) throws Exception {
        System.out.println(searchElements());
        System.out.println(ConnectToSqlDB.readDataBase("niaz","search"));
    }
}
