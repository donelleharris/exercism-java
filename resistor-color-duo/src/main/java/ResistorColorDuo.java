class ResistorColorDuo {
    String [] colorArray = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    
    int value(String[] colors) {
        int code = -1;
        StringBuilder colorCode = new StringBuilder();
        for(int i = 0; i < colors.length; i++){
            for(int j = 0; j < colorArray.length; j++)
            if(colorArray[j] == colors[i]) colorCode.append(Integer.toString(j));
        }
        
        return code;
    }
}
