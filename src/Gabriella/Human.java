package Gabriella;

abstract class Human {

    String name;
    String Chromosome;

    public abstract String getChromosome() ;

    @Override
    public String toString() {
        return "\nHuman{" +
                "name='" + name + '\'' +
                ", Chromosome='" + Chromosome + '\'' +
                '}';
    }
}
