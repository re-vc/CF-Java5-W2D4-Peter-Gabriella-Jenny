package Gabriella;

public class Male extends Human {

    String name;
    String Chromosome;


    public Male(String name) {
        this.name = name;
        this.Chromosome = getChromosome();

    }

    public String getChromosome() {
        return "XY";
    }

    @Override
    public String toString() {
        return "\nMale{" +
                "name='" + name + '\'' +
                ", Chromosome='" + Chromosome + '\'' +
                '}';
    }
}
