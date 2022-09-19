package Homework.module7;

class NameParser {
    public String parse(String[] names) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < names.length; i++) {
            String firstName = names[i].split(" ")[0];

            result.append(firstName);
            if (i != names.length - 1) {
                result.append(", ");
            }
        }

        return String.valueOf(result);
    }
}

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}
