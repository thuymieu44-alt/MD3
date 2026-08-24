public class ex5 {
    public static void main(String[] args) {

        // Test với String
        long startString = System.currentTimeMillis();
        StringBuilder str = new StringBuilder("Hello");
        for (int i = 0; i < 1_000_000; i++) {
            str.append(" World");
        }
        long endString = System.currentTimeMillis();
        System.out.println("Thời gian thực hiện với String: " + (endString - startString) + " ms");

        // Test với StringBuilder
        long startBuilder = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < 1_000_000; i++) {
            sb.append(" World");
        }
        long endBuilder = System.currentTimeMillis();
        System.out.println("Thời gian thực hiện với StringBuilder: " + (endBuilder - startBuilder) + " ms");

        // Test với StringBuffer
        long startBuffer = System.currentTimeMillis();
        StringBuffer sf = new StringBuffer("Hello");
        for (int i = 0; i < 1_000_000; i++) {
            sf.append(" World");
        }
        long endBuffer = System.currentTimeMillis();
        System.out.println("Thời gian thực hiện với StringBuffer: " + (endBuffer - startBuffer) + " ms");
    }
}

