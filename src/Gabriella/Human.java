package Gabriella;

abstract class Human {

    String name;
    String Chromosome;

    abstract public String getChromosome() ;

    @Override
    public String toString() {
        return "\nHuman{" +
                "name='" + name + '\'' +
                ", Chromosome='" + Chromosome + '\'' +
                '}';
    }
}
