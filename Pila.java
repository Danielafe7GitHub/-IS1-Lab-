
public class Pila<T>
{
	private T[] elems;
	private int position =-1;

	public 	Pila()
	{
		this(100);
	}

	public 	Pila(int size)
	{
		//elems=new Integer[size];
		elems=(T[]) new Object[size];
	}
	
	public T pop() throws Exception
	{
		if(position<0)
		{ 
			throw new Exception("UnderFlow");
		}
		return elems[position--];
	}

	/*public void push (Integer elem)
	{
		elems[++position]=elem;
	}*/
	
	public void push (T elem) throws Exception
	{
		if(position> elems.length-1)
		{
			throw new Exception("Overflow");
		}
		elems[++position]=elem;
	}
	
	public void imprimir () throws Exception
	{
		for(int i=0;i<4;i++)
		{
			System.out.println(elems[i]);
		}
	}
	
	

	
}