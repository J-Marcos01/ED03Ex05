package controller;

public class Operacoes 
{
	public Operacoes() 
	{
		super();
	}
	
	public int nFibo(int n)
	{

		if(n<3)        //se n for 2 ou 1 retorna 1 pois a primeira e segunda posição do fibonacci é 1;
		{
			return 1 ;                              //recursiva ao contrario
		}                                        //if(num==1||num==2)
		else                                     //return 1;
		{                                        //else if (num<=n)
			                                     //return nFibo(num+1)+nFibo(num+2);
			return nFibo(n-1)+nFibo(n-2);  //
			
		}
	}
	
}
