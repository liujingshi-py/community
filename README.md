##码匠社区

##资料
[Spring文档](https://spring.io/guides)

[Spring Web](https://spring.io/guides/gs/serving-web-content/)

[Spring文档](https://docs.github.com/cn/developers/apps/creating-an-oauth-app)

[Bootstrap](https://v3.bootcss.com)

##工具

[Git](https://git-scm.com/downloads)

[Flyway](https://flywaydb.org/documentation/getstarted/firststeps/maven)

[Lombok](https://projectlombok.org/setup/maven)

##脚本
```sql
create table USER
(
    ID         INT auto_increment,
    ACCOUNT_ID VARCHAR(128),
    NAME       VARCHAR(64),
    TOKEN      CHAR(50),
    GMT_CREATE BIGINT,
    MODIFIED   BIGINT,
    constraint USER_PK
        primary key (ID)
);

```
```sql
alter table USER
    add bio varchar(256) null ;
```
```bash
mvn flyway:migrate
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```