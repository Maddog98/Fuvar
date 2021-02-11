
package fuvar;

public class FuvarBont {
    private int taxi_id;
    private String indulas;
    private double tavolsag;
    private int viteldij;
    private double borravalo;
    private String fizetes_modja;

    
 //   

    public FuvarBont(String sor) {
        String []s = sor.split(";");
        this.taxi_id = Integer.parseInt(s[0]);
        this.indulas = s[1];
        this.tavolsag = Double.parseDouble(s[2]);
        this.viteldij = Integer.parseInt(s[3]);
        this.borravalo = Double.parseDouble(s[4]);
        this.fizetes_modja = s[5];
    }
 
    

    public int getTaxi_id() {
        return taxi_id;
    }

    public String getIndulas() {
        return indulas;
    }

    public double getTavolsag() {
        return tavolsag;
    }

    public int getViteldij() {
        return viteldij;
    }

    public double getBorravalo() {
        return borravalo;
    }

    public String getFizetes_modja() {
        return fizetes_modja;
    }



    @Override
    public String toString() {
        return "FuvarBont{" + "taxi_id=" + taxi_id + ", indulas=" + indulas + ", tavolsag=" + tavolsag + ", viteldij=" + viteldij + ", borravalo=" + borravalo + ", fizetes_modja=" + fizetes_modja + '}';
    }
    
}
