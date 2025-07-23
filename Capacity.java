public class Capacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        System.out.println(sb);

        sb.append("Hello");

        System.out.println(sb.capacity());

        sb.append("i will be in 1% club");

        System.out.println(sb.capacity());
    }
}
