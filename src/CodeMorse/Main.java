package CodeMorse;

import java.util.*;
import java.util.stream.Collectors;


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
        morse.put("   ", " ");


        System.out.println("Нажмите 1 если хотите перевести морзе в текст");
        System.out.println("Нажмите 2 если хотите перевести текст в морзе");
        Scanner a = new Scanner(System.in);
        String word = a.nextLine();
        System.out.println("Введите текст для перевода");
        String sc = a.nextLine();
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


//            for (String codebykvs : bykvs) {
//
//               String result = morse.entrySet().stream().map(k -> k.getKey())
//                sb.append(result).append(" ");
//
//                for (Map.Entry<String, String> entry : morse.entrySet()) {
//                    if (codebykvs.equalsIgnoreCase(entry.getValue())) {
//                        String result = entry.getKey();
//                        sb.append(result).append(" ");
//
//                    }
//                }
//                System.out.print(sb);
//            }
        }
    }
}
