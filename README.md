# Программа телепередач 
Отображение на веб-странице списка телевизионных каналов.
При нажатии на любой из каналов отображется телепрограмма для выбранного канала. 
Есть возможность добавлять новые телепередачи для конкретного канала, указывая время и название. 
Также предусмотрено удаление телепередачи для выбранного канала. И изменение времени или названия выбранной передачи для конкретного канала.



# Запуск
Для запуская поребуется: - Tomcat8
* Остановите Tomcat. 
* Скопируйте файл WAR из TVprogs/target/ в место установки Tomcat "c:/Tomcat8/webapps". 
* Запустите Tomcat, в строкe браузера вставьте http://localhost:8080/TVprog/.

# Built With
- Java 8
- Spring
- Maven
