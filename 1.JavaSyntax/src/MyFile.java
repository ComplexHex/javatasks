class MyFile {

    public static void main(String[] args) {
        System.out.println(isGreaterThan("f", "asd"));
    }

    public static boolean isGreaterThan(String a, String b) {

        return a.compareTo(b) > 0;


    }

}
