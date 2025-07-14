// Werewolf.java
public class Werewolf extends Mutant implements Animal, Human {
    public boolean isHumanForm;

    public Werewolf() {
        this.isHumanForm = true;
    }

    public void transform() {
        isHumanForm = !isHumanForm;
        if (isHumanForm) {
            System.out.println("Transformed into a human.");
        } else {
            System.out.println("Transformed into a wolf.");
        }
    }

    @Override
    public String sound() {
        if (isHumanForm) {
            return "No sound in human form.";
        } else {
            return "Howl!";
        }
    }

    @Override
    public String speak() {
        if (isHumanForm) {
            return "I am a human.";
        } else {
            return "I cannot speak in wolf form.";
        }
    }
}