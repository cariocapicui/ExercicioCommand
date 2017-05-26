package br.edu.unifacisa.command.depois;


public class Queue<T>
{
	private int m_add;
	private int m_remove;
	private T[]m_array;
	
	public Queue()
	{
		m_add = m_remove = 0;
	}
	public final void enque(T c)
	{
		m_array[m_add] = c;
		m_add = (m_add + 1) % AnonymousEnum.SIZE;
	}
	public final T deque()
	{
		int temp = m_remove;
		m_remove = (m_remove + 1) % AnonymousEnum.SIZE;
		return m_array[temp];
	}
}