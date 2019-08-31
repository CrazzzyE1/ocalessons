package com.ocalessons.lesson5;

public class ConstructorsAndMethods {
    public void start (){
        Cars car1 = new Cars("red", "V12");
        BankAccount bankAccount1 = new BankAccount(1, 102.5);
        Human human = new Human("Petr", car1, bankAccount1);
        info(human);
        bankAccount1.popolneniu(200.0);
        info(human);
        bankAccount1.snyatie(205);
        info(human);

        }

        public void info(Human human) {
            System.out.println("Name is " + human.name + ", \nCar's color is " + human.car.color +
                    ", \nEngine is " + human.car.engine + " \nBA balance is " + human.bankAccount.balance);
        }


}
