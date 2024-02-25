class seven {
    public static void main(String[] args) {
        String a = "Hello World";
        char b = a.charAt(2);
        System.out.println("Third character in Hello World : " + b);

        String c = "Java Programming";
        int d = c.indexOf('o');
        System.out.println("Index of character 'o' in Java Programming : " + d);

        String e = "be honest";
        String f = e.toUpperCase();
        System.out.println("Uppercase of be honest : " + f);

        String g = "hello";
        String h = g.replace('l', 'i');
        System.out.println("After replacing 'l' with 'i' in hello : " + h);
    }
}
