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