package Exerc017;

public class Person {
    private String name;
    private Double firstNote;
    private Double secondNote;

    public Person() {
    }

    public Person(String name, Double firstNote, Double secondNote) {
        this.name = name;
        this.firstNote = firstNote;
        this.secondNote = secondNote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFirstNote() {
        return firstNote;
    }

    public void setFirstNote(Double firstNote) {
        this.firstNote = firstNote;
    }

    public Double getSecondNote() {
        return secondNote;
    }

    public void setSecondNote(Double secondNote) {
        this.secondNote = secondNote;
    }
}
