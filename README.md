# 深入浅出 Gradle Plugin


1. buildSrc 
2. 独立工程

## 简单的插件例子

```groovy
class GreetingPluginExtension {

    String message = 'Hello from GreetingPlugin extension'

    String greeter = "Gradle"
}

class GreetingPlugin implements Plugin<Project> {

    @Override
    void apply(Project target) {

       def extension = target.extensions.create('greeting', GreetingPluginExtension)

        target.task("hello") {
            doLast {
                println  "${extension.message} from ${extension.greeter}"
            }
        }
    }
}

apply plugin: GreetingPlugin
// ./gradlew -q hello

greeting {
    message = "Hi,"
    greeter = "程序亦非猿"
}
```

执行`./gradlew -q hello` 就可以看到输出`Hi, from 程序亦非猿`。


