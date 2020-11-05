package Peter.A1and2;

public abstract class Human{

    public String name;
    public String Chromosome;

    public Human(){
        this.name = "Human";
    }
    public Human(String name){
        this.name = name;
    }

    public abstract String getChromosomes();

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", Chromosome='" + Chromosome + '\'' +
                '}';
    }
}

class Male extends Human{
    public Male(String name){
        this.name = name;
        this.Chromosome = getChromosomes();
    }
    public String getChromosomes(){
        return ("XY");
    }
}
class Female extends Human{
    public Female(String name){
        this.name = name;
        this.Chromosome = getChromosomes();
    }
    public String getChromosomes(){
        return ("XX");
    }
}

