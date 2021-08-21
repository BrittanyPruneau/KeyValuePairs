package keyValue;

/**
 * Demonstrates how to initialize and use a generic class that implements the Interface Comparable<>. 
 * Inherits from Comparable in order to compare keys of key value pairs. 
 * 
 * @author Brittany Pruneau 
 *
 */
public class KeyValuePair<K extends Comparable<K>, V> implements Comparable<KeyValuePair<K,V>>
{
	private K key;
	private V value;

	/**
	 * 
	 * @param key 	Defines a specific code which is paired to only one value. 
	 * @param value	Defines a value, of any type, which is paired with only one key. 
	 */
	public KeyValuePair(K key, V value)
	{
		this.key = key;
		this.value = value;
	}

	/**
	 * Returns the key that paired with a specified value. 
	 */
	public K getKey()
	{
		return key;
	}

	/**
	 * Returns the value that is paired with a specified value. 
	 */
	public V getValue()
	{
		return value;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeyValuePair other = (KeyValuePair) obj;
		if (key == null)
		{
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value == null)
		{
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	/*
	 * Prints (key, value)
	 */
	@Override
	public String toString()
	{
		return "(" + key + ", " + value + ")";
	}

	/*
	 * Compares two keys and returns which key is greater than the other. 
	 */
	@Override
	public int compareTo(KeyValuePair<K, V> o)
	{
		return this.key.compareTo(o.key);
	}

}
