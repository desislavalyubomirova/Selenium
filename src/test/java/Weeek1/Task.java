package Weeek1;

public class Task {
    public static void main(String[] args) {
        String rawText = "INFORMATION\n" +
                        "Sitemap\n" +
                        "Shipping & Returns\n" +
                        "Privacy Notice\n" +
                        "Conditions of Use\n" +
                        "About us\n" +
                        "Contact us";


        String[] rawText2 = rawText.split("Conditions");
        String secndPartText = rawText2[1];
       // String rawPart = secndPartText.split("of Use");
       // String raw

    }
}
