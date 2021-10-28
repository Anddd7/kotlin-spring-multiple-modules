### idea-gradle-module

- 可独立启动、测试
- 共享gradle的配置 (multiple project configuration)
- `./gradlew bootRun` 只启动root项目
- `./gradlew idea-gradle-module:bootRun` 只启动下属项目
- `./gradlew test` 会跑所有子module(无论是否在dependencies中)

### crafted-gradle-module

- 可独立启动、测试
- 共享gradle的配置 (multiple project configuration)
- `./gradlew bootRun` 只启动root项目
- `./gradlew idea-gradle-module:bootRun` 只启动下属项目
- `./gradlew test` 会跑所有子module(无论是否在dependencies中)
- 代码会放到同一个classpath下执行
    - controller会直接生效
    - 主项目同名class会覆盖子项目/jar
    - 主项目同名配置文件会覆盖子项目/jar
- 非`@SpringBootApplication`路径下的Bean不会被自动加载(Spring的默认行为)
- classpath下存在多个`@SpringBootApplication`时，测试需要指定启动类


