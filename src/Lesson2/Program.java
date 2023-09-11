package Lesson2;

public class Program {

    public static void main(String[] args) {
        Cat[] allCats = new Cat[3];
        allCats[0] = new Cat("Василий", 30, false);
        allCats[1] = new Cat("Борис", 40, false);
        allCats[2] = new Cat("Семен", 35, false);

        Plate plate = new Plate(100);

        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].satiety == false && allCats[i].appetite < plate.food) {
                allCats[i].eat(plate);
                allCats[i].satiety = true;
                System.out.println("Кот " + allCats[i].name + " поел");
            } else {
                System.out.println("Коту " + allCats[i].name + " не хватило еды");
            }
        }
    }
}
