/*
 * 一、Java里的包是什么？
 * 
 * Java里的包其实就是其它语言里的命名空间，比如Dart和Swift里就有命名空间，但是OC里没有命名空间。
 * 
 * Java里包的本质其实就是文件夹、文件夹、文件夹！！！既然是文件夹，那就必然会存在嵌套，所以包会有大小之分，比如
 * 左边的“_04_包”是一个大包，这个包里有一个类Main，而“_04_包.package1”也是一个包，只不过这个包小一点，这个小
 * 包里有一个类Dog。
 */

/*
 * 二、那Java里的包有什么作用呢？即为什么要存在呢?
 * 
 * 1、既然包就是文件夹，那你想一下平常我们用文件夹不就是对文件进行分门别类的整理、看起来清晰一点嘛，所以Java里
 * 包的第一个作用就是对我们项目里所有的类进行分类、使得项目目录看起来更加清晰有条理，实际开发中我们不会将任何一
 * 个类直接放在src目录下，都会把它们放在相应的包里
 * 2、包的第二个作用就是解决命名冲突，也就是说同一个项目里不同的文件夹下——即不同的包里——可以有相同名字的类，比
 * 方说我们下面两个包里就都定义了一个叫Dog的类，是没问题的。回忆一下OC项目里是没法写同名的类的，即便这两个同名的类不在同一个文件夹下，因为OC里既没有包也没有命名空间的概念，所
 * 以只要靠加前缀来解决这个问题
 * 3、访问控制
 */

/*
 * 三、那我们怎么创建一个包呢？创建包的时候又有那些规范呢？
 * 
 * 1、首先src下有个默认的包——(default package)，这个包其实是个假包，你看它使用括号括起来的，也就是说这个包里面
 * 的类其实是直接存储在src文件夹下的，src文件夹下并不会有一个(default package)这样的文件夹来存储那些类
 * 2、创建包很简单，我们只需要在src目录下，new一个package就可以了
 * 3、Java里包的命名规范，即文件夹的命名规范（我这个学习的包名是为了好看历史记录瞎起的，不符合规范）：
 * 	（1）因为我们写的代码有可能复用到别的地方，甚至开源给别人使用，所以包名最好具有唯一性，不然跟别人的包名重复了，里面
 * 恰好又有重名的类，那就真得会冲突了，所以一般建议包名以公司的域名倒写开头 + 模块名，比如：com.baidu.model、com.baidu.view
 *	（2）注意要全小写、全小写、全小写！！！不要出现驼峰，看到那个baidu了吗？即便是两个单词也直接连着小写就行
 */



// 每个类里面的第一句代码都必须得是：用package来声明当前类属于哪个包。绝对不能少，也不能放在其它代码后面
package _04包;

/*
 * 当我们想使用某个类的时候，就得先导入这个类
 * 当然如果你嫌一个一个类导入麻烦，那也可以用.*一下子把整个包全部导入，那这个包下所有的类也就都导进来了，不过关于这一点我们需要注意：
 * import _04包.*;仅仅会把当前包里面的类都导进来，而不会把当前包里面小包里面的类都导进来
 */
//import _04包.package1.Dog;
//import _04包.package1.Cat;
import _04包.package1.*;
/*
 * 此外我们可能还会遇到这样的场景，那就是导入了两个包，这两个包里有重名的类，那使用的时候肯定会有歧义，怎么办呢？
 * 
 * 这种情况就没办法了，只能一个类简写，其它所有的类都必须在前面加上一长串的包名了。因为Java里不能像Dart里那样as：
 * 
 * import _04包.package1.Dog as package1;
 * import _04包.package2.Dog as package2;
 */
import _04包.package2.Dog;
/*
 * 此外我们可以关注一个import的细节，为了方便，Java编译器会为每个源文件自动导入两个包：
 * 1、“import java.lang.*;”：我们使用的很多数据类型就都在这个包里，比方说String等，既然这些数据类型经常使用，所以编译器索性给咱们默认导入了
 * 2、“import 当前源文件所在的包”：你会发现在这个文件里竟然没导入Test类也可以直接使用，就是因为编译器默认导入了当前源文件所在的包
 */
//import java.lang.*;
//import _04包.*;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		_04包.package2.Dog dog2 = new _04包.package2.Dog();
		
		String name = "张三";
		
		Test test = new Test();
	}
}
