class Darts {
    private double distance;

    Darts(double x, double y) {
        distance = Math.sqrt((x * x) + (y * y));
    }

    int score() {
        if (distance > 5 && distance <= 10) {
            return 1;
        } else if(distance <= 5 && distance > 1){
            return 5;
        } else if(distance <= 1){
            return 10;
        } else return 0;
    }

}
