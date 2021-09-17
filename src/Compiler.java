import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Compiler {
    static int i = 0, tokens = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> symbolTable = new HashMap<>();
        String[] keys = ("auto else long switch " +
                "break enum register typedef " +
                "case extern return union " +
                "char float short unsigned " +
                "const for signed void " +
                "continue goto sizeof volatile " +
                "default if static while " +
                "do int struct _Packed " +
                "double ").split(" ");
        HashSet<String> operatorSet = new HashSet<>(Arrays.asList("[", "]", "+", "-", "%", "*", ";", ",", "/", "=", "<", ">", "++", "--", "<=", ">=", "==", "&&", "||", "^", "(", ")", "{", "}"));
        HashSet<String> keySet = new HashSet<>(Arrays.asList(keys));


        String s = sc.nextLine().trim();


        StringBuilder sb = new StringBuilder();

//        for (String str : s.split(" ")) {
//            sb.append(typeCheck(operatorSet, keySet, symbolTable, str));
//            sb.append(" ");
//        }

        StringBuilder sbr = new StringBuilder();
        for (int j = 0; j < s.length(); j++) {

            if (Character.isDigit(s.charAt(j)) || Character.isLetter(s.charAt(j))) {
                sbr.append(s.charAt(j));
            } else if (s.charAt(j) == ' ') {
                if (sbr.length() > 0) {
                    typeCheck(operatorSet, keySet, symbolTable, sbr.toString());
                    sbr = new StringBuilder();
                }
            } else {
                if (sbr.length() > 0) {
                    typeCheck(operatorSet, keySet, symbolTable, sbr.toString());
                    sbr = new StringBuilder();
                }
                if (s.charAt(j) == '+') {
                    if (j != s.length() - 1 && s.charAt(j + 1) == '+') {
                        typeCheck(operatorSet, keySet, symbolTable, "++");
                        j++;
                        continue;
                    }
                } else if (s.charAt(j) == '-') {
                    if (j != s.length() - 1 && s.charAt(j + 1) == '-') {
                        typeCheck(operatorSet, keySet, symbolTable, "--");
                        j++;
                        continue;
                    }
                } else if (s.charAt(j) == '/') {
                    if (j != s.length() - 1 && s.charAt(j + 1) == '/') {
//                        typeCheck(operatorSet, keySet, symbolTable, "//");
                        System.out.println("Single Line Comment ");
                        while (j != s.length() - 2 && !(s.charAt(j) == '*' && s.charAt(j + 1) == '/')) {
                            j++;
                            sb.append(s.charAt(j));

                        }
                        System.out.println(sb);
                        j++;
                        continue;
                    }
                    if (j != s.length() - 1 && s.charAt(j + 1) == '*') {
//                        typeCheck(operatorSet, keySet, symbolTable, "/*");
                        System.out.println("Multi Line Comment :");
                        while (j != s.length() - 2 && !(s.charAt(j) == '*' && s.charAt(j + 1) == '/')) {
                            j++;
                            sb.append(s.charAt(j));
                        }
                        System.out.println(sb);
                        j++;
                        continue;
                    }
                } else if (s.charAt(j) == '<') {
                    if (j != s.length() - 1 && s.charAt(j + 1) == '=') {
                        typeCheck(operatorSet, keySet, symbolTable, "<=");
                        j++;
                        continue;
                    }
                } else if (s.charAt(j) == '=') {
                    if (j != s.length() - 1 && s.charAt(j + 1) == '=') {
                        typeCheck(operatorSet, keySet, symbolTable, "==");

                        j++;
                        continue;
                    }
                } else if (s.charAt(j) == '>') {
                    if (j != s.length() - 1 && s.charAt(j + 1) == '=') {
                        typeCheck(operatorSet, keySet, symbolTable, ">=");
                        j++;
                        continue;
                    }
                }
                typeCheck(operatorSet, keySet, symbolTable, s.charAt(j) + "");
            }
        }
        if (sbr.length() > 0) {
            typeCheck(operatorSet, keySet, symbolTable, sbr.toString());
            sbr = new StringBuilder();
        }

        System.out.println("\n\n\nTotal num of TOKENS  :" + tokens);

    }

    public static String typeCheck(HashSet<String> operatorSet, HashSet<String> keySet, HashMap<Integer, String> symbolTable, String s) {
        tokens++;
        if (operatorSet.contains(s)) {
            System.out.println("operator : <" + s + ">");
            return "<" + s + ">";
        } else if (keySet.contains(s)) {
            System.out.println("keyword : <" + s + ">");
            return "<" + s + ">";
        } else {
            boolean x = false;
            try {
                double d = Double.parseDouble(s);
                x = true;
            } catch (NumberFormatException nfe) {
                x = false;
            }
            if (x) {
                System.out.println("Constant :<" + s + ">");
                return "<" + s + ">";
            } else if (Character.isDigit(s.charAt(0))) {
                System.out.println("Invalid Identifier :" + s);
                return "";
            } else {
                i++;
                System.out.println("Identifier : " + s + " <" + "id," + i + ">");
                symbolTable.put(i, s);
                return "<" + "id," + i + ">";
            }
        }
    }
}
