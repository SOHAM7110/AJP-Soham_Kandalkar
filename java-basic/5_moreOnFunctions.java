// rename your .java file to Object.java
// file_name == class_name
class object {
    /*
     * WAP to calculate following things:
     * a. sum of three numbers
     * b. area of circle
     */

    public void sum(float a, float b, float c) {
        float sum = a + b + c;
        System.out.println("sum = " + sum);
    }

    public void area(double rad) {
        double area = 3.14 * rad * rad;
        // for float : use 3.14f
        System.out.println("area = " + area);
    }

    public static void main(String[] args) {
        object sum1 = new object();
        sum1.sum(2, 6, 4);

        object area1 = new object();
        area1.area(2);
    }
}
