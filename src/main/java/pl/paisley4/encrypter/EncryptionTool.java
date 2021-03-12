package pl.paisley4.encrypter;

public class EncryptionTool {

    public static String a(String string){
        if(string==null||string=="") return string;
        String fake = "";
        int i = 0;
        for(char a : string.toCharArray()){
            fake+=EncryptionData.getRandomFromSection(EncryptionData.getSection(a));
            if(i==0||i==1){
                fake+=EncryptionData.getChar(EncryptionData.getPosition(a), 'a');
                i++;
            }else
            if(i==2||i==3){
                fake+=EncryptionData.getChar(EncryptionData.getPosition(a), 'b');
                i++;
                if(i==4) i = 0;
            }
        }
        return fake;
    }

    public static String b(String string){
        if(string==null||string=="") return string;
        String real = "";
        char[] m = string.toCharArray();
        for(int i = 0; i<string.toCharArray().length; i+=2){
            char a = m[i];
            char b = m[i+1];
            real+=EncryptionData.getChar(EncryptionData.getPosition(b), a);
        }
        return real;
    }

}
