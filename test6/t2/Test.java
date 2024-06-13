package test6.t2;

public class Test {
    public static void main(String[] args) {
        System.out.println("---------------1---------------");
        //1
        // 定义一个宠物商店类变量shop，并实例化
        PetShop shop = new PetShop();
        System.out.println(shop.size());
        System.out.println(shop.get(0));
        System.out.println(shop.delete(null));
        System.out.println("---------------2---------------");
        //2
        //在宠物商店shop中添加1岁的“波斯猫”
        //在宠物商店shop中添加2岁的“橘猫”
        //在宠物商店shop中添加1岁的“折耳猫”
        //在宠物商店shop中添加1岁的“柯基犬”
        //在宠物商店shop中添加2岁的“波尔多”
        shop.add(new Cat("波斯猫", 1));
        shop.add(new Cat("橘猫", 2));
        shop.add(new Cat("折耳猫", 1));
        shop.add(new Dog("柯基犬", 1));
        shop.add(new Dog("波尔多狗", 2));
        shop.add(new Dog("波尔多狗", 2));
        shop.add(new Cat("波尔多狗", 2));
        System.out.println(shop.size());
        System.out.println(shop.get(0).toString());
        System.out.println(shop.get(1).toString());
        System.out.println(shop.get(2).toString());
        System.out.println(shop.get(3).toString());
        System.out.println(shop.get(4).toString());
        System.out.println("---------------3---------------");
        //3
        //删除宠物商店shop中2岁的“橘猫”
        System.out.println(shop.delete(new Cat("橘猫", 1)));
        System.out.println(shop.size());
        System.out.println(shop.get(1).toString());
        System.out.println("---------------4---------------");
        //4
        //删除宠物商店shop中1岁的“波斯猫”
        System.out.println(shop.delete(new Cat("波斯猫", 1)));
        System.out.println(shop.size());
        System.out.println(shop.get(2).toString());
    }
}