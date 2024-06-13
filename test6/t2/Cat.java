package test6.t2;

public class Cat implements Pet {
    private String name;
    private int age;

    //创建Cat类的实例，其名字为name，年龄为age
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //覆写Object中的equals()方法。判断猫类的两个对象值是否相等
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            return name.equals(cat.getName()) && age == cat.getAge();
        }
        return false;
    }

    //覆写Object中的方法。返回猫的完整信息
    @Override
    public String toString() {
        return getName() + "   " + getAge() + "岁";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}