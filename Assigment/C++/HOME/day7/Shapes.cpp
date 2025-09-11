#include <iostream>
using namespace std;

// Base class
class Shape {
public:
    virtual float area() = 0;   
    virtual void display() = 0; 
    // virtual ~Shape() {}
};

class Circle : public Shape {
    float pi = 3.14;
    int r;
public:
    Circle(int d);
    float area() override {
        return pi * r * r;
    }
    void display() override {
        cout << "Area of Circle: " << area() << endl;
    }
};
Circle::Circle(int d) {
    r = d;
}
class Triangle : public Shape {
    int b, h;
public:
    Triangle(int base, int height);
    float area() {
        return 0.5f * b * h;
    }
    void display() override {
        cout << "Area of Triangle: " << area() << endl;
    }
};
Triangle:: Triangle(int base, int height){
    b = base;
    h = height;     
}

// Main program
int main() {
    Shape *obj;

    Circle c(10);
    obj = &c;
    obj->display();

    Triangle t(5, 8);
    obj = &t;
    obj->display();

    return 0;
}
