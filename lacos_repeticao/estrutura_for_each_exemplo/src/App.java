public class App {
    public static void main(String[] args) throws Exception {
        
        String[] vect = new String[]{"DANIEL", "VANESSA", "JOHN"};

        //estrurura FOR 

        System.out.println("FEITO COM ESTRUTURA FOR");
        for(int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }

        //estrutura FOR EACH

        System.out.println("FEITO COM ESTRUTURA FOR EACH");
        // para cada  obj contido no vetor vect faça {...}
        for (String obj : vect) {
            System.out.println(obj);
            
        }
        

    }
}
