package ui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test {
    public static void main(String[] args) {
        // Đường dẫn tương đối đến thư mục chứa hình ảnh trong cùng một project
//    	String imagePath = "DuLieu\\lock.png";
//
//        // Tải hình ảnh từ tệp trong thư mục tài nguyên của project
//    	ImageIcon icon = new ImageIcon(Test.class.getResource(imagePath));
//    	
    	
    	ImageIcon image = new ImageIcon("DuLieu\\Hinh\\baalBTL.png"); // Specify the path to your image
        

        // Tạo JFrame và JLabel để hiển thị hình ảnh
        JFrame frame = new JFrame();
        JLabel label = new JLabel(image);

        // Thêm JLabel vào JFrame
        frame.getContentPane().add(label);

        // Cấu hình frame và hiển thị nó
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        System.out.println("jsdfksjhdfj");

    }
}
