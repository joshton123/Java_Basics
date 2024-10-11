class ArrayToString {
    public static void main(String[] args) {
        String[] arr = new String[] {"Hi","hello","how","are","you","2","Hi","hello","how","are","you","Hi","hello","how","are","you"};
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}