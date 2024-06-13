package test6.t2;

import test6.t1.*;

public class PetShop {
    private LinkedList pets = new LinkedList(); //用链表保存宠物信息

    //将宠物pet上架，即添加到链表中
    public void add(Pet pet) {                  //新宠物上架操作，以接口对象为参数
        if (!isDuplicate(pet)) {
            pets.add(pet);
        } else {
            System.out.println("禁止添加");
        }
    }

    //从宠物商店下架宠物pet，即从链表中查找并删除。若删除成功，返回true；否则，返回false
    public boolean delete(Pet pet) {              //宠物下架操作，以接口对象为参数
        return pets.remove(pet);
    }

    //查找第index个宠物。若找到，返回该宠物的引用，若找不到，返回null
    public Pet get(int index) {             //pets.get()返回Node节点，Node节点的getData()返回Object，该Object就是Pet
        if (pets.get(index) == null) {
            return null;
        } else {
            return (Pet) (pets.get(index).getDate());
        }
    }

    //返回宠物总数
    public int size() {
        return pets.size();
    }

    public boolean isDuplicate(Pet pet) {
        Node temp = pets.head();
        while (temp != null) {
            Pet existingPet = (Pet) temp.getDate();
            if (existingPet.getName().equals(pet.getName()) && existingPet.getAge() == pet.getAge()) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }
}