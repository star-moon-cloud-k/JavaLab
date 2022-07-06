package intermediate;

public enum J038_type {
//    public enum J38{
        PHYSICAL(23),    EMOTIONAL(28),    INTELLECTUAL(33);
        private final int peiValue;

        J038_type(int pie) {
            this.peiValue = pie;
        }

        public int getPei() {
            return peiValue;
        }
    }

    enum FRUIT {
        APPLE, BANANA, MANGO
    }






