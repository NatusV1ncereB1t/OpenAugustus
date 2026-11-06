# OpenAugustus
Augustus Deobf
Look Releases
不是完整Deobf 有问题请提交Issue

Augustus 构建说明

准备环境

在 Windows 64 位系统下安装 JDK 8、JDK 17 和 Python 3.9 以上版本。JDK 17 用来编译主要代码，JDK 8 用来编译启动部分和检查运行兼容性。两个 Java 都选 JDK，安装目录里要有 javac.exe。

官方下载地址

JDK 8
https://adoptium.net/temurin/releases/?version=8&os=windows&arch=x64

JDK 17
https://adoptium.net/temurin/releases/?version=17&os=windows&arch=x64

Python
https://www.python.org/downloads/windows/

开始构建

解压完整的 source.zip，保留 src、lib、build-inputs 和 tools。这份工程的依赖已经带齐，不需要另外安装 Maven、Gradle 或去混淆工具。

在包含 build.ps1 的目录打开 PowerShell。先设置 Java 路径，再执行构建和校验。下面的路径是示例，换成自己的安装位置就行。

$env:JDK17_HOME = 'E:\Java\jdk17'
$env:JAVA8_HOME = 'E:\Java\jdk8'
powershell.exe -ExecutionPolicy Bypass -File .\build.ps1 -PythonPath 'E:\Python\python.exe'
powershell.exe -ExecutionPolicy Bypass -File .\verify.ps1 -PythonPath 'E:\Python\python.exe'

看到 BUILD PASSED 和 VERIFY PASSED 就完成了，生成的客户端在 dist/Augustus-source-development.jar。

遇到问题

找不到 javac.exe，先检查装的是不是 JDK，以及 Java 路径是否指向安装根目录。

编译时内存不足，可以在 build.ps1 那条命令末尾加上 -Jobs 1。

提示缺少分片或哈希不匹配，重新解压完整源码包，别混用其他版本的依赖。构建报错的具体原因可以在 build/run-*/logs 里查看。
