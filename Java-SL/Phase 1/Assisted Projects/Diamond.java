package Diamond;

interface show  
{  
public default void display()   
{  
System.out.println("First invoked");  
}  
}  
interface write 
{  
public default void display()   
{  
System.out.println("Second invoked");  
}  
}  
public class Diamond implements show, write
{  
public void display()   
{  
show.super.display();  
write.super.display();  
}  
public static void main(String args[])   
{  
Diamond obj = new Diamond();  
obj.display();  
}  
}  