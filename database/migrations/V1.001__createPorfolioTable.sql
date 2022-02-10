CREATE TABLE portfolio   (
    id INT AUTO_INCREMENT PRIMARY KEY,
    experience  VARCHAR(255) NOT NULL,
    imagePath  VARCHAR(500) NOT NULL,
    name  VARCHAR(255) NOT NULL,
    twitterUser VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    phone VARCHAR(255)  NOT NULL,
    zipCode VARCHAR(255) NOT NULL
);