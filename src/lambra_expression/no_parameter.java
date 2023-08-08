package lambra_expression;

interface Sayable{  
    public String say();  
}  
public class no_parameter{  
public static void main(String[] args) {  
    Sayable s=()->{  
        return "I have nothing to say.";  
    };  
    System.out.println(s.say());  
}  
}  