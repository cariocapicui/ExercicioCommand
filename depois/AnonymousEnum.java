package br.edu.unifacisa.command.depois;


public class AnonymousEnum {

	public static final int SIZE = 8;
	private int intValue;

	private int m_add;
	private int m_remove;
	private static java.util.HashMap<Integer, AnonymousEnum> mappings;

	private static java.util.HashMap<Integer, AnonymousEnum> getMappings()
	{
		if (mappings == null)
		{
			synchronized (AnonymousEnum.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Integer, AnonymousEnum>();
				}
			}
		}
		return mappings;
	}

	private AnonymousEnum(int value)
	{
		intValue = value;
		getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static AnonymousEnum forValue(int value)
	{
		return getMappings().get(value);
	}


}

	




