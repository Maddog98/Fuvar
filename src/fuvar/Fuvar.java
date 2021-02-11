
package fuvar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Fuvar {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("fuvar.csv");
        List<String> sorok = Files.readAllLines(path);
        List<FuvarBont> fuvarok = new ArrayList<>();
        
        for (int i = 1; i < sorok.size(); i++) {
            fuvarok.add(new FuvarBont(sorok.get(i)));
        }
        System.out.println(fuvarok.size());
        
        
    }
    
}
