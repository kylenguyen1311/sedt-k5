package lesson6;

public class TestSpeed extends Animal {
    public static void main(String[] args) {
        TestSpeed ts = new TestSpeed();
        int dog_speed = Animal.DOG_SPEED();
        int tiger_speed = Animal.TIGER_SPEED();
        int horse_speed = Animal.HORSE_SPEED();
        int winner_Speed;
        String winner_Name;
        winner_Speed = ts.speedComparison(dog_speed, tiger_speed, horse_speed);
        if (winner_Speed == dog_speed) winner_Name = dog.defaultName();
        else if (winner_Speed == tiger_speed) winner_Name = tiger.defaultName();
        else winner_Name = horse.defaultName();
        ts.printResult(winner_Name, winner_Speed);
    }

    protected int speedComparison(int a, int b, int c) {
        int max;
        if (a > b)
            max = a;
        else max = Math.max(b, c);
        return max;
    }

    protected void printResult(String a, int b) {
        System.out.println("The winner is " + a + " with speed " + b);
    }
}
