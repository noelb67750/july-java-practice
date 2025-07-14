public class GETTERPRACTICE {
    public static void main(String[] args) {
        Weightlifter joe = new Weightlifter();
        joe.setName("Joe");
        System.out.println(joe.getName());
    }

    static class Weightlifter {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}