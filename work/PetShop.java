package work;

import java.util.Random;

public class PetShop {
	private String name;
	private Pet[] pets = new Pet[10];
	private int count = 0;

	public PetShop(String name) {
		this.name = name;
		addPet(new Dog("小黑", "雄", 2, "拉布拉多"));
		addPet(new Cat("莉莉", "母", 4, 80));
		addPet(new Dog("小白", "雌", 1, "中华田园犬"));
		addPet(new Cat("露西", "母", 6, 85));
		addPet(new Dog("andy", "公", 1, "藏獒"));
		addPet(new Cat("默默", "母", 2, 50));
		addPet(new Cat("小强", "公", 8, 89));
		addPet(new Dog("小小", "雄", 2, "拉布拉多"));
		addPet(new Dog("big", "雄", 2, "中华田园犬"));
	}

	// 判断是否有用户输入的品种
	public boolean hasDogKind(String kind) {
		for (Pet pet : pets) {
			if (pet instanceof Dog) {
				Dog d = (Dog) pet;
				boolean equals = d.getKind().equals(kind);
				if (equals) {
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public int size() {
		return count;
	}

	// 进货宠物 private boolean addPet(Pet pet);//私有进货方法。
	private boolean addPet(Pet pet) {
		if (count >= pets.length) {
			return false;
		}
		pets[count] = pet;
		count++;
		return true;
	}

	// 收购宠物 public boolean purchasePet(Pet pet);//公开收购宠物方法，在该方法调用 进货宠物 addPet
	// 方法。
	public boolean purchasePet(Pet pet) {
		return this.addPet(pet);
	}

	// 购买狗的方法
	public Pet buyDog(String kind) {
		int kindNum = 0;
		for (int i = 0; i < pets.length; i++) {
			Pet pet = pets[i];
			if (pet instanceof Dog) {
				Dog d = (Dog) pet;
				boolean equals = d.getKind().equals(kind);
				if (equals) {
					kindNum++;
				}
			}
		}
		int[] kindIndex = new int[kindNum];// 保存符合 kind品种的dog的下标位置
		int k = 0;
		for (int i = 0; i < pets.length; i++) {
			Pet pet = pets[i];
			if (pet instanceof Dog) {
				Dog d = (Dog) pet;
				boolean equals = d.getKind().equals(kind);
				if (equals) {
					kindIndex[k++] = i;
				}
			}
		}
		Random r = new Random();
		int nextInt = r.nextInt(kindIndex.length);
		int i = kindIndex[nextInt];

		Pet result = pets[i];// 确定卖出去的宠物
		capaticyConfirm(i);
		return result;
	}

	// 购买宠物成功后将数组长度减少
	private void capaticyConfirm(int index) {
		// 5 6
		int tag = index;
		while (tag < count - 1) {
			pets[tag] = pets[tag + 1];
			tag++;
		}
		pets[--count] = null;
	}

	// 5. 向顾客展示所有宠物信息 public void showPets()
	public void showPets() {
		for (int i = 0; i < count; i++) {
			pets[i].show();
		}
	}

	// 判断是否有用户要购买的猫
	public boolean hasCatLove(int love) {
		for (Pet pet : pets) {
			if (pet instanceof Cat) {
				Cat c = (Cat) pet;
				boolean equals = love - c.getLove() >= -10 && love - c.getLove() <= 10;
				if (equals) {
					return true;
				}
			}
		}
		return false;

	}

	// 购买猫的方法
	public Pet buyCat(int love) {

		int kindNum = 0;
		for (int i = 0; i < pets.length; i++) {
			Pet pet = pets[i];
			if (pet instanceof Cat) {
				Cat c = (Cat) pet;

				boolean equals = love - c.getLove() >= -10 && love - c.getLove() <= 10;
				if (equals) {
					kindNum++;
				}
			}
		}
		int[] kindIndex = new int[kindNum];// 保存符合 love的cat的下标位置
		int k = 0;
		for (int i = 0; i < pets.length; i++) {
			Pet pet = pets[i];
			if (pet instanceof Cat) {
				Cat c = (Cat) pet;
				boolean equals = love - c.getLove() >= -10 && love - c.getLove() <= 10;
				if (equals) {
					kindIndex[k++] = i;
				}
			}
		}

		Random r = new Random();
		int nextInt = r.nextInt(kindIndex.length);
		int i = kindIndex[nextInt];

		Pet result = pets[i];// 确定卖出去的宠物
		capaticyConfirm(i);
		return result;
	}

}
