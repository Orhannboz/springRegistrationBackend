In this project ive created a registration application and code the backend with Java, Spring BOOT, JPA, maildev, Spring Security.

User sends a Post request to "api/v1/registration" with his name, mail and password, after that the application creates a ConfirmationToken for that user.
Both User and ConfirmationToken is a table in database, ive use H2 in memory database wich one of the spring features, you can reference my code and use a MySQL, or POSTGRESQL
it is up to your Preferences, just change the application properties.
After Token is created application sends mail to the users mail with this link "api/v1/registration?token=" + Token for that user. if the user sends a GET request
For the created link in 15 minitues after the mail sended, AppUser enable paramater for that user becomes true and user can access with his password and e-mail,
i didnt add any thing to acess so user gets 404 after login.



Example post request and mail;

![image](https://user-images.githubusercontent.com/97806354/160252522-fa5e6351-45e0-4298-b8cf-e4e9bf0f2b8d.png)
![image](https://user-images.githubusercontent.com/97806354/160252541-38cc94d7-0f8d-4867-bc6b-6b5f20107c25.png)
