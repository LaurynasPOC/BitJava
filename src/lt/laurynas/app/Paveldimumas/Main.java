package lt.laurynas.app.Paveldimumas;

public class Main {
    public static void main(String[] args) {
        Animals a1 = new Animals("Beer");
        Mammals a2 = new Mammals("Fox", false, true);
        IsDangerous a3 = new IsDangerous("Dog", true, false, 2);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);


        Job n1 = new Job(1200, "Manager",125462 );
        Employees em1 = new Employees(n1);
        System.out.println(em1);

    }
}

class Animals {
    private String species;

    public Animals(){
    }

    public Animals(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "species='" + species + '\'' +
                '}';
    }
}

class Mammals extends Animals {
    private boolean domestic;
    private boolean wild;


    public Mammals(String species, boolean domestic, boolean wild) {
        super(species);
        this.domestic = domestic;
        this.wild = wild;
    }

    public void setDomestic(boolean domestic) {
        this.domestic = true;
    }

    public boolean isDomestic() {
        return domestic;
    }

    public boolean isWild() {
        return wild;
    }

    public void setWild(boolean wild) {
        this.wild = true;
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "domestic=" + domestic +
                ", wild=" + wild + super.toString() +
                '}';
    }
}

class IsDangerous extends Mammals {
    private int dangerLevel;

    public IsDangerous(String species, boolean domestic, boolean wild, int dangerLevel) {
        super(species, domestic, wild);
        this.dangerLevel = dangerLevel;
    }

    public int getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(int dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    @Override
    public String toString() {
        return "IsDangerous{" +
                "dangerLevel=" + dangerLevel + super.toString()+
                '}';
    }
}

class Job {
    private int salary;
    private String position;
    private int id;

    public Job(int salary, String position, int id) {
        this.salary = salary;
        this.position = position;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Job{" +
                "salary=" + salary +
                ", position='" + position + '\'' +
                ", id=" + id +
                '}';
    }
}

class Employees {
    private Job job;

    public Employees(){

    }

    public Employees(Job job) {
        this.job = job;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "job=" + job +
                '}';
    }
}
