package HW6_Сat;

public class Cat {

    private String name;
    private  int appetit;

    private int satiety;

    public Cat(String name, Integer appetit){
        this.name = name;
        this.appetit =appetit;
        satiety =0;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate){
        int maxEat = appetit-(satiety*appetit/100);
        if(satiety==100){
            return;
        } else if (plate.getPlateFood()>maxEat) {
            plate.decreaseFood(maxEat);
            satiety =100;
        } else {
//            System.out.println((plate.getPlateFood()*100/appetit));
            satiety += (plate.getPlateFood()*100/appetit)  ;
            plate.decreaseFood(plate.getPlateFood());

        }
    }

    @Override
    public String toString() {
        return name + " аппетит=" + appetit + " cытость=" + satiety +"%";
    }
}
