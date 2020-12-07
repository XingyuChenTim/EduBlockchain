# EduBlockchain
  The EduBlockchain is a web application of blockchain which could assist the future blockchain related curriculum.
  
  
## Introduction
 
In recent years, Blockchain technology is growing very fast and there is tons of complex information about Blockchain but there is no clear guideline application for amateurs to learn from this new technology. According to Professor Chen’s requirement, our team needs to build a web based simulation which relates to blockchain technology. 

This application has been used for educational purposes to help students understand the basic structure of blockchain and why it can be considered as decentralized systems.More specifically, the web application should offer several efficient functions of query and storing information that include user’s data and blocked data. 

Developing such web applications and having hands-on practice in such an environment should stimulate students’ interests of learning and exploring fundamentals of blockchain technology, especially for future CS undergrad students who are interested in blockchain-related studies. 


## Basic architecture
![Logical decomposition diagram](./image/ArcSke.png)
Description:
1. **Definition:**   
   A simple visual interpretation of what core technologies exist inside of blockchain in the operational environment. It contains the Animation section which consists of three    root theories of the blockchain system to give basic understanding of the blockchain like what is the decentralized systems; how a mis-use case can tamper system integrity;    why do we need smart contracts. 
2. **Student:**   
   The main executor in the application environment. The users can get access to the application through creating a new student account in the system. Also, users can initiate    Cryptocurrency Simulator to get familiar with blockchain technology ,check Major Transactions to review all transactions’ details and explore Animations to further              understand blockchain definitions.  
3. **Simulator:**  
   A users’ interface to provide concrete operational methods on blockchain implementation. It lets users go through the block structure in a proper way, and it also offers a      mining platform, which uses SHA256 cryptography algorithm to compute the hashrate of current block header, to support users to get experience on the real world mining work.    Furthermore, handling the blockchain transactions in a more technical view through the Trade interface. 
4. **Log:**   
   A middleware to support both Admin’s and Student’s functionalities. Log diagram strictly separates the accessibility of students and administrators. Students’ accounts only    have a read privilege to the system information, but administrators have more privilege (not including the remove and add privilege) of the system log like verify and revise    the users’ transactions at a specific moment. (In this case, we haven’t applied the full function of decentralized system because the users might be intentionally or            inadvertently to compromise the system log, but we specify a time period to constrain modifications on blockchain) 
5. **Admin:**  
   The main function of manipulating the system environment. It can handle multiple threads simultaneously. The Admin has authority to CRUD (create, read, update, delete) these    functions mainly for Animation function and Transaction function. Additionally, they can verify and revise scripts or databases related to corresponding functions such as      Trend Chart Script for user history framework and data tamper showcase for explaining potential drawbacks to cryptocurrency using blockchain. 
   
