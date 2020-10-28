package ru.chalovai.PR14;

public class Telephone {
    StringBuilder sb = new StringBuilder();

    Telephone(String telephone) {
        //Для России
        if (telephone.charAt(0) == '8') {
            sb.append("+<").append("7").append("><").append(telephone.substring(1,4)).append(">-<").append(telephone.substring(4,7)).append(">-<").append(telephone.substring(7,11)).append(">");
        }
        //Остального мира
        else if (telephone.charAt(0) == '+') {
            String ten = telephone.substring(telephone.length() - 10, telephone.length());
            String code = telephone.substring(1, telephone.length() - 10);
            sb.append("+<").append(code).append("><").append(ten.substring(0,3)).append(">-<").append(ten.substring(3,6)).append(">-<").append(ten.substring(6,10)).append(">");
        }
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
