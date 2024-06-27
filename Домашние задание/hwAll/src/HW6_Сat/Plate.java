package HW6_Сat;

public class Plate {

    private int food;
    public Plate(int food) {
        if(food<0){
            throw new IllegalArgumentException("food must be positive");
        }
        this.food = food;
    }
    public int getPlateFood(){
        return food;
    }

    public void increaseFood (int food){
        if(food>0){
            this.food+=food;
        }
    }

    public boolean decreaseFood(int food){
        if(this.food>= food){
            this.food-=food;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Количество еды в тарелке= " + food;
    }
}

