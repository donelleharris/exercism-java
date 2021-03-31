class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        char[] number = (numberToCheck + "").toCharArray();
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            sum += Math.pow(num, number.length);
        }
        return numberToCheck == sum;
    }

}
