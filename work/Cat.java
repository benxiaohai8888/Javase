package work;

public class Cat extends Pet {
	private int love;

	public Cat(String name, String sex, int age, int love) {
		super(name, sex, age);
		this.love = love;
	}

	public void setLove(int love) {
		if (love < 0 || love > 100) {
			this.love = 20;
		} else
			this.love = love;
	}

	public int getLove() {
		return love;
	}

	public static void main(String[] args) {

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

	public void actingCute() {

	}

	@Override
	public String toString() {
		return "Cat [love=" + love + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

}
