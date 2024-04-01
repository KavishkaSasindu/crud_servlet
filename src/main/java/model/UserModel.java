package model;

public class UserModel {
    private int id;
    private String username;
    private String job;
    private String email;
    private String age;

    public UserModel(){
        System.out.println("UserModel");
    }

    public UserModel(String username,String job,String age,String email){
        this.username = username;
        this.email = email;
        this.age = age;
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
