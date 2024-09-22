import java.awt.*;

public class Square extends Rectangle {

    /*
    * Lớp Square:

Không có thêm thuộc tính nào so với lớp cha.

Không có phương thức khởi tạo nào sử dụng đối số dầu vào width và length, thay vào đó là đối số side.

Phương thức khởi tạo mà không cần đối số đầu vào sẽ đặt giá trị mặc định cho width và height (side) là 1.0.

Có getter và setter cho side.

Cài đè phương thức setWidth và getWidth để chúng thay đổi giá trị của cả width và height, để bảo toàn tính “vuông”.

Được cài đè phương thức toString trả về chuỗi ký tự theo mẫu "A Square with side=xxx, which is a subclass of yyy".
* Trong đó yyy là kết quả thực thi từ phương thức toString của lớp Rectangle.

Có cần phải cài đè phương thức getArea và getPerimeter không?*/
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    @Override
    public String toString() {
        return "Square{} " + super.toString();
    }
}
