public class Delete {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello world");

        sb.delete(1, 3);

        System.out.println(sb);
    }
}
