# java-bacend

### jsp-servlet-jdbc
### apache-maven-v3.6.0
### apache-tomcat-v8.5.34
### java 8


# jdbc-advanced

### getConnection: kết nối DB
### statement: thực thi SQL (không hỗ trợ truyền tham số)
### PreparedStatement: Thực thi SQL (hỗ trợ chuyền tham số)
### setParameter: tham số (nếu có)
### resultSet: nhận kết quả sau khi query()
### mapper: chuyển kết quả từ resultSet sang ArrayList bằng cách lặp qua từng hàng trong Table database (while(resultSet.next()))
### finally: getConnection,statement,resultSet "close()"