package databases;

import java.util.ArrayList;
import java.util.List;

public class SqlTable {

    public static List<String> searchElements(){
        List<String> elements=new ArrayList<String>();
        elements.add("Mango");
        elements.add("Orange");
        elements.add("lime");
        return elements;

        //public static int[] name={1,3,4,8}


    }

    public static void main(String[] args) throws Exception {

        //sysytem.out.println(searchElements());

        ConnectToSqlDB.insertDataFromArrayListToSqlTable(searchElements(),"niaz","search");

        System.out.println(ConnectToSqlDB.readDataBase("niaz","search"));

    }

}
