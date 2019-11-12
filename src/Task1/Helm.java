package Task1;

public class Helm  {

     int diametr;
     String material;


    public Helm(Integer diametr, String material) {
        this.diametr = diametr;
        this.material = material;
    }

    public Integer getDiametr() {
        return diametr;
    }

    public void setDiametr(Integer diametr) {
        this.diametr = diametr;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    @Override
    public String toString() {
        return "Helm{" +
                "diametr=" + diametr +
                ", material='" + material + '\'' +
                '}';
    }
}
