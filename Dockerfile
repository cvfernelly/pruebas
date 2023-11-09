FROM debian
RUN apt-get update && apt-get install -y nginx vim

RUN rm /etc/nginx/sites-enabled/default
ADD ficheros/curso.conf /etc/nginx/conf.d/curso.conf
ADD ficheros/index.html /var/www/curso/index.html
ADD ficheros/styles.css /var/www/curso/styles.css

EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
