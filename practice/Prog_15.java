package practice;

class hello{
    public hello(){
        System.out.println("Hello, I'm a constructor.");
    }
    public void hell(){
        System.out.println("Welcome to hell.");
    }
}
class bye extends hello{
    public bye(){
        System.out.println("Bye Bye Guys.");
    }
    @Override
    public void hell(){
        System.out.println("Bye Bye hell.");
    }
}
public class Prog_15 {
    public static void main(String[] args) {
        bye obj = new bye();
//        obj.hell();
        obj.hell();

    }
}
