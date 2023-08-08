package lambra_expression;

interface monesh{  
    public String say(String name);  
}  
  
public class single_parameter{  
    public static void main(String[] args) {  
      
        // Lambda expression with single parameter.  
        monesh s1=(name)->{  
            return "Hello, "+name;  
        };  
        System.out.println(s1.say("Sonoo"));  
          
        // You can omit function parentheses    
        monesh s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Sonoo"));  
    }  
} 