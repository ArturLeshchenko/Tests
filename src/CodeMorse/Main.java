package CodeMorse;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class Main {


    public static void main(String[] args) {
        Map<String, String> morse = new HashMap<>();

        morse.put(".-", "а");
        morse.put("-...", "б");
        morse.put(".--", "в");
        morse.put("--.", "г");
        morse.put("-..", "д");
        morse.put(".", "е");
        morse.put("...-", "ж");
        morse.put("--..", "з");
        morse.put("..", "и");
        morse.put(".---", "й");
        morse.put("-.-", "к");
        morse.put(".-..", "л");
        morse.put("--", "м");
        morse.put("-.", "н");
        morse.put("---", "о");
        morse.put(".--.", "п");
        morse.put(".-.", "р");
        morse.put("...", "с");
        morse.put("-", "т");
        morse.put("..-", "у");
        morse.put("..-.", "ф");
        morse.put("....", "х");
        morse.put("-.-.", "ц");
        morse.put("---.", "ч");
        morse.put("----", "ш");
        morse.put("--.-", "щ");
        morse.put(".--.-.", "ъ");
        morse.put("-.--", "ы");
        morse.put("-..-", "ь");
        morse.put("..-..", "э");
        morse.put("..--", "ю");
        morse.put(".-.-", "я");


        System.out.println("Нажмите 1 если хотите перевести морзе в текст");
        System.out.println("Нажмите 2 если хотите перевести текст в морзе");
        Scanner a = new Scanner(System.in);
        String word = a.nextLine();
        Scanner b = new Scanner(System.in);
        String sc = b.nextLine();
        StringBuilder sb = new StringBuilder();



        if (word.equals("1")) {
            String[] bykvs = sc.split(" ");
            for (String decodebykvs : bykvs) {

                String result2 = String.valueOf(morse.get(decodebykvs));
                if (result2.equals("null")) {
                    result2 = " ";
                }
                sb.append(result2);
            }
            System.out.print(sb);
        }
        if (word.equals("2")) {
            String[] bykvs = sc.split("");


            for (Map.Entry<String, String> entry : morse.entrySet()) {
                for (String codebykvs : bykvs) {
                    int index = 0;
                    while (index<bykvs.length) {
                        String value = bykvs[index];
                        if (value.equals(entry.getValue())){
                            String result = entry.getKey();
                            sb.append(result).append(" ");
                            index++;
                        }
                    }

                }
            }
            System.out.print(sb);
        }
    }
}

