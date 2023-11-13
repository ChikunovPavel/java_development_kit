package lesson3.hw3;


public class Calculitor {




    public static void main(String[] args) {

            Number result;
            result = sum(Integer.valueOf(15), Float.valueOf(29.159f));
            System.out.println("sum = " + result.floatValue());
            result = divide(Double.valueOf(123.456789), Long.valueOf(24));
            System.out.println("divide = "+  result.doubleValue());
            System.out.println("divide = "+  result.longValue());
            result = multiply(Byte.valueOf((byte) 11), Short.valueOf((short) 32000));
            System.out.println("multiply = " + result.intValue());
            result = subtract(Short.valueOf((short) 789), Double.valueOf(1000.4837));
            System.out.println("subtract = " + result.doubleValue());
            System.out.println("subtract = " + result.intValue());
    }





    public static <T extends Number> Number multiply(T num, T num2) {
        return new Number() {
            @Override
            public int intValue() {
                return num.intValue() * num2.intValue();
            }

            @Override
            public long longValue() {
                return num.longValue() * num2.longValue();
            }

            @Override
            public float floatValue() {
                return num.floatValue() * num2.floatValue();
            }

            @Override
            public double doubleValue() {
                return num.doubleValue() * num2.doubleValue();
            }
        };

    }

    public static <T extends Number> Number sum(T num, T num2) {
        return new Number() {
            @Override
            public int intValue() {
                return num.intValue() + num2.intValue();
            }

            @Override
            public long longValue() {
                return num.longValue() + num2.longValue();
            }

            @Override
            public float floatValue() {
                return num.floatValue() + num2.floatValue();
            }

            @Override
            public double doubleValue() {
                return num.doubleValue() + num2.doubleValue();
            }
        };
    }

    public static <T extends Number> Number divide(T num, T num2) {
        return new Number() {
            @Override
            public int intValue() {
                return num.intValue() / num2.intValue();
            }

            @Override
            public long longValue() {
                return num.longValue() / num2.longValue();
            }

            @Override
            public float floatValue() {
                return num.floatValue() / num2.floatValue();
            }

            @Override
            public double doubleValue() {
                return num.doubleValue() / num2.doubleValue();
            }
        };
    }

    static <T extends Number> Number subtract(T num, T num2) {
        return new Number() {

            @Override
            public int intValue() {
                return num.intValue() - num2.intValue();
            }

            @Override
            public long longValue() {
                return num.longValue() - num2.longValue();
            }

            @Override
            public float floatValue() {
                return num.floatValue() - num2.floatValue();
            }

            @Override
            public double doubleValue() {
                return num.doubleValue() - num2.doubleValue();
            }
        };
    }


}

