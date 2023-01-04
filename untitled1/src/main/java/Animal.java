public class Animal {

     String name = "sagar";
     String color;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void run(){
        System.out.println("Animal is running");
    };
}
