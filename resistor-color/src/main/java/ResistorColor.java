class ResistorColor {
    String [] colorArray = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        int code = -1;
        for(int i = 0; i < colorArray.length; i++){
            if(colorArray[i] == color) code = i;
        }
        return code;
    }

    String[] colors() {
        return colorArray;
    }
}
