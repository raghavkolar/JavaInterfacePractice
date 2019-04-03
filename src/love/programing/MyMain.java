package love.programing;

public class MyMain {

    public static void main(String[] args) {

        HumanResourceAgrement google= new GoogleHumanResource();
        HumanResourceAgrement amazon = new AmazonHumanResource();

        google.applyForSocialSecurity();
        amazon.applyForSocialSecurity();
    }
}
