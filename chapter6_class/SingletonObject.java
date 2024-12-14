package chapter6_class;

class SingletonObject {
    private static SingletonObject instance;
    private SingletonObject() {}
    static SingletonObject getInstance(){
        return instance;
    }
}
