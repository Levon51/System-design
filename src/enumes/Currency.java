package enumes;

public enum Currency {
    AMD {
        public void interest(int amount) {
            double a = 2.87;
            double interest = amount * a / 100;
            System.out.println("The AMD interest is: " + interest);
        }
    },
    EUR {
        public void interest(int amount) {
            double a = 3.00;
            double interest = amount * a / 100;
            System.out.println("The AMD interest : " + interest);
        }
    },
    USD {
        public void interest(int amount) {
            double a = 4.76;
            double interest = amount * a / 100;
            System.out.println("The AMD interest : " + interest);
        }
    },
    RUB {
        public void interest(int amount) {
            double a = 2;
            double interest = amount * a / 100;
            System.out.println("The AMD interest : " + interest);
        }
    };

}
