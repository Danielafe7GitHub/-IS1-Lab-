package com.example.repositorio;

import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;//ascii
import com.example.dominio.Alumno;





public class AlumnoRepositorio{
	
	
	Alumno[] data = {
		new Alumno("Juan", "Perez", 16),
		new Alumno("Maria", "Castro", 14),
		new Alumno("Jose", "Ruiz", 18),
		new Alumno("Ana", "Perez", 13),
		new Alumno("Daniela", "Milon", 16),
		new Alumno("Zain", "Malik", 17),
		new Alumno("Quenin", "Tarantino", 15),
		new Alumno("Aurelia", "Pike", 12),
		new Alumno("Luke", "Skywalker", 7),
		new Alumno("Luka", "Skywalker", 8),
		new Alumno("Luki", "Skywalker", 9),
		new Alumno("Luke", "Skywalker", 10),
		new Alumno("Lukess", "Skywalker", 17),
		
	};
	
	



	public List<Alumno> listar() {
				
		return Arrays.asList(data);
	}
	
	public List<Alumno> listar_paterno(int operador) {
		
		System.out.println ("El número de elementos en el array misNombres es de " + data.length );
		 
		int i, j, first; 
		Alumno temp;
	    for ( i = data.length - 1; i > 0; i--) 
	    {
	    	first = 0;   
	        for(j = 1; j <= i; j ++)   
	        {			        	
	        	if( data[ j ].apellidoPaterno.compareTo(data[ first ].apellidoPaterno) > 0)      
	        		first = j;
	        }
	        temp = data[ first ];   
	        data[ first ] = data[ i ];
	        data[ i ] = temp; 
	    }           

	   
	    if (operador==0)
			return Arrays.asList(data);
		else
		{
			invArray();
			return Arrays.asList(data);
		}
	}
	public List<Alumno> listar_nombre(int operador ) {
				
		int i, j, first; 
		Alumno temp;
	    for ( i = data.length - 1; i > 0; i--) 
	    {
	    	first = 0;   
	        for(j = 1; j <= i; j ++)   
	        {			        	
	        	if( data[ j ].nombres.compareTo(data[ first ].nombres) > 0)   
	        		first = j;
	        }
	        temp = data[ first ];   
	        data[ first ] = data[ i ];
	        data[ i ] = temp; 
	    }      
	    
	    if (operador==0)
			return Arrays.asList(data);
		else
		{
			invArray();
			return Arrays.asList(data);
		}

		
	}
	public List<Alumno> listar_nota(int operador) {
		
		
		
		QuickSort(0,data.length-1);
		if (operador==0)
			return Arrays.asList(data);
		else
		{
			invArray();
			return Arrays.asList(data);
		}
			
		
		
	}
	
	



	public int Partition(int p,int r)
	{    
	    int x=data[r].promedio;
	    int i=p-1;
	    for(int j=p;j<r;j++)
	    {                
	        if(data[j].promedio<=x)
	        {
	            i++;
	            Alumno aux=data[i];
	            data[i]=data[j];
	            data[j]=aux;
	        }
	    }
	    Alumno aux=data[i+1];
	    data[i+1]=data[r];
	    data[r]=aux;
	    return i+1;

	}
	public void QuickSort(int p,int r)
	{
	    if(p<r)
	    {		        
	        int q=Partition(p,r);		        
	        QuickSort(p,q-1);
	        QuickSort(q+1,r);
	    }
	}

	public void invArray() {
	    Alumno aux;
	    for (int i = 0; i < data.length / 2; i++) {
	        aux = data[i];
	        data[i] = data[data.length - 1 - i];
	        data[data.length - 1 - i] = aux;
	    }	 
	    
	}


}
	
	
	
	
	
	

