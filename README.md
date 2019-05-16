# AndroidDemo
一个用于练习技术的APP

## 更新日志
### ·2019.4.11 构建项目结构

    1 . 
    总体结构包括：base（基础类）、core（核心类）、di（定义module和component）、
    modules（各功能模块，如登录、主界面）、utils（工具类）、widget（小插件）

    2 .
    module：模块、组件
    view：视图
    presenter：主持人
    contract：合作，契约
    widget：小工具、部件
    component：组件
    plugin：插件
    observer：观察者
    observable：被观察者
    
    3.
    往GitHub提交空文件夹，需要在文件夹内新建一个.gitkeep文件，然后在.gitignore中取消忽略.gitkeep。
    
    4.
    新建.gitkeep文件的方法：在terminal中，切换到目录下，使用命令 type null>.gitkeep就能生成。
    如果想查看文件夹中隐藏的文件，使用组合键：shift+command+.。
    
    5.
    .gitignore使用规则：
    *.sample 　　 # 忽略所有 .sample 结尾的文件
    !lib.sample 　　 # 但 lib.sample 除外
    /TODO 　　 # 仅仅忽略项目根目录下的 TODO 文件，不包括 subdir/TODO
    build/ 　　 # 忽略 build/ 目录下的所有文件
    doc/*.txt 　　# 会忽略 doc/notes.txt 但不包括 doc/server/arch.txt
    
    参考：https://www.cnblogs.com/zhangxiaoliu/p/6008038.html
