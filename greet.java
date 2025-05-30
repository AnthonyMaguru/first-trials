import java.util.*;
public class greet{
    public static void main(String[] args) {
        Scanner reply = new Scanner(System.in);
        String chosenlanguange;
        Greeting currentGreeting= null;
        String answer;

        System.out.println("which languange would you like to greeted in(ENGLISH,LATIN,LUNYANKOLE).");
        chosenlanguange = reply.nextLine().trim().toLowerCase();

        switch (chosenlanguange) {
            case "english":
            currentGreeting = new englishGreeting();                
                break;
                case "lunyankole":
                currentGreeting = new lunyankoleGreeting();
                break;
                case "latin":
                currentGreeting = new latinGreeting();
                break;        
            default:
            System.out.println("Sorry ,that languange is not supported. here is an English greeting:");
            currentGreeting = new englishGreeting();
                break;
        }
        if(currentGreeting!=null){
            currentGreeting.say();
            System.out.println("please reply in "+chosenlanguange+":");
            answer = reply.nextLine();
        }
        
        
        reply.close();

    }
}
interface Greeting{
    
    void say();
}
class englishGreeting implements Greeting{
    public void say(){
        System.out.println("hello! How r you...!!!!?");
        
    }
}
class lunyankoleGreeting implements Greeting{
    public void say(){
        System.out.println("Agandi!");
    }
}
class latinGreeting implements Greeting{
    public void say(){
        System.out.println("Commodo vales!");
    }
}
