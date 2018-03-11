package es.studium.contadornumeros;

import java.util.Random;
public class contadornumeros
{
	static Random rnd=new Random();
	//estoy cambiando algo//
	public static void main(String[] args)
	{
		int veces;
		int contador=0;
		veces = rnd.nextInt(100)+1;
		for(int i = 0; i<veces;i++)
		{
			contador = 0;
			System.out.println(rnd.nextInt(50));
			contador++;
		}
		System.out.println("Se han generado "+contador+" números aleatorios");
	}

}
