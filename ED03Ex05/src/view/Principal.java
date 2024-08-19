package view;

import controller.Operacoes;

public class Principal 
{

	public static void main(String[] args) 
	{
		Operacoes op = new Operacoes();
		
		int n=5;
		int res =op.nFibo(n);
		System.out.println(res);
	}

}
