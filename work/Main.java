package work;

import java.util.Scanner;

public class Main {
	// 键盘输入
	static Scanner sc = new Scanner(System.in);
	PetShop petShop = new PetShop("老王");

	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}

	// 开始方法
	private void start() {
		while (true) {
			System.out.println(petShop.getName() + "说：你是要买宠物（1）？还是要出售宠物（2）？查看所有宠物（3）？还是随便看看然后离开（0）？");
			int choise = sc.nextInt();
			switch (choise) {
			case 1:
				this.buyPetView();
				break;
			case 2:
				this.purchasePetView();
				break;
			case 3:
				petShop.showPets();
				break;

			default:
				System.out.println("再见...");
				return;
			}
		}

	}

	// 收购宠物
	private void purchasePetView() {
		int choise = inputInt("你的宠物是？狗（1），猫（2）");
		switch (choise) {
		case 1:
			purchaseDogView();
			break;
		case 2:
			purchaseCatView();
			break;

		default:
			break;
		}
	}

	// 收购猫
	private void purchaseCatView() {
		// 1. 你的猫咪和主人的亲密度为多少？(0-100)
		// 2. 是什么性别的猫？
		// 3. 猫年龄多大？
		// 4. 猫取什么名字？
		int love = inputInt("你的猫咪和主人的亲密度为多少？(0-100)");
		String sex = inputStr("是什么性别的猫？");
		int age = inputInt("猫年龄多大？");
		String name = inputStr("猫取什么名字？");
		Cat cat = new Cat(name, sex, age, love);
		boolean purchasePet = petShop.purchasePet(cat);
		System.out.println(purchasePet ? "收购成功！" : "收购失败！");
	}

	// 收购狗
	private void purchaseDogView() {
		// 1. 是什么品种的狗？
		// 2. 是什么性别的狗？
		// 3. 狗的年龄多大？
		// 4. 狗取什么名字？
		String kind = inputStr("是什么品种的狗？");
		String sex = inputStr("是什么性别的狗？");
		String name = inputStr("狗取什么名字？");
		int age = inputInt("狗的年龄多大？");
		Dog dog = new Dog(name, sex, age, kind);
		boolean purchasePet = petShop.purchasePet(dog);
		System.out.println(purchasePet ? "收购成功！" : "收购失败！");
	}

	// 购买宠物
	private void buyPetView() {
		switch (inputInt("需要买什么宠物？狗（1），猫（2）")) {
		case 1:
			buyDogView();
			break;
		case 2:
			buyCatView();
			break;

		default:
			break;
		}
	}

	/**
	 * 购买cat的流程
	 */
	private void buyCatView() {
		while (true) {
			int love = inputInt("需要多少亲密度的猫咪？(0-100)");
			boolean hasCatLove = petShop.hasCatLove(love);
			if (!hasCatLove) {
				System.out.println("你选择的亲密度本店没有，请重新输入！");
				continue;
			}
			Pet buyCat = petShop.buyCat(love);
			buyCat.show();
			return;
		}
	}

	/**
	 * 购买dog的流程
	 */
	private void buyDogView() {
		while (true) {
			String kind = inputStr("要什么品种的狗？");
			boolean hasDogKind = petShop.hasDogKind(kind);
			if (!hasDogKind) {
				System.out.println("你选择的品种本店没有，请重新输入！");
				continue;
			}
			Pet buyDog = petShop.buyDog(kind);
			buyDog.show();
			return;
		}
	}

	// 输入int方法
	public int inputInt(String tip) {
		System.out.println(tip);
		return sc.nextInt();
	}

	// 输入String方法
	public String inputStr(String tip) {
		System.out.println(tip);
		return sc.next();
	}
}
