public class Main {
    public static void main(String[] args) {
        String data = "Test";
        System.out.println(reverseString(data));
    }
        public static String reverseString(String s)
        {
            StringBuffer sb=new StringBuffer();
            char[] chars = s.toCharArray();
            for(int i=chars.length-1;i>=0;i--)
            {
                sb.append(chars[i]);
            }
            return sb.toString();
        }
    }
