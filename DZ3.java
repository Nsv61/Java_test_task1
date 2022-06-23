package HomeWork.DZ3;

public class DZ3 {
    public static void main(String[] args) {
        User user1 = new User("Денис", "Растегаев", 42, "Drastegaev", "sdfsdfjk756", "ООО ПТ");
        user1.Say();
        user1.Go();
        user1.Drink();
        user1.Eat();
        System.out.println(user1.toString());
        user1.login();


        User user2 = new User("Ivan", "Petrov", 19, "IvanPetrov", "qwerty", "Рога и копыта");
        System.out.println(user2.toString());
        user2.login();
    }
}
