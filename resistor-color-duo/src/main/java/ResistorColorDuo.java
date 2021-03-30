import java.util.Arrays;

class ResistorColorDuo {
    String [] colorArray = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    
    int value(String[] colors) {
        String code = "";
        
        for(int i = 0; i < colorArray.length; i++){
            if(colorArray[i].equals(colors[0])) code = Integer.toString(i);
        }
        for(int i = 0; i < colorArray.length; i++){
            if(colorArray[i].equals(colors[1])) code += Integer.toString(i);
        }
        
        return Integer.parseInt(code);
    }
}
