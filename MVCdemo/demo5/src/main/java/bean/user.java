package bean;

public class user {
    private  Integer id;
    private  String name;
    private  String password;
    private  String age;
    private  String sex;

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public user(){

    }
  public user(Integer id,String name,String password,String sex,String age){
        this.age=age;
        this.id=id;
        this.name=name;
        this.sex=sex;
        this.password=password;
  }
}

