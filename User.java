// DZ3
package HomeWork.DZ3;

public class User extends Man implements Loginable {
    private String login;
    private String password;
    private String company;
    public User(String name, String surname, Integer age, String login, String password, String company) {
        super(name, surname, age);
        this.login = login;
        this.password = password;
        this.company = company;

    }

    @Override
    public void login() {
        System.out.println("Авторизация с логином " + login + " с паролем " + password);
    }
    @Override
    public void Say(){
        System.out.println("Я работаю в " + company);
    }
}
