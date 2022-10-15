public class App {
    public static void main(String[] args) {
        
        String original = "abcde FGHIJ ABC abc  DEFG  "; //Os espaços no final foram propositais
        
        String s01 = original.toLowerCase();                              // transformando todas em letras minúsculas
        String s02 = original.toUpperCase();                              // transformando todas em letras maisculas
        String s03 = original.trim();                                     // elimina os espaços nos cantos da String
        String s04 = original.substring(2);                   // elimina tudo que tiver antes da posição 2 - vai começar do "c" em diante
        String s05 = original.substring(2, 9);      // elimina tudo antes do 2 e vai no limite até o 9 (contando sempre do 0)
        String s06 = original.replace('a','x');         // vai localizar todos os "a" minúsculos e substituir por "x" minúsculo
        String s07 = original.replace("abc","xyz");  // vai localizar todos os "abc" e trocar por "xyz"

        int i = original.indexOf("bc");                             // vai localizar a primeira posição onde aparece "bc"
        int j = original.lastIndexOf("bc");                         // vai localizar a última posição onde aparece "bc"

        System.out.println("Original : -" + original + "-");            // traço no final apenas para mostrar onde termina a String

        System.out.println(".toLowerCase : -" + s01 + "-");
        System.out.println(".toUpperCase : -" + s02 + "-");
        System.out.println(".trim : -" + s03 + "-");
        System.out.println(".substring(2) : -" + s04 + "-");
        System.out.println(".substring(2,9) : -" + s05 + "-");
        System.out.println(".replace('a','x') : -" + s06 + "-");
        System.out.println(".replace('abc','xyz') : -" + s07 + "-");

        System.out.println(".indexOf(bc) : " + i);
        System.out.println(".lastIndexOf(bc) : " + j);

        /*
         * FUNÇÃO SPLIT
         * separando Strings
         */

        String s = "potato apple lemon";

        String[] vect = s.split(" "); // o espaço entre aspas " " define qual o separador das palavras

        String word1 = vect[0]; // word1 = "potato"
        String word2 = vect[1]; // word2 = "apple"
        String word3 = vect[2]; // word3 = "lemon"


        System.out.println(".split");
        System.out.println("PALAVRAS JUNTAS "+s);
        System.out.println("PRIMEIRA PALAVRA " + vect[0]);
        System.out.println("SEGUNDA PALAVRA " + vect[1]);
        System.out.println("TERCEIRA PALAVRA " + vect[2]);

    }
}
