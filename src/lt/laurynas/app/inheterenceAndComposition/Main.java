package lt.laurynas.app.inheterenceAndComposition;

public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals("Pufas");
        System.out.println(animals);


        Domestic cat = new Domestic();
        cat.setBread("Persian");
        System.out.println(cat);

        Wild wolf = new Wild();
        wolf.setDangerLevel(5);
        System.out.println(wolf);

    }
}

class Animals {
    public String name;

    public Animals() {

    }

    public Animals(String name){
        this.name = name;
    }



    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "name:'" + name + '\'' +
                '}';
    }
}

class Domestic extends Animals{
    private String bread;

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    @Override
    public String toString() {
        return "{" +
                "bread='" + bread + '\'' +
                '}';
    }
}

class Wild extends Animals{
    private int dangerLevel;

    public int getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(int dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    @Override
    public String toString() {
        return "{" +
                "dangerLevel='" + dangerLevel + '\'' +
                '}';
    }
}


