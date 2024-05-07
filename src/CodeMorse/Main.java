package CodeMorse;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String letter1 = ".-"; //а
        String letter2 = "-..."; //б
        String letter3 = ".--"; //в
        String letter4 = "--."; //г
        String letter5 = "-.."; //д
        String letter6 = "."; //е
        String letter7 = "...-"; //ж
        String letter8 = "--.."; //з
        String letter9 = ".."; //и
        String letter10 = ".---"; //й
        String letter11 = "-.-"; //к
        String letter12 = ".-.."; //л
        String letter13 = "--"; //м
        String letter14 = "-."; //н
        String letter15 = "---"; //о
        String letter16 = ".--."; //п
        String letter17 = ".-."; //р
        String letter18 = "..."; //с
        String letter19 = "-"; //т
        String letter20 = "..-"; //у
        String letter21 = "..-."; //ф
        String letter22 = "...."; //х
        String letter23 = "-.-."; //ц
        String letter24 = "---."; //ч
        String letter25 = "----"; //ш
        String letter26 = "--.-"; //щ
        String letter27 = ".--.-."; //ъ
        String letter28 = "-.--"; // ы
        String letter29 = "-..-"; //ь
        String letter30 = "..-.."; //э
        String letter31 = "..--"; //ю
        String letter32 = ".-.-"; //я

        System.out.println("Нажмите 1 если хотите перевести морзе в текст");
        System.out.println("Нажмите 2 если хотите перевести текс в морзе");
        Scanner a = new Scanner(System.in);
        String scnr = a.nextLine();
        int size;
        Scanner sc = new Scanner(System.in);
        String world = sc.nextLine();
        int znak1 = world.indexOf(' ');
        String bykva1 = world.substring(0, znak1);
        String bykva2;
        StringBuilder text = new StringBuilder();
        List<String> bykvaList1 = new ArrayList<>();
        bykvaList1.add(world);
        List<String> bykvaList2 = new ArrayList<>();

        if (scnr.equals("1")) {
            for (int i = 0; i < world.length(); i++) {
                do {

                    if (bykva1.equals(".-")) {
                        bykva2 = "а";
                        bykvaList2.add(bykva2);
                        bykvaList1.remove(world.substring(0, znak1));

                    }
                    if (bykva1.equals("-...")) {
                        bykva2 = "б";
                        bykvaList2.add(bykva1);
                        bykvaList1.remove(world.substring(0, znak1));
                    }

                    //  text.append(bykva2);
                    size = bykvaList1.size();
                }
                while (size != 0);
                System.out.println(bykvaList1);
                System.out.println(bykvaList2);
            }
        }
        if (scnr.equals("2")) {
            for (int i = 0; i < world.length(); i++) {

            }
        }
    }
}
