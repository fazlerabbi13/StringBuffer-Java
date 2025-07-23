public class Insert {
    public static void main(String[] args) {

        String string = "Fa";
        StringBuffer sb = new StringBuffer(string);

        sb.insert(2, "zle");

        System.out.println(sb);

    }
}
