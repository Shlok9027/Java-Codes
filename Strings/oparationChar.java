package Strings;

public class oparationChar {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Home");
        // System.out.println(sb);

        // //to insert the character

        // sb.insert(2, 'o');
        // System.out.println(sb);

        // //to delete the character

        // sb.delete(2, 3);
        // System.out.println(sb);

        // append ( its mean to add some char on string ) the character

        StringBuilder sb = new StringBuilder("R");
        sb.append("E"); //str = str + E
        sb.append("D"); //str = str + D
        sb.append("M"); //str = str + M
        sb.append("I"); //str = str + I

        System.out.println(sb);
        System.out.println(sb.length()); // To find of the string

    }
}