public class Animal {

    private String typeAnimal;
    private String nameAnimal;


    public Animal() {
    }

    public Animal(String typeAnimal, String nameAnimal) {
        this.typeAnimal = typeAnimal;
        this.nameAnimal = nameAnimal;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "typeAnimal='" + typeAnimal + '\'' +
                ", nameAnimal='" + nameAnimal + '\'' +
                '}';
    }
}
