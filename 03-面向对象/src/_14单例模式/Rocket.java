package _14单例模式;

/**
 * 饿汉式单例模式，不存在线程安全问题，推荐使用
 * @author yiyi
 *
 */
public class Rocket {
	/*
	 * 第二步：定义一个私有的（因为我们不希望外界直接访问这个单例对象，而是通过我们提供的方法访问）、静态的（保证单例的不死性）单例对象属性
	 */
	private static Rocket instance = new Rocket();
	
	/*
	 * 第一步：构造方法私有化（保证单例的唯一型)
	 * 目的是为了禁止外界直接调用构造方法创建单例对象，而只能通过我们提供的方法来创建单例对象
	 */
	private Rocket() {}
	
	/*
	 * 第三步：提供一个公开的（因为外界要使用）、静态的（因为不需要创建单例对象就得能调用）获取单例对象的方法给外界，返回单例对象
	 * 
	 * 经过第一步和第二步就可以保证单例的唯一和不死性了
	 */
	public static Rocket getInstance() {
		return instance;
	}
}

/**
 * 懒汉式单例模式，存在线程安全问题，不推荐使用
 * @author yiyi
 *
 */
//public class Rocket {
//	private static Rocket instance;
//	private Rocket() {}
//	public static Rocket getInstance() {
//		/*
//		 * 存在线程安全问题，但是加锁解锁肯定需要开销，所以性能没有饿汉式高
//		 */
//		if (instance == null) {
//			instance = new Rocket();
//		}
//		return instance;
//	}
//}
