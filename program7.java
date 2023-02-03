import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

public class program7 {
    public static void main(String[] args) throws IOException{
        Vector vec=new Vector();
        vec.add("texas");
        vec.add("Zurich");
        vec.add("NewYork");
        
        
        Iterator pointer=vec.iterator();
        while(pointer.hasNext()) {
            System.out.println(pointer.next());
        }
    }
}