# maven3
通过idea 创建maven工程 远程发布WAR到aliyun的Tomcat上的步骤

  1、配置tomcat-users.xml
          
          role manager-gui manager-script
          user admin(远程发布) root(后台登录)
  
  2、配置manager.xml
  
  3、通过idea创建maven web 工程
  
          idea--create new project--maven--选择骨架
          --webapp(第二个)--demo
          
          补充maven工程结构 src pom.xml
          
          StudentDaoImpl StudentDaoImplTest
          
          补充pom.xml里面的插件
          
                <build>
                <finalName>maven-demo</finalName>
                <plugins>
                  <plugin>
                    <groupId>org.apache.tomcat.maven</groupId>
                    <artifactId>tomcat7-maven-plugin</artifactId>
                    <version>2.2</version>
                    <configuration>
                      <!--远程Tomcat的ip地址和端口号，注意远程Tomcat需要启动-->
                      <url>http://47.100.244.98:8080/manager/text</url>
                      <username>admin</username>
                      <password>admin123</password>
                      <update>true</update>
                      <path>/My_Web</path>
                    </configuration>
                  </plugin>
                </plugins>
              </build>
     4、通过idea面板（maven projects --demo--plugin--tomcat7--tomcat:deploy）
          
