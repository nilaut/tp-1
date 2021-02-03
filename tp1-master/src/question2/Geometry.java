package question2;

import java.util.Objects;

public class Geometry {
    private String type;
    private String color;

    public static int surface(int a, int b){

        int result= a*b;
        return result;
    }

    public static int perimeter(int a){

        int result= a*4;
        return result;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "Type:" + type
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Geometry geometry = (Geometry) o;
        return Objects.equals(type, geometry.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
