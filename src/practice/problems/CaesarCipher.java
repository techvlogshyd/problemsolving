package practice.problems;

public class CaesarCipher {
    public static String caesarCipher(String s, int k) {
        if(k>26){
            k=k%26;
        }
        else if(k<0){
            k=(k%26)+26;
        }
        String cipherText="";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))){
                if(Character.isLowerCase(s.charAt(i))){
                    if ((char)(s.charAt(i)+k)>'z') {
                        char ch=(char)((char)(s.charAt(i))-(26-k));
                        cipherText+=ch;
                    } else {
                        cipherText+=(char)(s.charAt(i)+k);
                    }
                }
                else if(Character.isUpperCase(s.charAt(i))){
                    if ((char)(s.charAt(i)+k)>'Z') {
                        char ch=(char)((char)(s.charAt(i))-(26-k));
                        cipherText+=ch;
                    } else {
                        cipherText+=(char)(s.charAt(i)+k);
                    }
                }
            }
            else{
                cipherText+=s.charAt(i);
            }

        }
        return cipherText;
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("middle-Outz",2));
    }
}
