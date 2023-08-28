package Block_letter_printer;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(blockPrint("Ana Maria Baby te amo"));
    }

    public static String blockPrint(String string) {
        if (string.equals("") || isSpacesComposed(string)) {
            return "";
        }
        string = stringClean(string);
        return charArt(string.toUpperCase().toCharArray());
    }

    public static boolean isSpacesComposed(String string) {
        int counter = 0, length = string.length();
        while (counter < length) {
            if (string.charAt(counter) != ' ')
                return false;
            counter++;
        }
        return true;
    }

    public static String stringClean(String string) {
        while (string.charAt(0) == ' ' || string.charAt(string.length() - 1) == ' ') {
            if (string.charAt(0) == ' ' && string.charAt(string.length() - 1) == ' ') {
                string = string.substring(1, string.length() - 1);
            }
            if (string.charAt(0) == ' ') {
                string = string.replaceFirst(" ", "");
            }
            if (string.charAt(string.length() - 1) == ' ') {
                string = string.substring(0, string.length() - 1);
            }
        }
        return string;
    }

    public static String charArt(char[] stringChars) {
        String representation = "";
        String[] lines = { "", "", "", "", "", "", "" }, tmpLine = {};
        Map<Character, String> alphabet = new HashMap<>();
        mapAlphabet(alphabet);
        for (char ch : stringChars) {
            representation = getRepresentation(alphabet, ch);
            tmpLine = representation.split("\n");
            if (tmpLine[0] == "     ") {
                lines[0] += tmpLine[0];
                lines[1] += tmpLine[0];
                lines[2] += tmpLine[0];
                lines[3] += tmpLine[0];
                lines[4] += tmpLine[0];
                lines[5] += tmpLine[0];
                lines[6] += tmpLine[0];
                continue;
            }
            lines[0] += tmpLine[0];
            lines[1] += tmpLine[1];
            lines[2] += tmpLine[2];
            lines[3] += tmpLine[3];
            lines[4] += tmpLine[4];
            lines[5] += tmpLine[5];
            lines[6] += tmpLine[6];
        }
        representation = lines[0] + "\n" + lines[1] + "\n" + lines[2] + "\n" + lines[3] + "\n" + lines[4] + "\n"
                + lines[5]
                + "\n" + lines[6];
        return representation;
    }

    public static void mapAlphabet(Map<Character, String> alphabet) {
        alphabet.put('A', " AAA  \nA   A \nA   A \nAAAAA \nA   A \nA   A \nA   A ");
        alphabet.put('B', "BBBB  \nB   B \nB   B \nBBBB  \nB   B \nB   B \nBBBB  ");
        alphabet.put('C', " CCC  \nC   C \nC     \nC     \nC     \nC   C \n CCC  ");
        alphabet.put('D', "DDDD  \nD   D \nD   D \nD   D \nD   D \nD   D \nDDDD  ");
        alphabet.put('E', "EEEEE \nE     \nE     \nEEEEE \nE     \nE     \nEEEEE ");
        alphabet.put('F', "FFFFF \nF     \nF     \nFFFFF \nF     \nF     \nF     ");
        alphabet.put('G', " GGG  \nG   G \nG     \nG GGG \nG   G \nG   G \n GGG  ");
        alphabet.put('H', "H   H \nH   H \nH   H \nHHHHH \nH   H \nH   H \nH   H ");
        alphabet.put('I', "IIIII \n  I   \n  I   \n  I   \n  I   \n  I   \nIIIII ");
        alphabet.put('J', "JJJJJ \n    J \n    J \n    J \n    J \n    J \nJJJJ  ");
        alphabet.put('K', "K   K \nK  K  \nK K   \nKK    \nK K   \nK  K  \nK   K ");
        alphabet.put('L', "L     \nL     \nL     \nL     \nL     \nL     \nLLLLL ");
        alphabet.put('M', "M   M \nMM MM \nM M M \nM   M \nM   M \nM   M \nM   M ");
        alphabet.put('N', "N   N \nNN  N \nN   N \nN N N \nN   N \nN  NN \nN   N ");
        alphabet.put('O', " OOO  \nO   O \nO   O \nO   O \nO   O \nO   O \n OOO  ");
        alphabet.put('P', "PPPP  \nP   P \nP   P \nPPPP  \nP     \nP     \nP     ");
        alphabet.put('Q', " QQQ  \nQ   Q \nQ   Q \nQ   Q \nQ Q Q \nQ  QQ \n QQQQ ");
        alphabet.put('R', "RRRR  \nR   R \nR   R \nRRRR  \nR R   \nR  R  \nR   R ");
        alphabet.put('S', " SSS  \nS   S \nS     \n SSS  \n    S \nS   S \n SSS  ");
        alphabet.put('T', "TTTTT \n  T   \n  T   \n  T   \n  T   \n  T   \n  T   ");
        alphabet.put('U', "U   U \nU   U \nU   U \nU   U \nU   U \nU   U \n UUU  ");
        alphabet.put('V', "V   V \nV   V \nV   V \nV   V \nV   V \n V V  \n  V   ");
        alphabet.put('W', "W   W \nW   W \nW   W \nW W W \nW W W \nW W W \n W W  ");
        alphabet.put('X', "X   X \nX   X \n X X  \n  X   \n X X  \nX   X \nX   X ");
        alphabet.put('Y', "Y   Y \nY   Y \n Y Y  \n  Y   \n  Y   \n  Y   \n  Y   ");
        alphabet.put('Z', "ZZZZZ \n    Z \n   Z  \n  Z   \n Z    \nZ     \nZZZZZ ");
        alphabet.put(' ', "     ");
    }

    public static String getRepresentation(Map<Character, String> alphabet, char key) {
        return alphabet.get(key);
    }
}
