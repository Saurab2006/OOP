package Tutorial;

abstract class Task3 {
    abstract void getRectangleArea(int length, int breadth);
    abstract void getSquareArea(int length);
    abstract void getCircleArea(int radius);
}

class Area extends Task3 {
    
    @Override
    void getRectangleArea(int length, int breadth) {
        System.out.println(length * breadth);
    }

    @Override
    void getSquareArea(int length) {
        System.out.println(length * length);
    }

    @Override
    void getCircleArea(int radius) {
        System.out.println(3.14 * radius * radius);
    }
}