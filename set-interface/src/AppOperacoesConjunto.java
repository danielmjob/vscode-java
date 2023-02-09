import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class AppOperacoesConjunto {
    public static void main(String[] args) {
        
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        System.out.println("COJUNTO A " + a);
        System.out.println("CONJUNTO B " + b);

        System.out.println();

        //união
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println("União " + c);

        //interseção
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.err.println("Interseção " + d);

        //diferença
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.err.println("Diferença A-B" + e);

        Set<Integer> f = new TreeSet<>(b);
        f.removeAll(a);
        System.err.println("Diferença B-A" + f);
    }
}
