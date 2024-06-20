package test6.t2;

public abstract class PetImpl implements Pet {
    private String name;
    private int age;
    PetImpl(){
        name="null";
        age=0;
    }
    PetImpl(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){//接口要求
        return name;
    }
    public int getAge(){//接口要求
        return age;
    }

    @Override
    public String toString() {
        return new String(getName()+','+getAge()+'岁');
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof PetImpl){
            PetImpl pet = (PetImpl)obj;
            if(pet.getName().equals(getName())&&pet.getAge()==getAge()){
                return true;
            }
        }
        return false;
    }
}
