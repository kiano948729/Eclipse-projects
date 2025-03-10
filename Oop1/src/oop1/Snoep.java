package oop1;

import java.util.Random;

class Snoep {
    public String[] snoepen = {"Aardbei", "Choco", "Madness"};

    public String getRandomSnoep() {
        Random random = new Random();
        return snoepen[random.nextInt(snoepen.length)];
    }

    public String[] getSnoepen() {
        return snoepen;
    }

    public boolean isGeldigeKeuze(String keuze) {
        for (String idx : snoepen) {
            if (idx.equalsIgnoreCase(keuze)) {
                return true;
            }
        }
        return false;
    }
}
	