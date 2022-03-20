package lesson9;

public class Animal {
    private String name;
    private int age;


    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public boolean equals(Object obj) {
//        this - объект у кторого вызван метод
//        obj - объект который вложен внутрь входящего параметра
//        obj = (Animal)obj;
//        if (this.age != obj.){
//
//        }
//    }


    @Override
    public boolean equals(Object o) {
        //this - объект у кторого вызван метод
        //o - объект который вложен внутрь входящего параметра
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        //тернарный оператор
        return name != null ? name.equals(animal.name) : animal.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
