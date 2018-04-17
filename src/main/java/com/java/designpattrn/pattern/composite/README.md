# Composite Pattern

组合模式

组合模式也叫合成模式，优势又叫部分-整体模式，主要是用来描述部分与整体的关系。
将对象组合成树形结构以表示“部分-整体”的层次结构，使得用户对单个对象和组合对象的使用具有一致性。

三个角色：  
1、Component抽象构件角色：定义参加组合对象的共有方法和属性，默认的行为或属性；  
2、Leaf叶子构件：叶子对象，其下没有其他分支，遍历的最小单位；  
3、Composite树枝构件：树枝对象，组合树枝节点和叶子节点形成一个树形结构。

优点：  
1、高层模块调用简单：一棵树形结构中的所有节点都是Component，局部和整体对调用者来说没有区别；  
2、节点自由增加：容易扩展，符合开闭原则。

缺点：不是很符合面向接口编程，与依赖倒置原则冲突。

使用场景：  
1、维护和展示部分-整体关系的场景，如树形菜单，文件和文件夹管理；  
2、从一个整体中能够独立出部分模块或功能的场景。

注意事项：只要是树形结构，就要考虑使用组合模式。


透明模式，见ex5。好处是遵循了依赖倒置原则，方便系统进行扩展。