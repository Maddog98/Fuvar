
package fuvar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class FuvarProgram {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("fuvar.csv");
        List<String> sorok = Files.readAllLines(path);
        List<Fuvar> fuvarok = new ArrayList<>();
        
        for (int i = 1; i < sorok.size(); i++) {
            fuvarok.add(new Fuvar(sorok.get(i)));
        }
        System.out.println("3. feladat: "+fuvarok.size()+" fuvar");
        
        int maxfuvar=0;
        for (int i = 1; i < sorok.size(); i++) {
            if (sorok.get(i)>maxfuvar) {
                maxfuvar=sorok.get(i);
            }
        }
        
        
        System.out.println("4. feladat:");
        
        
    }
    
}
