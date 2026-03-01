# 📌 Spring Boot + MyBatis 게시판 프로젝트

Spring Boot, MyBatis, Thymeleaf를 활용하여 기본적인 CRUD 기능과 파일 업로드 및 다중 파일 업로드 기능을 포함한 게시판 프로젝트입니다.

---

# 🛠 개발환경

* IntelliJ IDEA Community Edition 2025
* Amazon Corretto 21
* Spring Boot 3.5.11
* MySQL Community Server 8.0
* MyBatis Framework
* Thymeleaf

---

# 📦 Dependencies

## 기본

* **Spring Web**
  → MVC 패턴 기반 웹 애플리케이션 구현

* **Lombok**
  → Getter, Setter 등 반복 코드 제거

* **Spring Boot DevTools**
  → 코드 수정 시 자동 서버 재시작

## DB 연동

* **MyBatis Framework**
  → SQL 기반 데이터 매핑

* **MySQL Driver**
  → MySQL 데이터베이스 연결

---

# 📚 주요 기능

* 게시글 작성 (Create)
* 게시글 목록 조회 (Read List)
* 게시글 상세 조회 및 조회수 증가 (Read Detail)
* 게시글 수정 (Update)
* 게시글 삭제 (Delete)
* 파일 첨부
* 다중 파일 첨부
* MyBatis 기반 DB 연동

---

# 🧱 프로젝트 구조

```
src
 ├─ main
 │   ├─ java
 │   │   ├─ controller
 │   │   ├─ service
 │   │   ├─ repository
 │   │   ├─ dto
 │   │   └─ config
 │   │
 │   └─ resources
 │       ├─ mapper
 │       ├─ templates
 │       └─ application.yml
```

---

# 🗄 Database Schema

## board_table

```sql
DROP TABLE IF EXISTS board_table;

CREATE TABLE board_table
(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    boardTitle VARCHAR(50),
    boardWriter VARCHAR(20),
    boardPass VARCHAR(20),
    boardContents VARCHAR(500),
    boardHits INT DEFAULT 0,
    createdAt DATETIME DEFAULT NOW(),
    fileAttached INT DEFAULT 0
);
```

## board_file_table

```sql
DROP TABLE IF EXISTS board_file_table;

CREATE TABLE board_file_table
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    originalFileName VARCHAR(100),
    storedFileName VARCHAR(100),
    boardId BIGINT,
    CONSTRAINT fk_board_file
    FOREIGN KEY(boardId)
    REFERENCES board_table(id)
    ON DELETE CASCADE
);
```

---

# ⚙ 구현 과정

1. 프로젝트 세팅
2. 시작 페이지 출력 및 DevTools 적용
3. DTO, Service, Repository 작성
4. 게시글 작성 화면 구현
5. Controller에서 게시글 데이터 처리
6. MyBatis 설정
7. 게시글 DB 저장 기능 구현
8. 게시글 목록 조회 기능 구현
9. 게시글 상세 조회 및 조회수 처리
10. 게시글 수정 기능 구현
11. 게시글 삭제 기능 구현
12. 파일 첨부 기능 구현
13. 파일 조회 기능 구현
14. 다중 파일 첨부 기능 구현

---

# ▶ 실행 방법

저장소 클론

```
https://github.com/lhjwork/spring_board/tree/main
```

MySQL DB 생성

```sql
CREATE DATABASE board_db;
```

프로젝트 실행

```
./gradlew bootRun
```

또는 IntelliJ에서 Run 실행

---

# 🧑‍💻 기술 스택

* Java 21
* Spring Boot
* MyBatis
* MySQL
* Thymeleaf
* Lombok

---

# 📄 목적

Spring Boot와 MyBatis 기반 웹 애플리케이션 구조 이해 및 CRUD, 파일 업로드 기능 구현 학습을 위한 프로젝트입니다.
