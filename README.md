idea-gradle-module
- 可独立启动、测试
- 共享gradle的配置 (multiple project configuration)
- `./gradlew bootRun` 只启动root项目
- `./gradlew idea-gradle-module:bootRun` 只启动下属项目


crafted-gradle-module
- 可独立启动、测试
- 共享gradle的配置 (multiple project configuration)
- 代码会放到同一个classpath下执行
  - controller会直接生效
  - 主项目同名class会覆盖子项目/jar
  - 主项目同名配置文件会覆盖子项目/jar
- `./gradlew bootRun` 只启动root项目
- `./gradlew idea-gradle-module:bootRun` 只启动下属项目

