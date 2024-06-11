package HelloWorld;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] bykvs = {"A","B","C","D","E","F","G","H","I","G","K","L","M","N","O","P","Q","R",
                "S","T","U","V","W","X","Y","Z", "a","b","с","d","e","f","g","h","i","g","k","l","m","n","o","p","q","r",
                "s","t","u","v","w","x","y","z","А","Б","В","Г","Д","Е","Ё","Ж","З","И","К","Л","М","Н","О","П",
                "Р","С","Т","У","Ф","Х","Ц","Ч","Ш","Щ","Ъ","Ь","Ы","Э","Ю","Я","а","б","в","г","д","е","ё","ж","з","и",
                "к","л","м","н","о","п","р","с","т","у","ф","х","ц","ч","ш","щ","ъ","ь","ы","э","ю","я" ,
                " ","@","#","$","%","^","&","*","(",")","_","-","=","+","№",";",">",
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

            do {
                value = bykvs[index];
                index = index + 1;
                System.out.println(sb + value);
            }

            while (!value.equals(vivod1));



            if (value.equals(vivod1)) {
                result = vivod1;
                sb.append(result);
            }

        }
    }
}
