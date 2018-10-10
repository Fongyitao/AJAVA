package _09_day_多态;

public class _04_多态利弊 {
    public static void main(String[] args) {
//		_04_Cat c1 = new _04_Cat();
//		c1.eat();
//		c1.catchMouse();

        method(new _04_Cat());
		/*
		猫吃鱼
		抓老鼠
		 */
        System.out.println("-----------------");
        method(new _04_Dog());
		/*
		狗吃肉
		看家
		 */
    }
    public static void method(_04_Animal a) {
        // 关键字，instanceof 判断前面的引用是否是后面的数据类型
        if(a instanceof _04_Cat) {
            _04_Cat c = (_04_Cat)a;
            c.eat();
            c.catchMouse();
        }else if (a instanceof _04_Dog) {
            a.eat();
            ((_04_Dog)a).lookHome();
        }else {
            a.eat();
        }
    }
}

/*
 *A：多态的好处
 *a：提高了代码的维护性（继承保证）
 *b：提高了代码的扩展性（由多态保证）
 *B：案例演示
 *多态的好处
 *可以当做形式参数，可以接收任意子类对象
 *C：多态的弊端
 *不能使用子类的特有属性和行为。
 */

class _04_Animal{
    public void eat() {
        System.out.println("动物吃食物");
    }
}

class _04_Cat extends _04_Animal{
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}
class _04_Dog extends _04_Animal{
    public void eat() {
        System.out.println("狗吃肉");
    }
    public void lookHome() {
        System.out.println("看家");
    }
}
