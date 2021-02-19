package fuvar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FuvarProgram {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("fuvar.csv");
        List<String> sorok = Files.readAllLines(path);
        List<Fuvar> fuvarok = new ArrayList<>();

        //3. feladat
        for (int i = 1; i < sorok.size(); i++) {
            fuvarok.add(new Fuvar(sorok.get(i)));
        }
        System.out.println("3. feladat: " + fuvarok.size() + " fuvar");

        //4. feladat
        double bevetel = 0.0;
        for (int i = 1; i < fuvarok.size(); i++) {
            if (fuvarok.get(i).getTaxi_id() == 6185) {
                bevetel += fuvarok.get(i).getViteldij();
            }
        }

        System.out.println("4. feladat: 4 fuvar alatt: " + bevetel + " $");

        //5. feladat:
        HashMap<String, Integer> fizetesM = new HashMap<>();
        for (Fuvar fuvar : fuvarok) {
            String kulcs = fuvar.getFizetes_modja();
            if (fizetesM.containsKey(kulcs)) {
                int ertek = fizetesM.get(kulcs);
                ertek++;
                fizetesM.put(kulcs, ertek);
            } else {
                fizetesM.put(kulcs, 1);
            }
        }
        //System.out.printf("5.feladat:\n",fizetesM);
        //System.out.println("5.feladat:"+fizetesM);
        for (Map.Entry<String, Integer> entry : fizetesM.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.printf("%15s : %d fuvar\n",key,value);
        }
        //6. feladat:
        double osszzMerfold = 0;
        for (int i = 0; i < fuvarok.size(); i++) {
            osszzMerfold = osszzMerfold + fuvarok.get(i).getTavolsag();
        }
        double osszKm = osszzMerfold * 1.6;
        System.out.printf("6. feladat : %.2f km\n", osszKm);

        
        //7. feladat:
        System.out.println("7. feladat:");
        Fuvar leghosszabbFuvar=fuvarok.get(0);
        for (Fuvar aktualistanVizsgaltFuvar : fuvarok) {
            if (aktualistanVizsgaltFuvar.getIdotartam()>leghosszabbFuvar.getIdotartam()) {
                leghosszabbFuvar=aktualistanVizsgaltFuvar;
            }
        }
        int ido= leghosszabbFuvar.getIdotartam();
        int azon=leghosszabbFuvar.getTaxi_id();
        double tavolsag=leghosszabbFuvar.getTavolsag();
        double vitelDij=leghosszabbFuvar.getViteldij();
        System.out.printf("Fuvar hossza: %d másodperc\n Taxi azonósító: %d\n Megtett távolság: %.1f km\n Viteldíj %.2f $\n",ido,azon,tavolsag,vitelDij);
        
        System.out.println("8. feladat:");
        String kimenet = "nincs hiba";
        Files.write(Paths.get("hiba.txt"), kimenet.getBytes());

    }

}
