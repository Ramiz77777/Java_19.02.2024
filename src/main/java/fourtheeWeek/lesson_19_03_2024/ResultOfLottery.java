package fourtheeWeek.lesson_19_03_2024;

public class ResultOfLottery {
    public void finalResultOfLottery(){
        LuckyNumbers luckyNumbers = new LuckyNumbers();
        luckyNumbers.printNumbers();
        ScannerClass scannerClass = new ScannerClass();
        scannerClass.inputData();
        if(luckyNumbers.getLuckyNum1() == scannerClass.getUserNum1() ||
                luckyNumbers.getLuckyNum1() == scannerClass.getUserNum2() ||
                luckyNumbers.getLuckyNum1() == scannerClass.getUserNum3() ||
                luckyNumbers.getLuckyNum1() == scannerClass.getUserNum4() ||
                luckyNumbers.getLuckyNum1() == scannerClass.getUserNum5() ||
                luckyNumbers.getLuckyNum2() == scannerClass.getUserNum2() ||
                luckyNumbers.getLuckyNum2() == scannerClass.getUserNum3() ||
                luckyNumbers.getLuckyNum2()  == scannerClass.getUserNum4() ||
                luckyNumbers.getLuckyNum2()  == scannerClass.getUserNum5() ||
                luckyNumbers.getLuckyNum3() == scannerClass.getUserNum3() ||
                luckyNumbers.getLuckyNum3() == scannerClass.getUserNum4() ||
                luckyNumbers.getLuckyNum3() == scannerClass.getUserNum5() ||
                luckyNumbers.getLuckyNum4() == scannerClass.getUserNum4() ||
                luckyNumbers.getLuckyNum4() == scannerClass.getUserNum5() ||
                luckyNumbers.getLuckyNum5() == scannerClass.getUserNum5()) {
            System.out.println("viigrishiniye nomera est");
        }
        else {
            System.out.println("viigrishnix nomerov net");
        }
    }
}
