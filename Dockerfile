FROM jetty 
ADD *.war /var/lib/jetty/webapps/root.war 
EXPOSE 8080
