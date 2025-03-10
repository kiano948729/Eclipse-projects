package oop1;
import java.util.ArrayList;

public class Prison 
{
    private ArrayList<Prisoner> prisoners; 

    public Prison() {
        prisoners = new ArrayList<>();
    }

    public void addPrisoner(String name, double height, int sentence) {
        Prisoner prisoner = new Prisoner(name, height, sentence);
        prisoners.add(prisoner);
    }

    public void showPrisoners() {
        if (prisoners.isEmpty()) {
            System.out.println("Er zijn geen gevangenen in de lijst.");
        } else {
            for (Prisoner p : prisoners) {
                System.out.println("Naam: " + p.getName());
                System.out.println("Hoogte: " + p.getHeight());
                System.out.println("Straf: " + p.getSentence() + " jaar");
                System.out.println("--------------------------");
            }
        }
    }
}
