import java.util.Scanner;

public class Ex5 {

    public static String intMap (int number){
        switch (number) {
            case 1:
                return "một";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bốn";
            case 5:
                return "năm";
            case 6:
                return "sáu";
            case 7:
                return "bảy";
            case 8:
                return "tám";
            case 9:
                return "chín";
            default:
                return "";
        }
    }

    public static void main(String[] args) throws Exception{
        // Khai báo biến
        Scanner scanner = new Scanner(System.in);
        int input, hundreds, tens, units;
        String finalResult = "";

        // Nhập thông tin
        System.out.print("Nhập số nguyên dương có 3 chữ số: ");
        input = Integer.parseInt(scanner.nextLine());

        if(input < 100 || input > 999) {
            System.out.println("Số nhập vào không hợp lệ.");

        } else {
            hundreds = input / 100;
            tens = (input - (hundreds * 100)) / 10;
            units = input - (hundreds * 100) - (tens * 10);

            if(hundreds != 0){
                finalResult = intMap(hundreds) + " trăm ";
            }

            switch (tens) {
                case 0:
                    finalResult = finalResult + "lẻ " + intMap(units);
                    break;
                case 1:
                    if (units == 5) {
                        finalResult = finalResult + "mười lăm";
                    } else {
                        finalResult = finalResult + "mười " + intMap(units);
                    }
                    break;
                default:
                    switch (units) {
                        case 1:
                            finalResult = finalResult + intMap(tens) + " mươi mốt";
                            break;
                        case 5:
                            finalResult = finalResult + intMap(tens) + " mươi lăm";
                            break;
                        default:
                            finalResult = finalResult + intMap(tens) + " mươi " + intMap(units);
                            break;
                    }
                    break;
            }

            finalResult = finalResult.substring(0,1).toUpperCase() + finalResult.substring(1);
            System.out.println(finalResult);

        }
    }
}
