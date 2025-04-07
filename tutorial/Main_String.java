public class Main_String {
    public static void main(String[] args) {
        String str = "  Hello Java World!  ";
        String str2 = "hello java world!";

        System.out.println("Original String: \"" + str + "\"\n");

        // Length
        System.out.println("Length: " + str.length());

        // charAt
        System.out.println("charAt(6): " + str.charAt(6));

        // substring
        System.out.println("substring(2, 7): \"" + str.substring(2, 7) + "\"");

        // toLowerCase and toUpperCase
        System.out.println("toLowerCase(): \"" + str.toLowerCase() + "\"");
        System.out.println("toUpperCase(): \"" + str.toUpperCase() + "\"");

        // trim
        System.out.println("trim(): \"" + str.trim() + "\"");

        // equals and equalsIgnoreCase
        System.out.println("equals(str2): " + str.equals(str2));
        System.out.println("equalsIgnoreCase(str2): " + str.equalsIgnoreCase(str2));

        // compareTo
        System.out.println("compareTo(str2): " + str.compareTo(str2));

        // startsWith / endsWith
        System.out.println("startsWith(\"  He\"): " + str.startsWith("  He"));
        System.out.println("endsWith(\"ld!  \"): " + str.endsWith("ld!  "));

        // contains
        System.out.println("contains(\"Java\"): " + str.contains("Java"));

        // indexOf / lastIndexOf
        System.out.println("indexOf(\"a\"): " + str.indexOf("a"));
        System.out.println("lastIndexOf(\"a\"): " + str.lastIndexOf("a"));

        // replace
        System.out.println("replace(\"Java\", \"Python\"): \"" + str.replace("Java", "Python") + "\"");

        // isEmpty / isBlank
        String emptyStr = "";
        String blankStr = "   ";
        System.out.println("isEmpty(\"\"): " + emptyStr.isEmpty());
        System.out.println("isBlank(\"   \"): " + blankStr.isBlank());

        // split
        String[] words = str.trim().split(" ");
        System.out.println("split():");
        for (String word : words) {
            System.out.println("- " + word);
        }

        // join
        String joined = String.join(" | ", words);
        System.out.println("join(\" | \", words): " + joined);

        // repeat
        System.out.println("repeat(3): " + "Hi! ".repeat(3));

        // format
        String formatted = String.format("I have %d apples and %.2f rupees.", 5, 23.5);
        System.out.println("format(): " + formatted);
    }
}
