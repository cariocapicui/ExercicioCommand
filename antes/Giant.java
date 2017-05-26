package br.edu.unifacisa.command.antes;

public class Giant
{
	private Type m_type;
	private int m_id;
	private static int s_next = 0;

		public enum Type
		{
			Fee,
			Phi,
			Pheaux;

			public static final int SIZE = java.lang.Integer.SIZE;

			public int getValue()
			{
				return this.ordinal();
			}

			public static Type forValue(int value)
			{
				return values()[value];
			}
		}
		public Giant(int m_id, Type m_type)
		{
			this.m_id = m_id;
			this.m_type = m_type;
		}
		public Type getType()
		{
			return m_type;
		}
		
		public final void fee()
		{
			System.out.print(m_id);
			System.out.print("-fee  ");
		}
		
		public final void phi()
		{
			System.out.print(m_id);
			System.out.print("-phi  ");
		}
		
		public final void pheaux()
		{
			System.out.print(m_id);
			System.out.print("-pheaux  ");
		}
	}


	

