package HelloWorld;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] bykvs = {"A","B","C","D","E","F","G","H","I","G","K","L","M","N","O","P","Q","R",
                "S","T","U","V","W","X","Y","Z", "a","b","с","d","e","f","g","h","i","g","k","l","m","n","o","p","q","r",
                "s","t","u","v","w","x","y","z"," ","@","#","$","%","^","&","*","(",")","_","-","=","+","№",";",">",
                "<","?",".",",","}","{","!"};
        String value = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите исходный текст который хотите вывести");
        String vvod1 = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        String[] vvod2 = vvod1.split("");
        for (String vivod1 : vvod2) {
            int index = 0;
            String result ="";
            while (!value.equals(vivod1)){
                value = bykvs[index];
                index = index + 1;
                System.out.println(sb + value);
            }
            if (value.equals(vivod1)) {
                result = vivod1;
                sb.append(result);
            }
        }
    }
}
