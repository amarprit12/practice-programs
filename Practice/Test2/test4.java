package Practice.Test2;

public class test4 {
    public static void main(String[] args) {
        String s1 = "for";
//        String s1 = "practice";
        String s2 = "geeksforgeeks";

        checkSubString(s1, s2);
    }

//    private static void checkSubString(String s1, String s2) {
//        int index = -1;
//        for (int i = 0; i < s2.length(); i++) {
//            if (s2.indexOf(s1) != -1) {
//                index = s2.indexOf(s1);
//                break;
//            } else {
//                index = -1;
//            }
//        }
//        System.out.println(index);
//    }

    private static void checkSubString(String s1, String s2) {
        int index = -1;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.contains(s1)) {
                index = s2.indexOf(s1);
                break;
            }
        }
        System.out.println(index);
    }
}

