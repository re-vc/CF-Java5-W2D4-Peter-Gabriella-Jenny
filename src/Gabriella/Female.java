package Gabriella;

public class Female extends Human{

    String name;
    String Chromosome;


    public Female(String name, int age) {
        this.name = name;
        this.Chromosome = getChromosome();

    }

    public String getChromosome() {
        return "XX";
    }

    @Override
    public String toString() {
        return "\nFemale{" +
                "name='" + name + '\'' +
                ", Chromosome='" + Chromosome + '\'' +
                '}';
    }
}
