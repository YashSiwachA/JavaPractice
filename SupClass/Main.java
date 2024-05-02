package SupClass;
class SuperClass{
    int age;
    String name;
    String instagram;
    SuperClass(int age , String name, String insta){
        this.age = age;
        this.name = name;
        this.instagram = insta;
    }
    public void getInsta(){
        System.out.println(instagram);
    }
    public void getAge(){
        System.out.println(age);
    }
    public void getName(){
        System.out.println(name);
    }
}
class SubClass extends SuperClass{

    SubClass(int age, String name, String insta) {
        super(age, name, insta);
    }

}
public class Main {
    public static void main(String[] args) {
        SuperClass sup = new SuperClass(18, "Yash", "@YashAryan");
        SubClass sub = new SubClass(18, "YashAryan", "@YashAestheticss");
        sup.getName();
        sup.getAge();
        sup.getInsta();
        sub.getName();
        sub.getAge();
        sub.getInsta();
    }
    
}
