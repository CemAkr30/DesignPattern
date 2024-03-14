package structural.adapterDP.adapter;

public class main {
    public static void main(String[] args) {
        String deger = "3x + 12 = 46";
        System.out.println(MC(deger));
    }

    public static String MC(String str) {
        String question = str;
        String questionTri = question.replaceAll(" ", "");
        String[] number = questionTri.split("=");
        String firstPlace = number[0];
        String secondPlace = number[1];
        Long secondPlaceLong = Long.parseLong(secondPlace);
        String[] firstPlaceSplit = firstPlace.split("\\+");
        String x = firstPlaceSplit[0];
        String y = firstPlaceSplit[1];

        Long yLong = Long.parseLong(y);
        Long result = secondPlaceLong + (yLong * -1);
        String notX = x.replace("x", "");
        String xFin = result.toString();
        xFin = xFin.replace(notX, "");
        return xFin;
    }
}
