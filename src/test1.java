import java.util.ArrayList;
import java.util.Date;

/**
 * @author
 * @date 2020/4/14 - 10:30
 */
public class test1 {
    private int a;
    private String b;
    public static void main(String[] args) {
        ArrayList<String> ni = new ArrayList<String>();
        ni.add("小米");
        ni.add("xiaoming");
        ni.add("asd");
        //ifn
        if (ni == null) {

        }
        //inn
        if (ni != null) {

        }
        //in.fori--itar
        for (int i = 0; i < ni.size(); i++) {
            
        }

        //in.for--iter
        for (String s : ni) {
            System.out.println(s);
        }
        System.out.println(ni);
        
    }
}
