FROM jetty 
ADD Rest_Jetty.war /var/lib/jetty/webapps/root.war 
EXPOSE 8080
