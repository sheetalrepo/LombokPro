package basics;

public class StaticConstructorTest {

	public static void main(String[] args) {
		StaticConstructor obj = StaticConstructor.of("albert", "will");
		System.out.println(obj.toString());
	}

}