## Usage

 <!--**Prerequirement:**  
 * Step 1: Connect to your UNO vpn through DUO-factor authentication.
 * Step 2: Open any favorite browser and type the URL.
 * Step 3: Using the URL (unomahablockchain.ddns.net) to access the project web application
 * Step 4: Waitting the server response for a while  
 * Step 5: If the server doesn't response or the webpage shows the error message, please inform the system admin to start the server. (In current stage, server is closed)-->
 **Installation**
   1. Install Node.js with NPM as the below url. 
      [How to intall Node.js and NPM](https://phoenixnap.com/kb/install-node-js-npm-on-windows)
   2. After the download and configuration, verifying Node.js version and Npm status to make sure both have been installed correctly. (The verify command is also listed in           above URL
   3. Download the Zipped code by using the **Code** button in the right corner and unzip it
      
   4. Or Using the git clone command: 
      ```
      git clone https://github.com/fire-holder/EduBlockchain.git
      ```
   5. After you get the Edublockchain folder, open the folder inside of Visual Studio to compile and generate a new executable.jar file and store it in your /Desktop. For             example you can run beneath command to generate .jar in Visual Studio's terminal
      ``` 
      cd YOUR_PROJECT_DIRECTORY // locate the project directory
      mvn package // Using Maven to generate .jar file
      cd target // Direct to the /target folder, the .jar file will be there. 
      ```
      The .jar file ought to look like:  
      ![JAR](image/GenJAR.PNG)  
      
   6. Open Powershell and direct to the the .jar file location, then run the following command (Make sure your JDK and JRE have the most recent version like version 11).
      ```
      java -jar YOUR_EXECUTABLE_FILE_NAME.jar
      ``` 
   7. Then you can open a web browser (e.g. Google Chrome) and type the following command in the URL box
       ```
       http://localhost:8080
       ```
   8. If you want to enjoy the functions in the user page, you have to create four tables in your local database:
       ```
       The first table is called user: for user login in and register. Make sure you have at least one user in the table
       ![](/image/UserTableconfi.png)  
       ```
       
   9. The jar file above is already configured, so if you want to try the functions in the user page, make sure you configure the database and password:
       ```
       
       ```
       
       
## User Interface

 **Educational Blockchain:**
   1. _Home Page_: Start page  
      ![](/image/Home.png)  
   2. _Login page_: By using user's registered credential  
      ![](/image/Signin.png)  
   3. _Register page_ : Double check password    
      ![](/image/Register.png)  
   4. _Hashrate Exploration page_: Generating hashcode based on user's input  
      ![](/image/Hash.png)  
   5. _Blocks Components page_: Multiple functions can be executed in this page  
      * Overview of block structure  
        ![Overview](/image/Block1.png)  
      * How does the block head looks like in every block  
        ![Block Header Structure](/image/Block2.png)  
      * How to initiate a transaction between different users  
        ![Transaction](/image/Block3.png)  
   6. Userpage: home page after user login in
        ![](/image/userpage.png)  
   7. Tokenpage: Token table for user check wallet balance
        ![](/image/tokenview.png)  
   8. Broadcast function: User broadcast a request for bitcoin
        ![](/image/broadcast.png)  
   9. Transactionpoll function: check if there is a pending transaction need to be mined
        ![](/image/transactionpolll)  
   10. Mining function: Mining block and get reward because of PoW
        ![](/image/Mining.png)  
   11. Blockexplorer function: search specific block based on hash id
        ![](/image/blockexplorer.png) 
        ![](/image/blockexplorerresult.png)  
      
 **Simulation of Real World Blockchain:**  
 
   1. _Introduction Page_: Home  
      ![](/image/Intro.PNG)  
   2. _Hash Function Practice Page_: User can practice and compare the result of hash based on same input 
      ![](/image/Hashbox.png)  
   3. _Block Practice Page_ : it gives user some information about the block to help them understand the structure of a block header,user can modify the content of one block;   
      ![](/image/Block.png)  
   4. _Blockchain Practice Page_: based on previous block page, we connect different blocks together to form a chain. Even a minor change in a block will make the rest of              connected blocks become invalid.  
      ![](/image/Chain1.png)  
   5. _Transaction Page_: it shows how users' transactions can be recorded into the blockchain.
      ![](/image/Transaction.PNG)
   6. _Decentralized Page_: it demonstrates that every user in the blockchain system will have to store a copy of original blockchain into their local storage, and everyone's 
       local copy of the blockchain is exactly the same. 
      ![](/image/Decentralized.PNG)
   7. _Public key Generation Page_: this page elaborates the real case of how Bitcoin can generate each user's public key based on the private key, and it also includes an            external link to let users explore the algorithm of generating key pairs
      ![](/image/KeyGen.PNG)
   8. _User Payment Hash Page_: since every transaction in the Blockchain network should be signed to protect the integrity and confidentiality, user has to create an unique
       Payment hash while he/she tries to initiate transactions by using his/her own public key. After the new Payment hash has been create, users can verify if the current 
       Payment hash is generated from a specific users public key. 
      ![](/image/PayVerify.PNG)
   9. _Transaction Verify Page_: In the real world Blockchain network, people will normally put the transaction detail along with their public key to generate a Transaction
       Hash to let the other users verify the authenticity of every transaction.
      ![](/image/TransVerify.PNG)
   10. _Mining Page_: this page is used for simulating the real world mining work, and modification inside of each block will cause a deviation of block authenticity. 
      ![](/image/Mining.PNG)

## License
MIT  
JQuery  
Pug  
JSON  
SpringBoot  


## Release Update - Milestone 1 - October 4, 2020
1. **Spring Boot:**  
   webController: postmapping and getmapping.   
   UserRepository: insert/select user info to database.  
   createTransactionRepository: insert transaction info to database.  
   UserForm: Entity for user variables of username, password, and wallet.  
   createTransactionForm: Entity for transaction variabel of sender_addr, receiver_addr, amount, hashid.  
   Application Properties: directories for data source, JPA, and thymeleaf.  
2. **CSS + JS + HTML5:**  
   Home/User: Bootstrap, web interface.  
   Sign/Register: user authentication.  
   SHA256: hash rate function to encrypt data.  
   Block: Jquery.js, show what is a block looks like in the Bitcoin World.  
   Transaction: Payment prototype.  
3. **Test + Documentation:**  
   Home, Sign, Register, User, ProjectApplication, Application Properties;     
   webController, UserRepository, createTransactionRepository;  
   UserForm, createTransactionForm;  
   SHA256, Block, Transaction.  
   
## Release Update - Milestone 2 - October 22, 2020
1. **Database structure modified:**  
   Blockchain table: store all block, each row represent one block.   
   User table: store user information and user’s private key.   
   Token table: User’s token for wallet balance.   
   History table: User’s transaction history for trade trend plot.   
   Transaction poll table: Pending transaction that need to be mined.   
2. **Mining function (not integrated with database):**       
   BlockChain.java: main driver for mining.   
   Block.java: block structure and mining function with difficulty.   
   StringUtil.java: SHA256.      
3. **Broadcast function :**      
   Broadcast html and css: user view to input transaction detail.   
   Broadcast form, repository, and controller: backend to process transaction and store into database.   
4. **Pug Simulation by Zexi:**    
   Index with video page.       
   Hash simulation page.     
   Block simulation page.   
   Blockchain simulation page.        
   
## Release Update - Milestone 3 - November 10, 2020
1. **Database structure by Xingyu:**  
   User table.   
   Token table.   
   History table.  
   Blockchain table.   
   Transactionpoll table.   
2. **Mining function by Xingyu:**       
   Miningpendng function.   
   Miningreware function.   
   Database table updated.  
3. **Token table function by Bishwo and Xingyu:**      
   Tokenform.java.    
   TokenMapper.java.   
   token.html. 
4. **Broadcast function by Bishwo and Xingyu:**    
   Sender removed. 
   Hashid generated function updated.  
   Token table function. 
5. **Pug Simulation function by Zexi :**    
   Transaction.    
   Decentralization.  
   Mining. 
6. **Documentation Github Page by Yimin:**    
   WebController.   
   Pollform.   
   PollMapper.   
   
## Release Update - Milestone 4 - November 24, 2020 
1. **Mining function by Xingyu:**       
   Miningpendng function.     
   Miningreward function.     
   Database table updated.     
2. **Transactionpoll function fix by Xingyu:**      
   Getting pending transaction from database.   
3. **Block Explorer function by Bishwo:**    
   Block view function.   
   Card view function.   
4. **Pug Simulation function by Zexi :**    
   Fix Mining function.   
   Private-Public key function.  
   Verify payment function.  
5. **Testing and Documentation by Yimin:**    
   All application except PUG application.    
   
   
## Release Update - Milestone 5 - December 11, 2020      
1. **User Page by Bishwo:**         
   Update description to each function.       
   Update css for user page.      
2. **Readme by Xingyu:**   
   Update install instructions.   
   Update User interface.    
3. **Final presentation:**      
   https://drive.google.com/file/d/1Mpd2a8T2sYyXNOqsr8ZXanKgwatWW9kX/view?usp=sharing.      
4. **Final report:**     
   https://drive.google.com/file/d/1OVp4pR-gwjoQ-Sk7jZEgKyYkUqfSZaYl/view?usp=sharing.      
