FROM jetty 
ADD ./target/*.war /var/lib/jetty/webapps/root.war 
EXPOSE 8080
