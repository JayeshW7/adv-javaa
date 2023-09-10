abstract class AnonymousInner
{ 
    public abstract void mymethod(); 
} 
public class Exc2 
{ 
    public static void main(String args[])
    { 
        System.out.println("Jayesh Wagh"); 
        AnonymousInner inner = new AnonymousInner(){ 
        public void mymethod()
        { 
            System.out.println("This is an example of anonymous inner class"); 
        } 
    };
    inner.mymethod(); 
    } 
}
