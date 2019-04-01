public class AssertExample {
    public static void main(String[] args) {
        /**
         * args is not null for ever, so assert output assertion error: args must be null
         */
        assert args == null : "args must be null";
    }
}
