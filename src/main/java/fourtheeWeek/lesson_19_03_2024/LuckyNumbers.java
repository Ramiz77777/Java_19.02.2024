package fourtheeWeek.lesson_19_03_2024;

public class LuckyNumbers {
    int counter = 0;
    private int luckyNum1;
    private int luckyNum2;
    private int luckyNum3;
    private int luckyNum4;
    private int luckyNum5;

    public LuckyNumbers() {

        this.luckyNum1 =  (int) (1 + Math.random() * (50 - 1 + 1));
        this.luckyNum2 = (int) (1 + Math.random() * (50 - 1 + 1));
        this.luckyNum3 = (int) (1 + Math.random() * (50 - 1 + 1));
        this.luckyNum4 = (int) (1 + Math.random() * (50 - 1 + 1));
        this.luckyNum5 = (int) (1 + Math.random() * (50 - 1 + 1));
    }

    public int getLuckyNum1() {
        return luckyNum1;
    }

    public int getLuckyNum2() {
        return luckyNum2;
    }

    public int getLuckyNum3() {
        return luckyNum3;
    }

    public int getLuckyNum4() {
        return luckyNum4;
    }

    public int getLuckyNum5() {
        return luckyNum5;
    }

    public void printNumbers(){

        System.out.println("lucky Number is " + luckyNum1);
        System.out.println("lucky Number is " + luckyNum2);
        System.out.println("lucky Number is " + luckyNum3);
        System.out.println("lucky Number is " + luckyNum4);
        System.out.println("lucky Number is " + luckyNum5);
    }
}
