public class Die
{
	private final int HIGHEST_DIE_VALUE = 6;
	private final int LOWEST_DIE_VALUE = 1;
	private int dieValue;
	public Die()
	{
		dieValue = (int) (Math.random() * HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
	}
	public int getDieValue()
	{
		return dieValue;
	}
}