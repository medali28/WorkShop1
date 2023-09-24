import java.util.ArrayList;
import java.util.List;
public class Zoo {
    private Animal[] animals;
    private int animalCount;
    private String name;
    private String city;
    private int nbrCages;


    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name=" + name + "\n" +
                ", city=" + city + "\n" +
                ", nbrCages=" + nbrCages +
                '}';
    }

    void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville du zoo : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }
     boolean isAnimalInZoo(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                return true;
            }
        }
        return false;
    }
     boolean addAnimal(Animal animal) {
        if (animalCount < nbrCages && !isAnimalInZoo(animal) ) {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] == null) {
                    animals[i] = animal;
                    animalCount++;
                    return true;
                }
            }
        }
        return false;
    }



    void displayAnimals() {
        System.out.println("Animaux dans le zoo:");
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println("Animal " + (i + 1) + ":");
                System.out.println(animals[i]);
                System.out.println();
            }
        }
    }

     boolean removeAnimal(Animal animalToRemove) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animalToRemove)) {
                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount - 1] = null;
                animalCount--;
                return true;
            }
        }
        return false;
    }


}
