package session18;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.Scanner;

public class ProductManagement {
    public void addProduct(Scanner scanner) {
        Product product = new Product();
        product.inputData(scanner);

        try(Connection conn = ConnectionDB.getConnection()) {
            CallableStatement cs = conn.prepareCall("{call insert_product(?, ?, ?, ?, ?, ?)}");

            cs.setString(1, product.getName());
            cs.setDouble(2, product.getPrice());
            cs.setString(3, product.getTitle());
            cs.setDate(4, Date.valueOf(product.getCreated()));
            cs.setString(5, product.getCatalog());
            cs.setInt(6, product.getStatus());
            cs.execute();

            System.out.println("Sản phẩm đã được thêm thành công!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void displayProducts() {
        try(Connection conn = ConnectionDB.getConnection()) {
            CallableStatement cs = conn.prepareCall("{call list_product()}");
            ResultSet rs = cs.executeQuery();

            System.out.println("Danh sách sản phẩm:");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(String.format("|%-5s|%-50s|%-10s|%-50s|%-12s|%-20s|%-5s|", "ID", "Name", "Price", "Title", "Created", "Catalog", "Stat"));
            Product product = new Product();
            while (rs.next()) {
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                product.setTitle(rs.getString("title"));
                product.setCreated(rs.getDate("created").toLocalDate());
                product.setCatalog(rs.getString("catalog"));
                product.setStatus(rs.getInt("status"));

                System.out.println(product);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void updateProduct(Scanner scanner) {
        int id;
        while (true) {
            try {
            System.out.print("Nhập ID sản phẩm cần cập nhật: ");
            id = Integer.parseInt(scanner.nextLine());  
            break;
            } catch (IllegalArgumentException e) {
                System.out.println("ID sản phẩm không hợp lệ!");
                continue;
            }
        }

        try(Connection conn = ConnectionDB.getConnection()) {
            CallableStatement cs = conn.prepareCall("{call get_product_by_id(?)}");
            cs.setInt(1, id);
            ResultSet rs = cs.executeQuery();
            
            Product product = new Product();
            if (rs.next()) {
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                product.setTitle(rs.getString("title"));
                product.setCreated(rs.getDate("created").toLocalDate());
                product.setCatalog(rs.getString("catalog"));
                product.setStatus(rs.getInt("status"));
            } else {
                System.out.println("Không tìm thấy sản phẩm có ID: " + id);
                return;
            }

            System.out.println("Thông tin sản phẩm hiện tại:");
            System.out.println(product);

            System.out.println("\nNhập thông tin mới cho sản phẩm:");
            product.inputData(scanner);

            cs = conn.prepareCall("{call update_product(?, ?, ?, ?, ?, ?, ?)}");

            cs.setInt(1, id);
            cs.setString(2, product.getName());
            cs.setDouble(3, product.getPrice());
            cs.setString(4, product.getTitle());
            cs.setDate(5, Date.valueOf(product.getCreated()));
            cs.setString(6, product.getCatalog());
            cs.setInt(7, product.getStatus());
            cs.execute();

            System.out.println("Sản phẩm đã được cập nhật thành công!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void deleteProduct(Scanner scanner) {
        int id;
        while (true) {
            try {
            System.out.print("Nhập ID sản phẩm cần xóa: ");
            id = Integer.parseInt(scanner.nextLine());  
            break;
            } catch (IllegalArgumentException e) {
                System.out.println("ID sản phẩm không hợp lệ!");
                continue;
            }
        }

        try(Connection conn = ConnectionDB.getConnection()) {
            CallableStatement cs = conn.prepareCall("{call delete_product(?)}");
            cs.setInt(1, id);
            cs.execute();

            System.out.println("Sản phẩm đã được xóa thành công!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void searchProductsByName(Scanner scanner) {
        String keyword;
        while (true) {
            System.out.print("Nhập tên sản phẩm cần tìm kiếm: ");
            keyword = scanner.nextLine();
            if (!keyword.trim().isEmpty()) {
                break;
            }
            System.out.println("Tên sản phẩm không được để trống!");
        }

        try(Connection conn = ConnectionDB.getConnection()) {
            CallableStatement cs = conn.prepareCall("{call search_product_by_name(?)}");
            cs.setString(1, keyword);
            ResultSet rs = cs.executeQuery();

            System.out.println("Sản phẩm tìm kiếm theo tên: " + keyword);
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(String.format("%-5s|%-50s|%-10s|%-50s|%-12s|%-20s|%-5s|", "ID", "Name", "Price", "Title", "Created", "Catalog", "Stat"));
            Product product = new Product();
            while (rs.next()) {
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                product.setTitle(rs.getString("title"));
                product.setCreated(rs.getDate("created").toLocalDate());
                product.setCatalog(rs.getString("catalog"));
                product.setStatus(rs.getInt("status"));

                System.out.println(product);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void sortProductsByPrice() {
        try(Connection conn = ConnectionDB.getConnection()) {
            CallableStatement cs = conn.prepareCall("{call sort_product_by_price(?)}");
            cs.setBoolean(1, true); // Sort ascending
            ResultSet rs = cs.executeQuery();

            Product product = new Product();
            while (rs.next()) {
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                product.setTitle(rs.getString("title"));
                product.setCreated(rs.getDate("created").toLocalDate());
                product.setCatalog(rs.getString("catalog"));
                product.setStatus(rs.getInt("status"));

                System.out.println(product);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void catalogStatistic() {
        try(Connection conn = ConnectionDB.getConnection()) {
            CallableStatement cs = conn.prepareCall("{call catalog_statistic()}");
            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                String catalog = rs.getString("catalog");
                int count = rs.getInt("count");
                System.out.println("Danh mục: " + catalog + " - Số lượng sản phẩm: " + count);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
