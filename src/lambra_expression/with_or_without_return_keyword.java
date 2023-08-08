package lambra_expression;

interface A1{  
    int add(int a,int b);  
}  
  
public class with_or_without_return_keyword {  
    public static void main(String[] args) {  
          
        // Lambda expression without return keyword.  
        A1 ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
          
        // Lambda expression with return keyword.    
        A1 ad2=(int a,int b)->{  
                            return (a+b);   
                            };  
        System.out.println(ad2.add(100,200));  
    }  
}  