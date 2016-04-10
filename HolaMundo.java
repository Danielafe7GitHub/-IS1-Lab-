
public class HolaMundo {
	public static void main(String[] args) throws Exception 
	{
        System.out.println("Hello, World!");
        Pila<Integer>p=new Pila<Integer>();
        p.push(1);
        p.push(881);
        p.push(91);
        p.push(16);
        p.imprimir();
        p.pop();
        p.pop();
        p.imprimir();
    }

}
