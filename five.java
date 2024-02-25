class five {
    public static void main(String[] args) {
        String dmeo = "Java Programming";

        int length = dmeo.length();
        System.out.println("Length of the string: " + length);

        String lastFiveChars = dmeo.substring(length - 5);
        System.out.println("Last five characters: " + lastFiveChars);

    }
}
