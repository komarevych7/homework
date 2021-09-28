package homework9;

import java.util.Random;

public class Ghost {
    final String[] colors = { "white", "yellow", "purple", "red" };
    private String color;

    public String getColors() {
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index];
    }

    public Ghost () {
        color = getColors();
    }

    public String getColor() {
        return color;
    }
}
