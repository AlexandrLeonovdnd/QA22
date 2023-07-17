package Lesson5.Work2;

public class HDD {
    String nameHdd, type;
    int volumeHdd;
    public HDD() {
    }

    public HDD(String nameHdd, String type, int volumeHdd) {
        this.nameHdd = nameHdd;
        this.type = type;
        this.volumeHdd = volumeHdd;

    }
    public void print(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "HDD{" +
                "nameHdd='" + nameHdd + '\'' +
                ", type='" + type + '\'' +
                ", volumeHdd=" + volumeHdd +
                '}';
    }
}