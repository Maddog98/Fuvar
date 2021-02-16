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
        System.out.println("3. feladat: " + fuvarok.size() + " fuvar");

        double bevetel = 0.0;

        for (int i = 1; i < fuvarok.size(); i++) {
            if (fuvarok.get(i).getTaxi_id() == 6185) {
                bevetel += fuvarok.get(i).getBorravalo();
            }
        }

        System.out.println("4. feladat: 4 fuvar alatt: " + bevetel + " $");

        System.out.println("5. feladat");

        double osszzMerfold = 0;
        System.out.println("6. feladat:");
        for (int i = 0; i < fuvarok.size(); i++) {
            osszzMerfold = osszzMerfold + fuvarok.get(i).getTavolsag();
        }
        double osszKm = osszzMerfold * 1.6;
        System.out.printf("6. feladat : %.2f ",osszKm);
        
        String kimenet="nincs hiba";
        Files.write(Paths.get("hiba.txt"), kimenet.getBytes());

    }

}
