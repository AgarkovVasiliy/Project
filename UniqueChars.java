package arraysAndString;

/*Реализуте алгоритм определяющий все ли символы в строке встречаються один раз.
 * При построение алгоритма нельзя использовать дополнительные структуры данных
 * Оценка времени выполнения этого кода равна O(n), где n - длинна строки, оценка требуемого пространства O(1)*/

public class UniqueChars {

	public boolean isUniqueChar(String str) {
		if (str.length() > 256)
			return false;

		int check = 0;
		for (int i = 0; i < str.length(); i++) {
			int value = str.charAt(i) - 'a';
			if ((check & (1 << value)) > 0) {
				return false;
			}
			check |= (1 << value);
		}
		return true;
	}

	public boolean isUniqueChar2(String str) {
		if (str.length() > 256)
			return false;

		boolean[] charSet = new boolean[256];

		for (int i = 0; i < str.length(); i++) {
			int value = str.charAt(i);
			if (charSet[value]) {
				return false;
			}
			charSet[value] = true;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new UniqueChars().isUniqueChar2("asda"));
		System.out.println(new UniqueChars().isUniqueChar("asd"));
	}

}
