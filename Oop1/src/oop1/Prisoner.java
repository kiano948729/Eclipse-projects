package oop1;
import java.util.Scanner;

public class Prisoner 
{
    public String name;
    public double height;
    public int sentence;
    
    public Prisoner(String name, double height, int sentence) {
	this.name = name; 
	this.height = height;
	this.sentence = sentence;
    }
    public void setPrisoner(String name, double height, int sentence) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }
    public String getName() {
	return name;
    }
    public double getHeight() {
	return height;
    }
    public int getSentence() {
	return sentence;
    }
    
    
}
