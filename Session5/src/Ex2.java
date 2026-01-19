public class Ex2 {
    public static void main(String[] args) {
        long str1Start, str1Time, str2Start, str2Time,str3Start, str3Time;
        String str1 = "Hello";
        StringBuilder str2 = new StringBuilder("Hello");
        StringBuffer str3 = new StringBuffer("Hello");

        str1Start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str1 = str1 + " World";
        }
        str1Time = System.currentTimeMillis() - str1Start;
        System.out.println("Thời gian thực hiện với String: " + str1Time + " ms.");

        str2Start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str2 = str2.append(" World");
        }
        str2Time = System.currentTimeMillis() - str2Start;
        System.out.println("Thời gian thực hiện với StringBuilder: " + str2Time + " ms.");
    
        str3Start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str3 = str3.append(" World");
        }
        str3Time = System.currentTimeMillis() - str3Start;
        System.out.println("Thời gian thực hiện với StringBuffer: " + str3Time + " ms.");

        System.out.println("Nhận xét:");
        System.out.println(" - String có thời gian thực hiện rất lớn do mỗi lần nối chuỗi đều tạo ra đối tượng mới, gây tốn bộ nhớ và thời gian xử lý.");
        System.out.println(" - StringBuilder cho hiệu năng tốt nhất, phù hợp cho các thao tác nối chuỗi trong môi trường đơn luồng.");
        System.out.println(" - StringBuffer chậm hơn StringBuilder do có cơ chế đồng bộ hóa, nhưng đảm bảo an toàn trong môi trường đa luồng.");
    }
}
