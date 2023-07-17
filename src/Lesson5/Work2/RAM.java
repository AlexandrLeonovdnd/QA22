package Lesson5.Work2;

public class RAM {
    String nameRam;
    int volumeRam;
    public RAM() {
    }
    public RAM(String nameRam, int volumeRam) {
        this.nameRam = nameRam;
        this.volumeRam = volumeRam;

    }
    public void print(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "RAM{" +
                "nameRam='" + nameRam + '\'' +
                ", volumeRam=" + volumeRam +
                '}';
    }
}