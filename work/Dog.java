package work;

public class Dog extends Pet {
	private String kind;

	public Dog(String name, String sex, int age, String kind) {
		super(name, sex, age);
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public void eat() {

	}

	@Override
	public void howl() {

	}

	@Override
	public void show() {
		System.out.println(this.toString());
	}

	@Override
	public void run() {

	}

	public void dealer() {

	}

	@Override
	public String toString() {
		return "Dog [kind=" + kind + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

}
