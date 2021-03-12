package pl.paisley4.encrypter;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EncryptionData {

    private static final List<Character> a = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
    private static final List<Character> b = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm');
    private static final List<Character> c = Arrays.asList('n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

    public static char getRandomFromSection(char m){
        if(m=='a') return b.get(new Random().nextInt(b.size()));
        if(m=='b') return c.get(new Random().nextInt(c.size()));
        return '0';
    }

    public static int getPosition(char g){
        int i = 0;
        for(char m : b){
            if(m==g) return i;
            i++;
        }
        i = 0;
        for(char m : c){
            if(m==g) return i;
            i++;
        }
        return -1;
    }

    public static char getChar(int d, char e){
        if(b.contains(e)){
            return b.get(d);
        }
        if(c.contains(e)){
            return c.get(d);
        }
        return '0';
    }

    public static char getSection(char d){
        switch (d) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
                return 'a';
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                return 'b';
        }
        return '0';
    }

}
