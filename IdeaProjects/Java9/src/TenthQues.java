public class TenthQues {
    public static void main(String[] args) {
        System.out.println("String methods execution:");
        String str = "How much repetition is too much repetition?";
        System.out.println(str.repeat(2));

        String complexWhitespacesString = "\u2005\u2005\u2005\u2005  This string is stripped. ";
        System.out.println(complexWhitespacesString.strip());
        System.out.println("Is the string blank?");
        System.out.println("\n\u2005   ".isBlank());
        String html =
                "\t<html>\n"+
                        "\t\t<head>\n"+
                        "\t\t\t<body>\n"+
                        "\t\t\t\t<p>Html Text Executed Perfectly</p>\n"+
                        "\t\t\t</body>\n"+
                        "\t\t</head>\n"+
                        "\t<html>";

        System.out.println(html);
        System.out.println("Strip indent of HTML:");
        System.out.println(html.stripIndent());
        System.out.println("Translate Escapes executed: ");
        System.out.println("\"Can you \\n Push me to new line? \"");
        System.out.println("\"Can you \\n Push me to new line? \"".translateEscapes());
        System.out.println("Is the string empty?");
        System.out.println("\n\u2005   ".isEmpty());
        System.out.println("Format and Formatted executed:");
        System.out.println(String.format("Format %s","Executed"));
        System.out.println("Formatted %s".formatted("Executed"));

    }
}


