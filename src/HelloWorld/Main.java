package HelloWorld;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String a;
        //StringBuilder sb = new StringBuilder();
        String[] bykvs = {"a","b","с","d","e","f","g","h","i","g","k","l","m","n","o","p","q","r",
                "s","t","u","v","w","x","y","z"};

            int index = 0;
            String value1 = "";
            String value2 = "";
            String value3 = "";
            String value4 = "";
            String value5 = "";
            String value6 = "";
            String value7 = "";
            String value8 = "";
            String value9 = "";
            String value10 = "";
            while (value1!="h"){
                value1 = bykvs[index];
                index = index + 1;
                System.out.println(value1);
            }
            index=0;
            while (value2!="e"){
                value2 = bykvs[index];
                index = index + 1;
                System.out.println(value1+value2);
            }
            index=0;
            while (value3!="l"){
                value3 = bykvs[index];
                index = index + 1;
                System.out.println(value1+value2+value3);
            }
            index=0;
            while (value4!="l"){
                value4 = bykvs[index];
                index = index + 1;
                System.out.println(value1+value2+value3+value4);
            }
            index=0;
            while (value5!="o"){
                value5 = bykvs[index];
                index = index + 1;
                System.out.println(value1+value2+value3+value4+value5);
            }
            index=0;
            while (value6!="w"){
                value6 = bykvs[index];
                index = index + 1;
                System.out.println(value1+value2+value3+value4+value5+" "+value6);
            }
            index=0;
            while (value7!="o"){
                value7 = bykvs[index];
                index = index + 1;
                System.out.println(value1+value2+value3+value4+value5+" "+value6+value7);
            }
            index=0;
            while (value8!="r"){
                value8 = bykvs[index];
                index = index + 1;
                System.out.println(value1+value2+value3+value4+value5+" "+value6+value7+value8);
            }
            index=0;
            while (value9!="l"){
                value9 = bykvs[index];
                index = index + 1;
                System.out.println(value1+value2+value3+value4+value5+" "+value6+value7+value8+value9);
            }
            index=0;
            while (value9!="d"){
                value9 = bykvs[index];
                index = index + 1;
                System.out.println(value1+value2+value3+value4+value5+" "+value6+value7+value8+value9+value10);
            }
    }
}
