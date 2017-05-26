package br.edu.unifacisa.command.depois;

import java.util.LinkedList;

public class Main {
	
	public static void main(String[] args) 
	{
		LinkedList que = new LinkedList();
		  Giant[] input = enque.Type;
		  Giant bad_guy;

		  for (int i = 0; i < 6; i++)
		  {
			que.enque(input[i]);
		  }

		  for (int i = 0; i < 6; i++)
		  {
			bad_guy = que.deque();
			if (bad_guy.get_type() == Giant.Type.Fee)
			{
			  bad_guy.fee();
			}
			else if (bad_guy.get_type() == Giant.Type.Phi)
			{
			  bad_guy.phi();
			}
			else if (bad_guy.get_type() == Giant.Type.Pheaux)
			{
			  bad_guy.pheaux();
			}
		  }
		  System.out.print('\n');
		}
	

	}
