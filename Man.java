// DZ3
package HomeWork.DZ3;

public abstract class Man {
    public String name;
    public String surname;
    public Integer age;

    public Man(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void Say(){
        System.out.println("Я говорю");
    }
    public void Go(){
        System.out.println("Я иду");
    }
    public void Drink(){
        System.out.println("Я пью");
    }
    public void Eat(){
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        String year = " лет.";
        if (this.age % 10 == 1 && this.age != 11) {year = " год.";}
        else if (this.age % 10 > 1 && this.age % 10 < 5) {year = " года.";}

        return "Привет! Меня зовут " + this.getName() + " " + this.getSurname() + ", мне " + this.getAge() + year;
    }

}
