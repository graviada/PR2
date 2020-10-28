package ru.chalovai.PR14;

public class Shirt {
    private String[] shirt_properties;

    public Shirt(String shirt) {
        shirt_properties = shirt.split(",");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(String str : shirt_properties) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}

