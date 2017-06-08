public class AppendFinalStringBuilder {
    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder("SB");
        String sb0 = sb.toString();
        sb.append("2");

        System.out.println(sb.toString()); //SB2. so, the value is changed, but cannot be reassigned.
        
    }
}